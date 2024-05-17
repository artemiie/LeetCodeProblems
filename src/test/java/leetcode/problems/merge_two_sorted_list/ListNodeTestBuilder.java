package leetcode.problems.merge_two_sorted_list;

public class ListNodeTestBuilder {
    public static ListNode buildListNode(int nodesNumber, int increaseBy) {
        if (nodesNumber > 0) {
            return new ListNode(1, buildListNode(nodesNumber - 1, 1 + increaseBy));
        } else {
            return null;
        }
    }
}
