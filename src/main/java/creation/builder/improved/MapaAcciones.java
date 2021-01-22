package creation.builder.improved;

import java.util.HashMap;
import java.util.Map;

public class MapaAcciones {
    //Se definen en un mapa la lista de acciones disponibles
    public static Map<String,String> getMap(){
        Map<String,String> mapa=new HashMap();
        mapa.put("Ingredientes", "getIngredientes");
        mapa.put("Armar", "armar");
        mapa.put("Revisar", "revisar");
        return mapa;
    }
}
