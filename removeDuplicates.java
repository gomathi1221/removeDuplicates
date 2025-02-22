class Solution {
    // Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head) {
       if(head==null){
           return head;
       }
       Node curr=head;
       while(curr.next!=null){
           if(curr.data!=curr.next.data){
               curr=curr.next;
           }
           else{
           curr.next=curr.next.next;
           }
          
           
       }
       return head;
       
    }
}
