import helperModels.ListNode
import kotlin.text.StringBuilder

object ZigZagConversion {


    fun convert(s: String, numRows: Int): String {
        if (numRows == 1){
            return s
        }
        val myStrings = HashMap<Int, StringBuilder>()
        val result = StringBuilder()
        var count = 0
        var state = true
        s.forEach {
            if (numRows == count){
                state = false
            }
            if (count == 1){
                state = true
            }
            if (state) count++ else count--

            if (!myStrings.containsKey(count))
                myStrings[count] = StringBuilder()
            myStrings[count]?.append(it)
        }

        /*
        P   count = 0    state true      new count = 1        map[1] += P
        A   count = 1    state true      new count = 2        map[2] += A
        Y   count = 2    state true      new count = 3        map[3] += Y
        P   count = 3    state false     new count = 2        map[2] += P     AP
        A   count = 2    state false     new count = 1        map[1] += A     PA
        L   count = 1    state true      new count = 2        map[2] += L     APL
        I   count = 2    state true      new count = 3        map[3] += I     YI
        S   count = 3    state false     new count = 2        map[2] += S     APLS
        H   count = 2    state false     new count = 1        map[1] += H     PAH
        I   count = 1    state true      new count = 2        map[2] += I     APLSI
        R   count = 2    state true      new count = 3        map[3] += R     YIR
        I   count = 3    state false     new count = 2        map[2] += I     APLSII
        N   count = 2    state false     new count = 1        map[1] += N     PAHN
        G   count = 1    state true      new count = 2        map[2] += G     APLSIIG
        */

        // result = PAHNAPLSIIGYIR

        myStrings.keys.forEach {
            result.append(myStrings[it])
        }
        return result.toString()
    }

}