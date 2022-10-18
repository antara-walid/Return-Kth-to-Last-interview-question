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
        ListNode node1 = new ListNode(3, node2);
        ListNode head = new ListNode(1, node1);

        print(head);

        // test

        System.out.println("*************");
        // 1.testing the first methode naive solution
        //int result = returnKthLast(head ,0);
        //System.out.println("the result is : ");

        // 2.testing the runner technic methode
        int result = returnkthLastPointers(head ,3);


        System.out.println(result);


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
        if(k == 0)
        {
            return current.val;
        }
        //System.out.println("size is" + size);
        current = head;
        while( current.next != null)
        {
            if(counter == size-k-1)
            {
                return current.val;
            }

            //System.out.println("counter :" + counter);
            counter++;
            current = current.next;
        }

        return 0;
    }
    public static int returnkthLastPointers(ListNode head , int k)
    {
        ListNode current = head;
        int i = 0;
        //pointing at the kth element after head

        if(head == null)
        {
            return 0;
        }
        while(i < k ){
            current = current.next;
            i++;
        }

        ListNode runner = current;
        current = head;
        while (runner.next != null)
        {
            runner = runner.next;
            current = current.next;
        }

        // when runner reach the end of the linked list the current reach the kth element from last
        return current.val;

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
