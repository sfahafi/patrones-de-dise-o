package behavior.memento;

import java.util.ArrayList;

public class Memento {
    private ArrayList<ArrayList<Registro>> backup;

    public Memento() {
        backup=new ArrayList<ArrayList<Registro>>();
    }
    
    public void setBackup(ArrayList<Registro> bd){
        ArrayList<Registro> lista=new ArrayList<Registro>();
        bd.forEach(lista::add);
        backup.add(lista);
    }
    
    public ArrayList<Registro> getBackup(int i){
        return backup.get(i);
    }
    
    public int getSize(){
        return backup.size();
    }
   
}
