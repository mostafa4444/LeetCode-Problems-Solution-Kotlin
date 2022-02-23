import java.util.*
import kotlin.collections.ArrayList

object SequentialDigits {

    // 100 , 300
    fun sequentialDigits(low: Int, high: Int): List<Int> {

        val list = ArrayList<Int>()
        for (i in 1..9){
            helper(i , i , low , high , list)
            list.sort()
        }
        return list
    }

    private fun helper(i: Int, i1: Int, low: Int, high: Int, list: ArrayList<Int>) {
        if (i in low..high)
            list.add(i)
        if (i > high || i1 >= 9)
            return

        helper((i*10)+(i1 + 1) ,  i1 + 1 , low, high, list)
    }

    // 123 , 234
    // ( 1,1) ,  (12 , 2) , (123 , 3) , ( 1234 , 4)
    // ( 2,2) , (23 , 3) , (234 , 4)
    // (3,3)

}