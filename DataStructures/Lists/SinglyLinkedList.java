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
      this.size++;
    }
  }

  public void prepend(int data) {
    Node newNode = new Node(data);
    if (this.size == 0) {
      this.head = newNode;
      this.tail = newNode;
      this.size++;
    } else {
      newNode.next = this.head;
      this.head = newNode;
      this.size++;
    }
  }

  public void remove(int data) {
    Node currentNode = this.head;

    // if Linked List is empty
    if (currentNode == null) {
      return;
    }

    // if data to be removed exists on head node
    if (currentNode.data == data) {
      this.head = currentNode.next;
      this.tail = currentNode.next;
      return;
    }

    if (currentNode != null) {
      while (currentNode.next != null) {
        if (currentNode.next.data == data) {
          currentNode.next = currentNode.next.next;
        } else {
          currentNode = currentNode.next;
        }
      }
    }
  }

  @Override
  public String toString() {
    StringBuilder newStringBuilder = new StringBuilder();
    if (this.size != 0) {
      Node currentNode = this.head;
      while (currentNode != null) {
        newStringBuilder.append(Integer.toString(currentNode.data));
        if (currentNode.next != null) {
          newStringBuilder.append(" -> ");
        }
        currentNode = currentNode.next;
      }
    }
    return newStringBuilder.toString();
  }

  public static void main(String[] args) {
    System.out.println("\n\nThis is main class of SinglyLinkedList!\n\n");

    SinglyLinkedList newSinglyLinkedList = new SinglyLinkedList(3);
    System.out.println(newSinglyLinkedList);
    newSinglyLinkedList.append(2);
    newSinglyLinkedList.append(6);
    newSinglyLinkedList.append(6);
    newSinglyLinkedList.append(8);
    newSinglyLinkedList.prepend(28);
    newSinglyLinkedList.prepend(38);
    System.out.println(newSinglyLinkedList);
    System.out.println("Removing Data !\n\n");
    newSinglyLinkedList.remove(6);
    System.out.println(newSinglyLinkedList);
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
