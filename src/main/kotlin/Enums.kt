enum class Genre {
    M {
        override fun details(): String {
            return "Male"
        }
    },
    F {
        override fun details(): String {
            return "Female"
        }
    };

    fun courtesy(): Courtesy {
        return if (this == M) Courtesy.MR else Courtesy.MISS_MRS
    }

    abstract fun details(): String
}

enum class Courtesy(var value: String) {
    MR("Mr"),
    MISS_MRS("Miss/Mrs");

    override fun toString(): String {
        return value
    }
}