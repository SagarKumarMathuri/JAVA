// NOT completed this problem


public class tut53 {

    public int getSize(){
        return size;
    }

    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }
         Node prevNode = head;
         Node currNode = head.next;
         while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            preNode = currNode;
            currNode = nextNode;
         }
         head.next = null;
         head = prevNode;
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.PrintList();

        list.reverseIterate();
        list.printList();
    }
}
