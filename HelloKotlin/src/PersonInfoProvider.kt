interface PersonInfoProvider {
    val providerInfo : String

    fun printInfo(person: Person) {
        println(providerInfo)
        person.printInfo()
    }

}

interface SessionInfoProvider{
    fun getSessionId() : String
}

open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {
    open val sessionIdPrefix = "Session"

    override val providerInfo : String
    get() =  "BasicInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print statement")
    }

    override fun getSessionId(): String {
        return sessionIdPrefix
    }


}

fun main() {
    val provider = FancyInfoProvider()
    provider.printInfo(Person())
    provider.getSessionId()

    checkTypes(provider)
}

fun checkTypes(infoProvider: PersonInfoProvider){
    if(infoProvider is SessionInfoProvider){
        println("is a session info provider")
        // (infoProvider as SessionInfoProvider).getSessionId()
        infoProvider.getSessionId()
    }
    else {
        println("not a session provider")
    }
}