import java.util.HashMap;
import java.util.Map;

public class MapImplementation {


public static void main(String args[]){
        Map<String,String> map=new HashMap<>();
        map.put("Lovedeep","IT");
        map.put("Dev","Testing");
        map.put("Tye","CEO");
    System.out.println(map);
    System.out.println("Traversing the map");
    for(String str:map.keySet())
    {
        System.out.println("Key is :"+str +" and value is "+map.get(str));
    }

    //using entryset

    System.out.println( map.containsKey(("Lovedeep")));
    System.out.println(map);

    for(Map.Entry<String,String> entry:map.entrySet()) {
        System.out.println("key is :"+ entry.getKey()+ " value is "+entry.getValue());
    }



}


}
