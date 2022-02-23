import java.util.*

object DetectCapital {

    //USA , Google , FlaG
    fun detectCapitalUse(word: String): Boolean {
        return when (word) {
            word.uppercase() -> true
            word.lowercase() -> true
            else -> word.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() } == word
                    && word.substring(1 , word.length) == word.substring(1 , word.length).lowercase()

        }
    }


}