//class Node<T> {
//  T val;
//  Node<T> next;
//
//  public Node(T val) {
//    this.val = val;
//    this.next = null;
//  }
//}

class ECSource {
  public static <T> boolean isUnivalueList(Node<T> head) {
      if (head.next == null) return true;
      if (head.val != head.next.val) return false;
      return isUnivalueList(head.next);
  }

  public static void main(String[] args) {
      Node<Integer> u = new Node<>(2);
      Node<Integer> v = new Node<>(2);
      Node<Integer> w = new Node<>(2);
      Node<Integer> x = new Node<>(2);
      Node<Integer> y = new Node<>(2);

      u.next = v;
      v.next = w;
      w.next = x;
      x.next = y;

      // 2 -> 2 -> 2 -> 2 -> 2

      System.out.println(isUnivalueList(u));; // true

      u = new Node<>(2);
      v = new Node<>(2);
      w = new Node<>(3);
      x = new Node<>(3);
      y = new Node<>(2);

      u.next = v;
      v.next = w;
      w.next = x;
      x.next = y;

      // Printing solution
      System.out.println(isUnivalueList(u));
    }
}
