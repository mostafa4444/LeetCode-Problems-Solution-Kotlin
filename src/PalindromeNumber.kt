object PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        if (x.toString().reversed() == x.toString())
            return true

        return false
    }
}