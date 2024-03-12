class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;
        int sum = 0;
        Map<Integer, ListNode> map = new HashMap<>();

        while (temp != null) {
            sum += temp.val;

            if (map.containsKey(sum)) {
                temp = map.get(sum).next;
                int currSum = sum + temp.val;
                
                while (currSum != sum) {
                    map.remove(currSum);
                    temp = temp.next;
                    currSum += temp.val;
                }
                map.get(sum).next = temp.next;
            } else {
                map.put(sum, temp);
            }

            temp = temp.next;
        }

        return dummy.next;
    }
}
