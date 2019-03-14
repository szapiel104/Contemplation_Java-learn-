package Basic;
// First application to learn about Java.
// Michał Szapiel

import java.util.Scanner;
import java.util.*;

public class FirstApplication {

    public static void main (String[] args){
        // Lesson01();
        // Lesson02();
        // Lesson03();
        // Lesson04();
        Lesson05();
    }
    public static void Lesson01(){
        // First lesson (Sum, print, enter)
        System.out.print("\n// First lesson (Sum, print, enter)\n");
        int a = 10;
        int b = 20;
        System.out.print("Andrzej\n");
        System.out.println(a + b);
    }
    public static void Lesson02(){
        // Second lesson (Read and write using the keyboard)
        System.out.print("\n// Second lesson (Read and write using the keyboard)\n");
        String somethingMore;
        System.out.println("Write some: ");
        Scanner odczyt = new Scanner(System.in);
        somethingMore = odczyt.nextLine();

        System.out.println("Wrote: "  + somethingMore);
    }
    public static void Lesson03(){
        // Third lesson (Read something with tables)
        System.out.print("\n// Third lesson (Read something with tables)\n");
        System.out.println(" Add some numbers (Integer)");
        int[] firstTable = new int[5];
        int secondTable[] = new int[5];

        for(int z = 0; z < secondTable.length; z++){
            secondTable[z] = z;
        }

        for(int b : secondTable){
            System.out.println(secondTable[b]);
        }

        for(int i = 0; i < firstTable.length; i++){
            try {
                Scanner writeSomethingToTable = new Scanner(System.in);
                firstTable[i] = writeSomethingToTable.nextInt();
            }catch(Exception e){
                System.out.println("It's not a integer");
                System.out.println(e.getMessage());
            }
        }
        for(int y : firstTable)
            System.out.println(y);

    }

    public static void Lesson04(){
        // Fourth lesson (Extensive tables)
        String[][] tables = {{"ad","adaw","adwq"},{"ad2","a3daw","ad4q"}};

        //System.out.println(tables[1][1]);
       // System.out.println(tables[0][2]);
        for(int x = 0; x <= tables.length; x++){
            for(int y = 0; y <= tables.length; y++) {
                System.out.println(tables[x][y]);
            }
        }


    }

    public static void Lesson05(){
        //Fifth lesson (Collections)

        // Lists has index like table

        System.out.println("-- Fifth lesson (Collectons) --");
        List<String> listaString = new ArrayList<>();
        listaString.add("jeden");
        listaString.add("dwa");
        listaString.add("trzy");

        // for each
        System.out.println("For each:");
        for(String a : listaString)
            System.out.println(" > " + a);

        System.out.println("Size: " + listaString.size() + "\n");
        // we do not lose the previous one from the list
        listaString.add(1,"Andrzej");

        // for ArrayList<>();
        System.out.println("For: ");
        for(int b = 0; b < listaString.size(); b++)
            System.out.println(" > " + listaString.get(b));

        System.out.println("Size: " + listaString.size() + "\n");

        // remove something from list
        int somethingNumber;

        Scanner scannerNumber = new Scanner(System.in);





        // try, catch? Soon
        System.out.println("Which entry you want to delete? 0-" + (listaString.size() - 1));



        somethingNumber = scannerNumber.nextInt();

        System.out.println("Removed: " + somethingNumber);
        listaString.remove(somethingNumber);

        for(String c  : listaString)
            System.out.println(" > " + c);

        System.out.println("Size: " + listaString.size() + "\n");

        // Find something on list
        String findSomethingOnList;
        System.out.println("Find something on list!");
        Scanner findSOL = new Scanner(System.in);
        findSomethingOnList = findSOL.nextLine();

        System.out.println("Contain:  " + listaString.contains(findSomethingOnList));



    }

}
