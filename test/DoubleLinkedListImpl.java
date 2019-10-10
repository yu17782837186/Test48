package moc.qq;

public class DoubleLinkedListImpl implements IDoubleLinked {
    class Node {
        private int data;
        private Node next;
        private Node pre;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.pre = null;
        }
    }

    private Node head;
    private Node last;

    public DoubleLinkedListImpl() {
        this.head = null;
        this.last = null;
    }

    @Override
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            this.last = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
    }

    @Override
    public void addLast(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            this.last = node;
        }else {
            this.last.next = node;
            node.pre = this.last;
            node.next = null;
            this.last = node;
        }
    }
    private void checkIndex(int index) {
        if (index < 0 || index >getLength()) {
            throw  new
                    UnsupportedOperationException("index不合法！");
        }
    }
    private Node searchIndex(int index) {
        checkIndex(index);
        int count = 0;
        Node cur = this.head;
        while (count < index) {
            cur = cur.next;
            count++;
        }
        return cur;
    }
    @Override
    public boolean addIndex(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return true;
        }
        if (index == getLength()) {
            addLast(data);
            return true;
        }
            Node node = new Node(data);
            Node cur = searchIndex(index);
        node.next = cur;

            node.next.pre = node;

        node.pre = cur.pre;

            node.pre.next = node;


        //node.next.pre = node;
            return false;
    }

    @Override
    public boolean contains(int key) {
        return false;
    }

    @Override
    public int remove(int key) {
        return 0;
    }

    @Override
    public void removeAllKey(int key) {

    }

    @Override
    public int getLength() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    @Override
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    @Override
    public void clear() {

    }


}
