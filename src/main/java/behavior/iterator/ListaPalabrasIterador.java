package behavior.iterator;

public class ListaPalabrasIterador implements Iterador {

    private String palabra1, palabra2, palabra3, palabra4, palabra5;
    private int posicion;

    public ListaPalabrasIterador(String palabra1, String palabra2, String palabra3, String palabra4, String palabra5) {
        this.palabra1 = palabra1;
        this.palabra2 = palabra2;
        this.palabra3 = palabra3;
        this.palabra4 = palabra4;
        this.palabra5 = palabra5;
        this.posicion = 0;
    }

    @Override
    public Object siguiente() {
        switch (posicion++) {
            case 0:
                return palabra1;
            case 1:
                return palabra2;
            case 2:
                return palabra3;
            case 3:
                return palabra4;
            case 4:
                return palabra5;
        }
        return null;
    }

    @Override
    public boolean tieneSiguiente() {
        if (posicion < 5) {
            return true;
        } else {
            return false;
        }
    }

}
