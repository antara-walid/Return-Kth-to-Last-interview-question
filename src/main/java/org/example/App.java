package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ListNode node3 = new ListNode(7, null);
        ListNode node2 = new ListNode(4, node3);
        ListNode node1 = new ListNode(4, node2);
        ListNode head = new ListNode(4, node1);


        //before
        print(head);


    }

    public static int returnKthLast(ListNode head , int k)
    {
        // find the size
        int size = 1;
        int counter = 0;
        ListNode current = head;

        while (current.next != null)
        {
            size++;
            current = current.next;
        }

        while(current.next != null)
        {
            if(counter == size-k-1)
            {
                return current.val;
            }

            counter++;
            current = current.next;
        }

        return 0;
    }
    public static void print(ListNode head) {
        ListNode current = head;
        while (current.next != null) {
            System.out.println(current.val);
            current = current.next;
        }

        System.out.println(current.val);
    }
}
