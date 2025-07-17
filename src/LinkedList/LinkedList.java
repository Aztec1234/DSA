package LinkedList;

/*
   [Data1|Node1] -> [Data2|Node2] -> null
 */
public class LinkedList<T> {
    ListNode<T> head;

    public void insert(T data) {
        ListNode<T> node = new ListNode<T>();
        node.data = data;

        if (head == null) {
            head = node;
        } else {
            ListNode tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = node;
        }
    }

    public void insertAtStart(T data) {
        ListNode<T> node = new ListNode<T>();
        node.data = data;

        node.next = head;
        head = node;
    }

    public void insertAt(int index, T data) {
        ListNode<T> node = new ListNode<T>();
        node.data = data;

        ListNode<T> tempNode = head;

        if (index == 0) {
            insertAtStart(data);
        } else {
            for (int i = 0; i < index - 1; i++) {
                tempNode = tempNode.next;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
    }

    public void update(int index, T data) {
        ListNode<T> tempNode = head;
        for (int i = 0; i < index; i++) {
            tempNode = tempNode.next;
        }
        tempNode.data = data;
    }

    public void deleteLast() {
        ListNode<T> tempNode = head;
        for (int i = 0; i < size() - 2; i++) {
            tempNode = tempNode.next;
        }
        tempNode.next = null;
    }

    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            ListNode<T> tempNode = head;

            for (int i = 0; i < index - 1; i++) {
                tempNode = tempNode.next;
            }
            ListNode<T> n = tempNode.next;
            tempNode.next = n.next;
            n = null;
        }
    }

    public void show() {
        ListNode<T> n = head;

        while (n.next != null) {
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }

    public int size() {
        ListNode<T> n = head;
        int len = 0;
        if (n == null) {
            return 0;
        } else {
            while (n.next != null) {
                len++;
                n = n.next;
            }
        }
        return ++len;
    }

}
