class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var dummy = ListNode(0)
        var tail = dummy
        var n1 = list1
        var n2 = list2
        while(n1 != null || n2 != null){  
            if(n1 == null){
                tail?.next = n2
                break
            }
            if(n2 == null){
                tail?.next = n1
                break
            }
            if(n1?.`val` < n2?.`val`){
                tail?.next = n1
                n1 = n1?.next
            }else{
                tail?.next = n2
                n2 = n2?.next
            }
            tail = tail?.next
        }
        return dummy?.next
    }
}
