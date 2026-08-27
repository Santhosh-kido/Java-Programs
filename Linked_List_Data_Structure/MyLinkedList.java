package Linked_List_Data_Structure;

public class MyLinkedList {
    private static Node head = null;

    public void add(int data) {
        insertAtLast(data);
    }

    public void insertAtFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }
    

    public void insertAtLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    public void printList() {
        Node cur = head;
        if (cur == null) {
            System.out.println("List is Empty..!!");
            return;
        }
        while (cur != null) {
            System.out.print(cur.data);
            if (cur.next != null) {
                System.out.print(" --> ");
            }
            cur = cur.next;
        }
    }

    public void insertAtPos(int pos, int data) {

        Node node = new Node(data);
        int i = 1;
        Node cur = head;
        while (i < (pos - 1)) {
            cur = cur.next;
            i++;
        }
        node.next = cur.next;
        cur.next = node;
    }

    public void deleteFirst() {
        Node cur = head;
        if (cur == null) {
            System.out.println("List is Empty..!!");
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is Empty..!!");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node cur = head;
        while (cur.next.next != null) {
            cur = cur.next;
        }
        cur.next = null;
    }

    public Object get(int n) {
        Node cur = head;
        int val = 0;
        if (cur == null) {
            return "List is Empty..";
        }
        int count = 0;
        while (cur != null) {
            count++;
            if (count == n)
                val = cur.data;

            cur = cur.next;
        }
        return val;
    }

    public int size() {
        Node cur = head;
        int count = 0;
        if (cur == null) {
            return 0;
        }
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    public boolean isEmpty() {
        boolean res = false;
        if (head == null)
            res = true;
        return res;
    }

    public void clear(){
        head = null;
    }

}
