package DSA.Linked_List_Data_Structure;

public class Main {
   public static void main(String[] args) {

      // Available methods
      // 1. add(int data);
      // 2.insertAtFirst(int data);
      // 3.insertAtLast(int data);
      // 4.insertAtPos(int pos, int data);
      // 5.size();
      // 6.deleteFirst(int data);
      // 7.deleteLast(int data);
      // 8.get(int n);
      // 9.isEmpty();
      // 10 clear();

      MyLinkedList list = new MyLinkedList();
      list.add(15);
      list.insertAtFirst(5);
      list.insertAtLast(20);
      list.insertAtPos(2, 10);
      list.printList();
      list.deleteLast();
      list.deleteFirst();
      System.out.println();
      list.printList();
      System.out.println("\n" + list.size());
      System.out.println(list.get(1));
      System.out.println(list.isEmpty());
      list.clear();
      list.printList();
      System.out.println(list.isEmpty());

   }

}
