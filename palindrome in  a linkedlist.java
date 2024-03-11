class Solution
{
    //Function to check whether the list is palindrome.
    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true; // Empty list or single node list is considered palindrome
        }

        // Find the middle of the list using slow and fast pointers
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the list
        Node secondHalf = reverse(slow.next);

        // Compare first half with reversed second half
        Node firstHalf = head;
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false; // Not a palindrome
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true; // Palindrome
    }

    private Node reverse(Node head) {
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

