fun main() {
    var s: String? = "programming in kotlin"

    var c1 = s?.get(1) // Type of c is: Char?
    println("Second character: $c1")

    var c2 = s?.substring(1, 2)?.uppercase()?.get(0)
    println("Second character in UPPERCASE: $c2")
}