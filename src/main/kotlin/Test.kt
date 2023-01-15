fun main() {
    println("Person 1:")
    val p1 = Person("hassan", "alaoui", 23)
    println(p1)

    println("\nPerson 2:")
    val p2 = Person()
    println(p2)

    println("\nPerson 3:")
    val p3 = Person(firstName = "jane", age = 21)
    println(p3)

    println("\nPerson 4:")
    val p4 = Person("hamid", "hassani")
    println(p4)
    p4.firstName = "hamida"
    p4.age = 19
    println("After: \n" +
            "Firstname: ${p4.firstName}\n" +
            "Lastname: ${p4.lastName}\n" +
            "Age: ${p4.age}")
}