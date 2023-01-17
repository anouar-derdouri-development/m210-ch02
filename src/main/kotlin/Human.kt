import javax.naming.Name

abstract class Human constructor(
    var firstName: String,
    var lastName: String,
    var age: Int,
) : Named {
    override val hint: String
        get() {
            return "Fullname"
        }

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

    override fun name(): String {
        return "$firstName $lastName"
    }

    override fun infos(): String {
        return super.infos() + " It is implemented in Human class."
    }
}