public class NodeList {
    Node head = null;
    Node tail = null;

      void addAtEnd(int val) {
        Node userInput = new Node(val);
        if(head == null) {
            head=userInput;
            tail = userInput;
        }
        else {
            tail.next= userInput;
            tail= userInput;

        }
    }

    void insertAt(int index,int val){
          Node nodeOfValue = new Node(val);
          Node temp = head;
          for(int i=0;i<index-1;i++){
              temp = temp.next ;
          }
          nodeOfValue.next = temp.next;
          temp.next = nodeOfValue;

    }

    public void display(){

          while(head.next != null){
              System.out.println(head.data);
              head=head.next;
          }
        System.out.println(head.data);
    }

}
