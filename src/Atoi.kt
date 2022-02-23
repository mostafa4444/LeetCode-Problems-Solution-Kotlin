object Atoi {

    fun myAtoi(s: String): Int {
        s.split(" ")
        var result = 0
        var index = 0
        var stringType = 1
        if (s[index] == '-'){
            stringType = -1
            index++
        }
        while (index < s.length){
            if(s[index]-'0' !in 0..9)
                return -1;
            result = result*10 + (s[index]-'0')
            index++
        }
        return result * stringType
    }
}