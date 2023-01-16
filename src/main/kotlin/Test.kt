fun main() {
    try {
        println("Person 1:")
        val p1 = Person("hassan", "alaoui", 23, "a")
        println(p1)
    } catch (e: Exception) {
        println(e.message)
    }

    try {
        println("Person 2:")
        val p2 = Person()
        p2.genre = "z"
        println(p2)
    } catch (e: Exception) {
        println(e.message)
    }

    try {
        println("Person 3:")
        val p3 = Person("hamida", "hassani", 21, "F")
        println(p3)

        p3.genre = "m"
        p3.firstName = "hamid"
        println(p3)
    } catch (e: Exception) {
        println(e.message)
    }

}