class SumOfInts constructor(
    a: Int,
    b: Int,
) {
    var s: Int = 0
        private set

    init {
        this.s = a + b
    }

    constructor(a: Int, b: Int, c: Int) : this(a, b) { // Secondary constructor
        this.s += c
    }

    constructor(a: Int, b: Int, c: Int, d: Int) : this(a, b, c) { // Another secondary constructor
        this.s += d
    }

    override fun toString(): String {
        return "$s"
    }
}

fun main() {
    var s1 = SumOfInts(12, 5)
    println("Sum 1: $s1")

    var s2 = SumOfInts(2, -5, 6)
    println("Sum 2: $s2")

    var s3 = SumOfInts(2, 5, 6, 10)
    println("Sum 3: $s3")
}

