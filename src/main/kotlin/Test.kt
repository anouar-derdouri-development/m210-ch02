fun main() {
    var s: String? = "null"

    s?.let {
        println(s.length)

        for (i in s.indices)
            println(s.get(i))
    }

}