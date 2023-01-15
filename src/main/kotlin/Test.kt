fun main() {
    try {
        println("Person 1:")
        val p1 = Person("hassan", "alaoui", 5)
        println(p1)
    } catch (e: Exception) {
        println(e.message)
    }

    try {
        println("Person 2:")
        val p2 = Person()
        p2.lastName = "    "
        println(p2)
    } catch (e: Exception) {
        println(e.message)
    }

    try {
        println("Person 3:")
        val p3 = Person("hamida", "hassani", 21)
        p3.lastName = "el-hassani"
//    p3.age = 22
        println(p3)
        p3.genre = "d"
        println(p3.genre)
    } catch (e: Exception) {
        println(e.message)
    }

    try {
        println("Person 4:")
        val p4 = Person("imane", "soulaimani", 21, "f")
        println(p4)
        println(p4.genre)
    } catch (e: Exception) {
        println(e.message)
    }
}