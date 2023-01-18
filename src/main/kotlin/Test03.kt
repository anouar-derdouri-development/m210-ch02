fun main() {
    var s:Any = "123"

    var i = s is Int
    println(i)

    s = 14
    i = s is Int
    println(i)

    s = 14.3
    i = s is Int
    println(i)

    s = 14.3
    i = s !is Int
    println(i)

    s = 14.3.plus(5)
    i = s !is Int
    println(i.not()) // ? i.not() = !i
}
