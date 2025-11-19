import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

class ListsDemo {
    public static void main(String[] args) {
        List <String> list = new LinkedList<String>();

        for(int i = 5; i < 40; i += 5) {
            list.add("" + i);
        }

        list.add(3, "" + 18);
        list.add(5, "" + 249);

        System.out.println("List elements: ");
        int i = 0;
        for (Iterator <String> iter = list.iterator(); iter.hasNext(); i++) {
            String item = iter.next();
            System.out.println("Element " + i + ": " + item);
        }

        list.remove("18");
        list.remove("30");
        list.remove("20");

        System.out.println("\n\nAfter remove: ");
        i = 0;
        for (Iterator <String> iter = list.iterator(); iter.hasNext(); i++) {
            String item = iter.next();
            System.out.println("Element " + i + ": " + item);
        }
    }
}