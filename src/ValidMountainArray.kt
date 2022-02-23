object ValidMountainArray {

    fun validMountainArray(arr: IntArray): Boolean {
        if (arr.size < 3)
            return false
        var startPtr = 0
        var endPtr = arr.size -1

        while (startPtr + 1 < arr.size -1 && arr[startPtr] < arr[startPtr+1]){
            startPtr++
        }

        while (endPtr - 1 > 0 && arr[endPtr] < arr[endPtr-1]){
            endPtr--
        }
        return startPtr == endPtr
    }

}