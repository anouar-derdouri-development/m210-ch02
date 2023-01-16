class SumOfInts constructor() {
    var s: Int = 0
        private set

    init {
        println("Init block of SumOfInts class")
    }

    constructor(a: Int, b: Int): this() {
        s = a + b
    }

    constructor(a: Int, b: Int, c: Int) : this(a, b) {
        s += c
    }

    constructor(a: Int, b: Int, c: Int, d: Int) : this(a, b, c) {
        s += d
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

