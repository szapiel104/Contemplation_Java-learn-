package Basic;

// Second application to learn about Java.
// Michał Szapiel

import java.util.*;

public class SecondApplication {

    public static void main(String[] args){

        Lesson01();

    }
    public static void Lesson01(){
        // Create map
        // Based on pairs (key - value) for example <Integer, String>
        System.out.println(" ---Create map--- ");
        Map<Integer,String> map = new HashMap<>();

        Integer ab = new Integer(2);
        int abc = 2;


        map.put(1, "Monday");
        map.put(2, "Thuesday");
        map.put(3, "Wednesday");
        map.put(4, "Thursday");
        map.put(5, "Friday");
        map.put(6, "Saturday");
        map.put(7, "Sunday");

        System.out.println("Show all");
        for(Map.Entry<Integer,String> m : map.entrySet())
            System.out.println(" > " + m);

        System.out.println("Show individual witch variables");
        for(Map.Entry<Integer,String> n : map.entrySet()){
            int key = n.getKey();
            String value = n.getValue();
            System.out.println(" > " + key + " " + value);

        }

        System.out.println("Informations about map: ");
        System.out.println(" > Size: " + map.size());
        System.out.println(" > Empty: " + map.isEmpty());
        System.out.println(" > Values: " + map.values());

        // Equals = porównanie (object to object) is this same (true or false)
        // Length = długość (When you need to read długość table)
        // Each object in java has hashcode. If you have for example String and second String.
        // It's this same but has other hashcode;
        // When you freeing memory in JAVA, you use GarbageCollector
    }
}
