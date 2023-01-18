fun main() {
    try {
        var s: String = "123"
//        var s: Any = "123"
        var i = s as Int // ? Unsafe cast
        println(i)
    } catch (e: Exception) {
        println(e.message)
    }

    try {
        var d = 123.2
        var i = d as Int // ? Unsafe cast
        println(i)
    } catch (e: Exception) {
        println(e.message)
    }

    try {
//        var v = 123
//        var v:Int = 123
        var v:Any = 123

        var i = v as Int // ? Unsafe cast
        println(i)
    } catch (e: Exception) {
        println(e.message)
    }

    try {
        var s = "123"
        var i = s as? Int // ? Safe cast
        println(i)
    } catch (e: Exception) {
        println(e.message)
    }

    try {
        var s = "123"
        var i = s as Int? // ? Unsafe cast
        println(i)
    } catch (e: Exception) {
        println(e.message)
    }
}
