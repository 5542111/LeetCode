public class MergeKLists23 {
    public static void main(String[] args) {

    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length==1 ) return lists[0];
        ListNode node=new ListNode(0);
        ListNode curr=node;
        for (int i=0;i<lists.length;i++)
        {
            curr.next=mergeTwoLists(curr.next,lists[i]);
        }



        return node.next;
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode node = new ListNode(0);
        ListNode prev = node;


        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        prev.next = l1 == null ? l2 : l1;


        return node.next;
    }

}
