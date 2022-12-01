import java.util.HashMap;


public class HashTableADT {
    HashMap<String, String> MiHashMap;
    public HashTableADT (int table_size){
        MiHashMap = new HashMap<>();
    }

    public void add(String key, String value){
        MiHashMap.put(key, value);
    }

    public String valueOf(String key){
        return MiHashMap.get(key);
    }

    public void remove( String key){
        MiHashMap.remove(key);

    }

   public static void main(String[] args) {
       HashTableADT equipo = new HashTableADT(4);
       equipo.add("DPS","Razor" );
       equipo.add("SubDPS","Xiao");
       equipo.add("Support","Kazuha");
       equipo.add("Healer","Bennett");
       System.out.println("Mi DPS es:" + equipo.valueOf("DPS") );
       System.out.println("Voy a cambiar mi DPS para no ser furra");
       equipo.add("DPS","Itto");
       System.out.println("Mi DPS es:" + equipo.valueOf("DPS") );
   }

}
