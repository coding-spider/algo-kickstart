package DataStructures.Lists;

public class SinglyLinkedList {
  public Node head;
  public Node tail;
  public int size;

  public SinglyLinkedList() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  public SinglyLinkedList(int data) {
    Node newNode = new Node(data);
    this.head = newNode;
    this.tail = newNode;
    this.size++;
  }

  public void append(int data) {
    Node newNode = new Node(data);
    if (this.size == 0) {
      this.head = newNode;
      this.tail = newNode;
      this.size++;
    } else {
      this.tail.next = newNode;
      this.tail = newNode;
    }
  }

  public static void main(String[] args) {
    System.out.println("This is main class of SinglyLinkedList!");

    Node newNode = new Node(2);

    System.out.println("Printing Node...");
    System.out.println(newNode);

  }
}

class Node {
  public int data;
  public Node next;

  public Node(int data) {
    this(data, null);
  }

  public Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }

  @Override
  public String toString() {
    return Integer.toString(this.data);
  }
}
