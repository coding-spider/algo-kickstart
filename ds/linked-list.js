class Node {
  constructor(value, next = null) {
    this.value = value;
    this.next = next;
  }

  toString() {
    return this.value;
  }
}

class LinkedList {
  constructor() {
    this.head = null;
  }

  append(value) {
    let newNode = new Node(value);

    if (!this.head) {
      this.head = newNode;
      return;
    }

    this.head.next = newNode;
  }

  prepend(value) {
    let newNode = new Node(value);

    if (!this.head) {
      this.head = newNode;
      return;
    }

    newNode.next = this.head;
    this.head = newNode;
  }

  toArray() {
    let nodes = [];
    let current = this.head;
    while (current != null) {
      nodes.push(current.value);
      current = current.next;
    }
    return nodes;
  }
}

let linkedList = new LinkedList();

linkedList.append(1);
linkedList.append(2);
console.log(linkedList);

linkedList.prepend(3);
console.log(linkedList.toArray());
