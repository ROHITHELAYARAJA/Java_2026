import  java.util.*;
public class Hashmap {
    static void main() {
        HashMap<String,Integer> map = new HashMap<>();
        System.out.println(map);
        map.put("Rohith",1);
        map.put("Aizen",2);
        map.put("Prasad",3);


        System.out.println(map);
        System.out.println(map.size());

        // map original size
        System.out.println( map.get("Aizen"));
        System.out.println(map.containsKey(("Rohith")));
        System.out.println(map.containsValue(3));


        map.put("Rohith",4);
        System.out.println(map);


        map.replace("Rohith",52);
        System.out.println(map);

        map.putIfAbsent("Ben 10",0);
        System.out.println(map);

        map.remove("Ben 10");
        System.out.println(map);

    }
}
