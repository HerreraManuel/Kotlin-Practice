class Person(val firstName:String = "Peter", val lastName:String = "Parker") {
    /*
    val firstName = _firstName
    val lastName: String = _lastName
    */

    // init block
    /*
    init {
        firstName = _firstName
        lastName = _lastName
    }
    */

    /*
    init {
        println("init 1")
    }
    constructor(): this("Peter", "Parker") {
        println("Secondary constructor")
    }
    init {
        println("init 2")
    }
    */

    var nickName: String? = null
    set(value) {
        field = value
        println("New nickname is $value")
    }

    fun printInfo() {
        val nickNameToPrint = nickName ?: "no nickname"
        println("$firstName, ($nickNameToPrint), $lastName")
    }
}