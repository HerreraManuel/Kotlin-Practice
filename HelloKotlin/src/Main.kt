var firstName: String = "Mike"

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

    // nullable variable
    var fish : String? = "goldfish"
    println(fish)
    fish = null
    println(fish)

    // type inference
    var greeting: String? = "hi"
    val number = 2
    println(greeting)
    println(number)

    // Basic Flow Control
    greeting = null
    greeting = "Hello"
    when (greeting) {
        null -> println("This is still a null")
        else -> println(greeting)
    }

    greeting = null

    // Calling the basic kotlin function
    println(getGreeting())
    sayHello()
    newHello("Kotlin")
    newHelloGreeting("Hi", "Kotlin")

    //Arrays
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))

    for(interestingThing in interestingThings) {
        println(interestingThing)
    }

    // functional approach
    // renamed value passed to the lambda
    interestingThings.forEach{ interestingThing ->
        println(interestingThing)
    }

    interestingThings.forEachIndexed{index, interestingThing->
        println("$interestingThing is at index $index")
    }

    // using lists
    val moreInterestingThings = listOf("Kotlin", "Programming", "Linux")
    println(moreInterestingThings.size)
    println(moreInterestingThings.get(0))
    moreInterestingThings.forEach { anInterestingThing ->
        println(anInterestingThing)
    }
    moreInterestingThings.forEachIndexed{index, anInterestingThing ->
        println("$anInterestingThing is at index $index")
    }
    moreInterestingThings.forEachIndexed{index, anInterestingThing ->
        println("$anInterestingThing is at index $index")
    }

    // maps
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach{ (key, value) -> println("$key -> $value") }

    // mutable list
    val boringThings = mutableListOf("Games", "Cats", "Cars")
    boringThings.add("Planes")
    boringThings.forEach{ println(it) }

    // passing lists to func
    newGreetings("Hello", moreInterestingThings)

    // vararg
    val mediocreThings = arrayOf("Plants", "Rugs", "Buildings")
    sayBye("Goodbye", "Kotlin", "Programming", "Comic Books")
    sayBye("Goodbye", *mediocreThings)

    // named arguments
    greetPerson(name = "Nate", greeting = "Hi")
    greetPerson(name = "Nate")

    //using classses
    val person = Person()
}

// Basic Kotlin Function
fun getGreeting(): String {
    return "Hello Kotlin"
}

// single expression
fun newGreeting() = "Hello world"

fun sayHello(): Unit {
    println(newGreeting())
}
/*
fun newHello(itemToGreet:String){
    // val msg = "Hello $itemToGreet"
    // println(msg)
}
 */

fun newHello(itemToGreet:String) = println("Morning $itemToGreet")

fun newHelloGreeting( greeting:String, itemToGreet:String) = println("$greeting, $itemToGreet")

fun newGreetings(greeting:String, itemsToGreet:List<String>){
   itemsToGreet.forEach{itemToGreet ->
       println("$greeting, $itemToGreet")
   }
}

// vararg
fun sayBye(greeting:String, vararg itemsToLeave:String){
    itemsToLeave.forEach {itemToLeave ->
        println("$greeting, $itemToLeave")
    }
}

fun greetPerson(greeting:String = "Goodbye", name:String) = println("$greeting, $name")