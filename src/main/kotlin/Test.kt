fun main() {
    var d: Developer? = Developer("hassan", "alaoui", 23, "kotlin")

    if (d != null) {
        println(d.name())
    }

//    d.firstName = "ali"
//
//    println("${d.hint}: ${d.name()}")
//
//    println(d.infos())
}