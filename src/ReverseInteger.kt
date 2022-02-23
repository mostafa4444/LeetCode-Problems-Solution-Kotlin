object ReverseInteger {
    fun reverse(x: Int): Int {
        var entry: Int = x
        var last = 0
        var result = 0
        while(entry != 0){
            val state = entry % 10
            entry /= 10
            result = result * 10 + state
            if ((result - state) / 10 != last)
                return 0
            last = result
        }
        return result
    }
}