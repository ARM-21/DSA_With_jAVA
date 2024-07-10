import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void display(Node temp) {
        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }

    public static void recursivePrint(Node temp) {
        if(temp.next == null){
            System.out.print(temp.data+" ");
            return;
        }
        System.out.print(temp.data+" ");
        recursivePrint(temp.next);
    }
    public static void main(String[] args) {
     Node firstValue = new Node(1);
     Node secondValue = new Node(2);
     Node thirdValue = new Node(3);
     Node fourthValue = new Node(4);
     Node fifthValue = new Node(5);
     Node sixthValue = new Node(6);
     firstValue.next = secondValue;
     secondValue.next = thirdValue;
     thirdValue.next= fourthValue;
     fourthValue.next=fifthValue;
     fifthValue.next = sixthValue;



     NodeList nodeyy = new NodeList();
     nodeyy.addAtEnd(2);
     nodeyy.addAtEnd(3);
     nodeyy.addAtEnd(4);
     nodeyy.addAtEnd(45);
     nodeyy.insertAt(2,6);
     nodeyy.display();

    }
}