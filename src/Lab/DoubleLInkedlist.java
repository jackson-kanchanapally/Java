import java.util.*;

public class DoubleLInkedlist {
    public static void main(String args[]) {
        int i, ch, element, pos;
        LinkedList<Integer> dl = new LinkedList<Integer>();
        System.out.println("1.Insert element at begining");
        System.out.println("2.Insert element at end");
        System.out.println("3.Insert element at position");
        System.out.println("4.Delete a given element");
        System.out.println("5.Display elements in the list");
        System.out.println("6.Exit");
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Choose : ");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter an element to insert at begining : ");
                    element = in.nextInt();
                    dl.addFirst(element);
                    System.out.println("Successfully Inserted");
                    break;

                case 2:
                    System.out.print("Enter an element to insert at end : ");
                    element = in.nextInt();
                    dl.addLast(element);
                    System.out.println("Successfully Inserted");
                    break;

                case 3:
                    System.out.print("Enter position  to insert element : ");
                    pos = in.nextInt();

                    if (pos <= dl.size()) {
                        System.out.println("enter element :");
                        element = in.nextInt();

                        dl.add(pos, element);
                        System.out.println("Successfully Inserted");
                    } else {
                        System.out.println("Enter the size between 0 to" + dl.size());
                    }
                    break;

                case 4:
                    System.out.print("Enter element to remove : ");
                    Integer er;
                    er = in.nextInt();
                    if (dl.contains(er)) {
                        dl.remove(er);
                        System.out.println("Successfully Deleted");
                        Iterator itr = dl.iterator();
                        System.out.println("Elements after deleting :" + er);
                        while (itr.hasNext()) {
                            System.out.print(itr.next() + "<->");
                        }
                        System.out.println("NULL");
                    } else {
                        System.out.println("Element not found");
                    }
                    break;

                case 5:
                    Iterator itr = dl.iterator();
                    System.out.println("Elements is the list :");
                    while (itr.hasNext()) {
                        System.out.print(itr.next() + "<->");
                    }
                    System.out.println("NULL");
                    break;
                case 6:
                    System.out.println("Program terminated");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (ch != 6);

    }
}
