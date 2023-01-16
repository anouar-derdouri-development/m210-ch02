abstract class Human constructor(
    var firstName: String,
    var lastName: String,
    var age: Int,
) {
    fun speak() {
        println("I speak")
    }

    fun sleep() {
        println("I sleep")
    }

    open fun doThings() {
        speak()
        sleep()
    }

    abstract fun expressSelf(): String

    override fun toString(): String {
        return "${this.firstName} ${this.lastName} - ${this.age} years old"
    }
}