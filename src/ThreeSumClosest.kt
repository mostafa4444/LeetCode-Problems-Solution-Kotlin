import java.util.*
import kotlin.math.abs

object ThreeSumClosest {

    //(-1,2,1,-4)    target 1
    fun threeSumClosest(nums: IntArray, target: Int): Int {
        var output = nums[0] + nums[1] + nums[nums.size - 1]
        Arrays.sort(nums)
        var i = 0
        while (i < nums.size - 2 ){
            var startPtr = i +1
            var endPtr = nums.size - 1
            while (startPtr < endPtr){
                val tempRes = nums[i] + nums[startPtr] + nums[endPtr]
                if (tempRes > target)
                    startPtr++
                else
                    endPtr++

                if (abs(tempRes - target)  < abs(output -target))
                    output = tempRes
            }
            i++
        }
        return output
    }

}