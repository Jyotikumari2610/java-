class SinglyLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    void insertAtBeginning(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    void insertAtEnd(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            return;
        }
        Node t = head;
        while (t.next != null) {
            t = t.next;
        }
        t.next = n;
    }

    void insertAtPosition(int data, int pos) {
        if (pos == 0) {
            insertAtBeginning(data);
            return;
        }
        Node t = head;
        for (int i = 0; i < pos - 1 && t != null; i++) {
            t = t.next;
        }
        if (t == null) return;
        Node n = new Node(data);
        n.next = t.next;
        t.next = n;
    }

    void deleteAtBeginning() {
        if (head != null) {
            head = head.next;
        }
    }

    void deleteAtEnd() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node t = head;
        while (t.next.next != null) {
            t = t.next;
        }
        t.next = null;
    }

    void deleteAtPosition(int pos) {
        if (head == null) return;
        if (pos == 0) {
            head = head.next;
            return;
        }
        Node t = head;
        for (int i = 0; i < pos - 1 && t.next != null; i++) {
            t = t.next;
        }
        if (t.next != null) {
            t.next = t.next.next;
        }
    }

    boolean search(int key) {
        Node t = head;
        while (t != null) {
            if (t.data == key) return true;
            t = t.next;
        }
        return false;
    }

    int length() {
        int c = 0;
        Node t = head;
        while (t != null) {
            c++;
            t = t.next;
        }
        return c;
    }

    void reverse() {
        Node prev = null, curr = head, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    void display() {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }
}
