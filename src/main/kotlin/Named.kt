interface Named {
    val hint: String

    fun name(): String

    fun infos(): String {
        return "This method came from Named interface, it is not abstract."
    }
}