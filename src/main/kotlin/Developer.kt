class Developer(
    firstName: String,
    lastName: String,
    age: Int,
    var preferredLanguage: String
) : Human(firstName, lastName, age) {
    private fun develop() {
        println("I develop using ${this.preferredLanguage}")
    }

    override fun doThings() {
        super.doThings()
        develop()
    }

    override fun toString(): String {
        return "${super.toString()} - Preffered language: ${this.preferredLanguage}"
    }
}