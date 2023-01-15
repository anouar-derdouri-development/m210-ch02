class Person constructor(
    var firstName: String = "john",
    var lastName: String = "doe",
    var age: Int = 18,
) { // Primary constructor
    override fun toString(): String {
        return "$firstName $lastName - $age years old"
    }
}