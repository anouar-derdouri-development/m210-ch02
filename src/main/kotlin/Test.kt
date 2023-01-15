fun main() {
    try {
        println("Person 1:")
        val p1 = Person("hassan", "alaoui", 5)
        println(p1)
    } catch (e: Exception) {
        println(e.message)
    }

    println("Person 2:")
    val p2 = Person()
    p2.lastName = "    " // ToDo: Fix this (+ firstname & age)
    println(p2)
}