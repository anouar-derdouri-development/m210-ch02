fun main() {
    var d = Developer("hassan", "alaoui", 23, "kotlin")

    println("${d.hint}: ${d.name()}")

    d.firstName = "ali"

    println("${d.hint}: ${d.name()}")

    println(d.infos())
}