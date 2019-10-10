package moc.qq;

public class TestDouble {
    public static void main(String[] args) {
        DoubleLinkedListImpl doubleLinkedList
                = new DoubleLinkedListImpl();
        doubleLinkedList.addFirst(1);
        doubleLinkedList.addFirst(2);
        doubleLinkedList.addFirst(3);
        doubleLinkedList.addFirst(4);
        doubleLinkedList.addFirst(5);
        doubleLinkedList.display();
        doubleLinkedList.addLast(6);
        doubleLinkedList.addLast(7);
        doubleLinkedList.addLast(8);
        doubleLinkedList.addLast(9);
        doubleLinkedList.display();
        System.out.println
                (doubleLinkedList.addIndex(0,1));
        doubleLinkedList.display();
        doubleLinkedList.addIndex(8,6);


        doubleLinkedList.display();
        doubleLinkedList.addIndex(8,33);
        doubleLinkedList.display();

        doubleLinkedList.addIndex(0,11);
        doubleLinkedList.display();
        doubleLinkedList.addIndex(3,11);
        doubleLinkedList.display();
        doubleLinkedList.addIndex(6,66);
        doubleLinkedList.display();
        //doubleLinkedList.addIndex(3,5);
    }
}
