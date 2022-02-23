object LongestPalindromicSubstring {
    fun longestPalindrome(s:String):String{
        if (s.isEmpty()) return ""
        var startPtr = 0
        var endPtr = 0
        s.forEachIndexed { index, _ ->
            val caseLength = getMaxExpandedPalindrome(index, index, s).coerceAtLeast(getMaxExpandedPalindrome(index, index + 1, s))
            if (caseLength > endPtr - startPtr){
                startPtr = index - (caseLength - 1) / 2
                endPtr = index + caseLength / 2
            }
        }
        return s.substring(startPtr + 1 , endPtr)
    }

    private fun getMaxExpandedPalindrome(start: Int, end: Int, s:String): Int{
        var startPtr = start
        var endPtr = end
        if (startPtr > endPtr){
            return 0
        }
        while (startPtr >= 0 && endPtr < s.length && s[startPtr] == s[endPtr]){
            startPtr--
            endPtr++
        }
        return endPtr - startPtr + 1
    }
}