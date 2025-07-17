package LinkedList;

public class LinkedListRunner {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.insert(1);
        linkedList.insert(5);
        linkedList.insert(6);
        linkedList.insert(10);

        linkedList.insertAt(1, 2);
        linkedList.insertAtStart(0);
        linkedList.deleteAt(3);
        linkedList.deleteLast();
        linkedList.update(2, 8);
        linkedList.show();
        System.out.println("Size of the linkedList: " + linkedList.size());
    }
}
