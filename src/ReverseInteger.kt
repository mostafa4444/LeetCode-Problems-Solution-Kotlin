object ReverseInteger {
    fun reverse(x: Int): Int {
        val myIntString = x.toString()
        var result = 0
        if (x > Int.MAX_VALUE  || x < Int.MIN_VALUE){
            return 0
        }
        result = if (myIntString.contains("-")){
            myIntString.replace("-" , "").reversed().toInt() * -1
        }else{
            x.toString().reversed().toInt()
        }
        return if (result < Int.MAX_VALUE  && result > Int.MIN_VALUE){
            result
        }else{
            0
        }
    }
}