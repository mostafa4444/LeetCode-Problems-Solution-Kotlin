import helperModels.ListNode


object ReverseNodesInKGroup {

    private fun helper(head: ListNode?, k: Int): ListNode?{
        var previous:ListNode? = null
        var actualNode = head
        var next: ListNode ?= null
        var count = k
        while (actualNode != null && count > 0){
            next = actualNode.next  // take copy from main node
            actualNode.next = previous  // swap previous
            previous = actualNode  // give previous the current index to complete reverse
            actualNode = next  // move to next iterator
            count--
        }
        actualNode = previous
        return actualNode
    }

    fun reverseKGroup(head: ListNode? , k: Int): ListNode?{
        val mainNode = ListNode(0 , head)  // Dummy State that next to Head
        var actualNode = head            // Initial State of my Nodes
        var previousNode = mainNode      // Take the Root Index

        while (actualNode != null){
            val tempNode = actualNode
            var count = 0
            while (count < k && actualNode != null){
                actualNode = actualNode.next
                count++
            }

            if (count != k){
                previousNode.next = tempNode
            }else{
                previousNode.next = helper(tempNode , k)
                previousNode = tempNode
            }
        }
        return mainNode.next
    }

//    private var dataList = arrayListOf<Int>()
//    fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
//        if (k <= 1) return head
//        extractValueFromList(head!!)
//        val myResult = arrayListOf<Int>()
//        dataList.chunked(k).forEach { list -> myResult.addAll(list.reversed()) }
//        repeat(myResult.size) {}
//        println(myResult.chunked(k))
//        println(myResult.windowed(2))
//        return null
//    }
//
//    private fun extractValueFromList(node:ListNode){
//        dataList.add(node.`val`)
//        if (node.next != null){ extractValueFromList(node.next!!) }
//        return
//    }



}