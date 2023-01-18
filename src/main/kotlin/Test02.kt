fun main() {
    var s: String? = null
    var l = s?.length // l is of type: Int?

    if (s != null && l != 0)
        println("String length is $l")
    else
        println("String is empty")
}