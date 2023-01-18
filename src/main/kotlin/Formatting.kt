object Formatting {
    fun firstName(value: String): String {
        return value[0].uppercase() + value.substring(1).lowercase()
    }

    fun firstName(value: String, enhanced: Boolean): String {
        return if (enhanced) enhancedFirstName(value) else firstName(value)
    }

    fun enhancedFirstName(value: String): String { // ToDo: moHamED amINE→ Mohamed Amine
        return ""
    }

    fun lastName(value: String): String {
        return value.uppercase()
    }
}