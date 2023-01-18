fun main() {
    var s: String? = null

    println(s!!.length)

    throw NullPointerException()
}