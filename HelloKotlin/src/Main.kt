var firstName: String = "Mike"
val lastName: String = "Smith"

fun main() {
    println("Hello Kotlin")

    // immutable variable
    val name: String = "Manuel"
    println(name)

    // mutable variable
    var nickname: String = "Kyle"
    println(nickname)
    nickname = "Manuel"
    println(nickname)

    // Using global variables
    println(firstName)
    println(lastName)

    // nullable variable
    var fish : String? = "goldfish"
    println(fish)
    fish = null
    println(fish)

}