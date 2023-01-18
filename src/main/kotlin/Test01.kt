fun main() {
    var d: Developer? = Developer("hassan", "alaoui", 23, "kotlin")
    println(d?.name())

    d = null

    println(d.toString()) // ? d?.toString() isn't mandatory

    d?.firstName = "ali"
    println("${d?.hint}: ${d?.name()}")

    println(d?.infos())
}