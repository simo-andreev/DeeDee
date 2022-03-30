fun String.countDistinctCharacters() = lowercase().toList().distinct().count()

fun main(vararg args: String) {
    println("Hello, Kotlin/Native!")
    // Read the input value.
    println("Hello, enter your name:")
    val name = readLine()
    // Count the letters in the name.
    name?.replace(" ", "").let {
        println("Your name contains ${it?.length} letters")
        // Print the number of unique letters.
        println("Your name contains ${it?.countDistinctCharacters()} unique letters")
    }
}