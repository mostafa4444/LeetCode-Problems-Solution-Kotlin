import java.util.*
import kotlin.collections.ArrayList


object Permutations46 {

    fun permute(nums: IntArray): List<List<Int>> {
        val res = ArrayList<List<Int>>()
        backTrackingPermutations(nums.toList() , ArrayList() , res)
        return res
    }
    private fun backTrackingPermutations(numsList: List<Int>, resultPer: List<Int>, res: ArrayList<List<Int>>) {
        if (numsList.isEmpty()) {
            res.add(resultPer)
            return
        }
        numsList.forEach { data ->
            backTrackingPermutations(ArrayList(numsList).apply { remove(data) }, ArrayList(resultPer).apply { add(data) }, res)
        }

    }
}