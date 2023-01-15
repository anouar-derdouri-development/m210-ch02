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

    println("Person 3:")
    val p3 = Person("hamid", "hassani", 21)
    p3.lastName = "el-hassani"
//    p3.age = 22
    println(p3)
}