fun main() {
//    println(Genre.M.ordinal)

    for (courtesy in Courtesy.values())
        println("${courtesy.ordinal + 1}: ${courtesy.name}→ ${courtesy.value}")

    println()

    var c = Courtesy.valueOf("MR")
    println(c)
}