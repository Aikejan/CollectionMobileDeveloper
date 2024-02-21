
import collection.Cleep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList();
        ArrayList<String> colors1 = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors1.ensureCapacity(3);

        colors.add("Vuolet");
        colors.add("Cherry");
        colors.add("Light blue");
        System.out.println(colors);
        System.out.println("_________________________");

        colors1.add(0, "White");
        colors1.add(1, "Pink");
        colors1.add(2, "Yellow");
        System.out.println(colors);
      colors1.retainAll( colors1);
        System.out.println("_________________________");

        colors.set(0, "Brawn");
        System.out.println(colors);
        System.out.println("_________________________");
        colors.set(1, "Blue");
        System.out.println(colors);
        System.out.println("_________________________");
        colors.set(2, "Silver");
        System.out.println(colors);
        System.out.println("______________________________");

        if (colors.contains("Brawn")) {
            System.out.println(" da est: " + colors);
        } else {
            System.out.println("Net takogo svata");
        }


        System.out.println("___________________________________");

        Cleep cleeps1 = new Cleep("Ronaldo", +34770-455-56-89);
        Cleep cleeps2 = new Cleep("Messon", +34707-456-85-75);
        Cleep cleeps3 = new Cleep("Lord", +34700-459-90-19);

        Cleep cleeps0 = new Cleep("Samat", +34770-456-56-00);
        Cleep cleeps5 = new Cleep("Altynbek", +34707-738-85-06);
        Cleep cleeps6 = new Cleep("Ivan", +34700-710-90-15);

        ArrayList<Cleep> cleeps4 = new ArrayList<>();
        cleeps4.add(cleeps1);
        cleeps4.add(cleeps2);
        cleeps4.add(cleeps3);
        System.out.println(cleeps4);


        System.out.println("\n______________________________");
        LinkedList<Cleep> cleeps7 = new LinkedList<>();
        cleeps4.add(cleeps0);
        cleeps4.add(cleeps5);
        cleeps4.add(cleeps6);
        System.out.println(cleeps7);


        System.out.println("Do sortirovki -->" + colors);
        Collections.sort(colors);
        System.out.println("Posle sortirovki -->" + colors);
        Collections.sort(colors);

        System.out.println("__________________________________");
        for (int i = 0; i < cleeps4.size(); i++) {
            System.out.println(cleeps4.get(i));
        }
        System.out.println("__________________________________");
        for (Cleep cleep: cleeps7){
            System.out.println(cleeps7);
        }
        Collections.sort(cleeps4);
    }

}