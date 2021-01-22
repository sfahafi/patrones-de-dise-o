package structure.bridge;

public class ListaVineta extends ListaBase{
    private char tipoVineta;
    
    public void setTipoItemI(char nuevoTipo){
        if(nuevoTipo>' '){
            tipoVineta=nuevoTipo;
        }else{
            tipoVineta='+';
        }
    }
    
    public String obtenerItem(int index){
        return tipoVineta+" "+super.obtenerItem(index);
    }
    
}
