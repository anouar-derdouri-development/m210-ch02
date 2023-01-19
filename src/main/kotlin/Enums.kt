enum class Genre {
    M,
    F;

    fun courtesy(): Courtesy {
        return if (this == M) Courtesy.MR else Courtesy.MISS_MRS
    }
}

enum class Courtesy(var value: String) {
    MR("Mr"),
    MISS_MRS("Miss/Mrs");

    override fun toString(): String {
        return value
    }
}