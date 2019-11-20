public class SwapPairNode24 {
    public static void main(String[] args) {

    }

    public ListNode swapPairs(ListNode head) {
//        if (head==null||head.next==null){
//            return head;
//        }
//        ListNode node=head.next;
//
//        head.next=swapPairs(node.next); //递归
//        node.next=head;
//
//
//        return node;


        ListNode node = new ListNode(0);
        node.next = head;

        ListNode temp = node;


        while (temp.next != null && temp.next.next != null){
            ListNode pre=temp.next;
            ListNode back=temp.next.next;
            temp.next=back;
            pre.next=back.next;
            back.next=pre;
            temp=pre;
        }

            return node.next;

//        ListNode pre = new ListNode(0);
//        pre.next = head;
//        ListNode temp = pre;
//        while (temp.next != null && temp.next.next != null) {
//            ListNode start = temp.next;
//            ListNode end = temp.next.next;
//            temp.next = end;
//            start.next = end.next;
//            end.next = start;
//            temp = start;
//        }
//        return pre.next;


    }

}
