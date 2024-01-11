package leetcode.problems.merge_two_sorted_list;

public class Solution1 {
  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode head = new ListNode();
    ListNode newLN = head;

    while (list1 != null && list2 != null) {
      if (list1.val < list2.val) {
        newLN.next = list1;
        list1 = list1.next;
      } else {
        newLN.next = list2;
        list2 = list2.next;
      }
      newLN = newLN.next;
    }

    newLN.next = list1 == null ? list2 : list1;

    return head.next;
  }
}
