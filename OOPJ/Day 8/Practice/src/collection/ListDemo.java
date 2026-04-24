package collection;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Navin");
        list1.add("Omkar");
        list1.add("Mahendra");
        list1.add("Mihir");
        list1.add("Sourabh");

        //Using forEach
        System.out.println("List using foreach");
        for (String s : list1) {
            System.out.print(s + " ");
        }

        System.out.println("\nList Using Iterator");
        Iterator it = list1.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        ListIterator lit = list1.listIterator();

        System.out.println("\nList Using ListIterator");
        while (lit.hasNext()) {
            System.out.print(lit.next() + " ");
        }

        System.out.println("\nList Using ListIterator in reverse ");
        while (lit.hasPrevious()) {
            System.out.print(lit.previous() + " ");
        }

        Enumeration<String > em = Collections.enumeration(list1);
        System.out.println("\nList Using Enumeration ");
        while (em.hasMoreElements()) {
            System.out.print(em.nextElement() + " ");
        }
    }

}
