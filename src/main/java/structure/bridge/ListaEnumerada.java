package structure.bridge;

public class ListaEnumerada extends ListaBase{
    
    @Override
    public String obtenerItem(int index){
        return (index+1)+"."+super.obtenerItem(index);
    }
}
