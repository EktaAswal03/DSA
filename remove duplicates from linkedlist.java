class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
         Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
        
        
    }
}
