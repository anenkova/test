import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testList {
    public static void main(String[] args) {
        List<Integer> n = new ArrayList<>();
        Collections.addAll(n, 1, 10, 33, 14, 56);


       for (int myList : n) {
           System.out.print(myList + " ");
       }

        n.add(3);
        n.add(4);
        n.add(52);
        n.add(7);
        n.add(5);
        System.out.println();
        System.out.println("Дополненный ");
        /*Iterator<Integer> iterator = n.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
*/
        for (int myList : n) {
            System.out.print(myList + " ");
                    }

        Collections.sort(n);
        System.out.println();
        System.out.println("Сортированый ");
        for (int myList : n) {

            System.out.print(myList + " ");
        }



    }
}







