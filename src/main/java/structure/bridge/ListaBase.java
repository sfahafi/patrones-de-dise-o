package structure.bridge;

public class ListaBase {
    
    protected I_ImpLista implementacion;
    
    public void setImplementacion(I_ImpLista impl){
        this.implementacion=impl;
    }
    
    public void agregarItem(String item){
        this.implementacion.addItem(item);
    }
    
    public void removerItem(String Item){
        this.implementacion.remItem(Item);
    }

    public int cuentaItems(){
        return this.implementacion.getCantidadDeItems();
    }
    
    public String obtenerItem(int index){
        return implementacion.getItem(index);
    }
}
