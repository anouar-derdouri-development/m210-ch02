open class Human constructor(
    var firstName: String,
    var lastName: String,
    var age: Int,
) {
    override fun toString(): String {
        return "${this.firstName} ${this.lastName} - ${this.age} years old"
    }
}