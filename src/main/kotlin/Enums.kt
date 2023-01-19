enum class Genre {
    M,
    F;

    fun courtesy(): String {
        return if (this == M) "Mr" else "Miss/Mrs"
    }
}