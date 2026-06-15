import com.sun.source.tree.Tree;

import java.util.*;
public class Hashset {
    static void main() {
        HashSet<String> names = new HashSet<>(); // random order VERY FAST
        System.out.println(names);


        names.add("Ronaldo");
        names.add("Rohith");
        names.add("Aizen");
        names.add("Prasad");

        System.out.println(names);


        System.out.println(names.size());


        names.remove(0);
        System.out.println(names);

        System.out.println(names.contains("ronaldo"));
        System.out.println(names.isEmpty());



        for (String name:names){
            System.out.println(name);
        }
        names.forEach(System.out::print );

       Iterator<String> namesIterator =  names.iterator();
       while(namesIterator.hasNext()){
           System.out.println(namesIterator.next());
       }

       List<Integer> list = new ArrayList<>();
       list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(4);
        System.out.println(list);

        Set <Integer> set = new HashSet<>();
        set.addAll((list));
        System.out.println(set);

        Set <Integer> set2 = new HashSet<>(list);
        System.out.println(set2);


        TreeSet<String> names1 = new TreeSet<>();  // natural order that means alphaetical ordering SLOW
        System.out.println("TREE SET");


        names1.add("Ronaldo");
        names1.add("Rohith");
        names1.add("Aizen");
        names1.add("Prasad");

        System.out.println(names1);

        Set<String> names2 = new LinkedHashSet<>();  // insertion oredering no change FAST
        System.out.println("LINKED SET");


        names2.add("Ronaldo");
        names2.add("Rohith");
        names2.add("Aizen");
        names2.add("Prasad");

        System.out.println(names2);
        names2.removeIf(n-> n.equals("Rohith"));
        System.out.println(names2);
        System.out.println(names2.stream().findFirst());


    }
}
