object RunLengthEncodingCompression {

    fun compress(inputString: String): String{
        val result = StringBuilder()
        var previousChar = inputString[0]
        var lastKey = 0
        var count = 1
        val myMap = HashMap<Int , Pair<Int , Char>>()
        inputString.substring(1).forEachIndexed { index, c ->
            if (c == previousChar){
                count++
                if (index+1 == inputString.length -1){
                    myMap[lastKey] = Pair(count , inputString[index])
                }
            }else{
                myMap[lastKey] = Pair(count , inputString[index -1])
                count = 0
                lastKey++
                if (index < inputString.length-1){
                    previousChar = inputString[index + 1]
                    count++
                }
            }
        }
        myMap.forEach {
            result.append("${it.value.first}${it.value.second}")
        }
        return result.toString()
    }

}