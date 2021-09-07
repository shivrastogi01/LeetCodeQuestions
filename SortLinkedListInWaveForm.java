// Java program to sort linked list
// in wave form
class SortLinkedListInWaveForm
{
     
// A linked list node
static class Node
{
    int data;
    Node next;
};
 
// Function to add a node at the
// beginning of Linked List
static Node push(Node head_ref, int new_data)
{
    /* allocate node */
    Node new_node = new Node();
 
    /* put in the data */
    new_node.data = new_data;
 
    /* link the old list off the new node */
    new_node.next = (head_ref);
 
    /* move the head to point to the new node */
    (head_ref) = new_node;
    return head_ref;
}
 
// Function get size of the list
static int listSize( Node node)
{
    int c = 0;
    while (node != null)
    {
        c++;
        node = node.next;
    }
    return c;
}
 
// Function to print the list
static void printList( Node node)
{
    while (node != null)
    {
        System.out.print(node.data + " ");
        node = node.next;
    }
}
 
// Function to sort linked list in
// wave form
static Node sortInWave( Node head)
{
    Node current = head;
    Node prev = null;
 
    // Variable to track even position
    int i = 0;
 
    // Size of list
    int n = listSize(head);
 
    // Traverse all even positioned nodes
    while (i < n)
    {
        if (i % 2 == 0)
        {
            // If current even element is
            // smaller than previous
            if (i > 0 && (prev.data > current.data))
            {
                int t = prev.data;
                prev.data = current.data;
                current.data = t;
            }
                 
            // If current even element is
            // smaller than next
            if (i < n - 1 && (current.data <
                              current.next.data))
            {
                int t = current.next.data;
                current.next.data = current.data;
                current.data = t;
            }
        }
        i++;
 
        prev = current;
        current = current.next;
    }
    return head;
}
 
// Driver Code
public static void main(String args[])
{
    Node start = null;
 
    /* The constructed linked list is:
    10, 90, 49, 2, 1, 5, 23*/
    start = push(start, 23);
    start = push(start, 5);
    start = push(start, 1);
    start = push(start, 2);
    start = push(start, 49);
    start = push(start, 90);
    start = push(start, 10);
 
    start = sortInWave(start);
 
    printList(start);
}
}
 