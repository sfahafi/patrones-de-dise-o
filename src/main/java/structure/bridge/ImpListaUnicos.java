package structure.bridge;

import java.util.ArrayList;
import java.util.List;

public class ImpListaUnicos implements I_ImpLista {

    private List<String> listaItems = new ArrayList<String>();

    @Override
    public void addItem(String item) {
        if (!listaItems.contains(item)) {
            listaItems.add(item);
        }
    }

    @Override
    public void remItem(String item) {
        if (listaItems.contains(item)) {
            listaItems.remove(item);
        }
    }

    @Override
    public int getCantidadDeItems() {
        return listaItems.size();
    }

    @Override
    public String getItem(int index) {
        if (index < listaItems.size()) {
            return listaItems.get(index);
        }
        return null;
    }

    @Override
    public boolean soportaRepetidos() {
        return false;
    }
}
