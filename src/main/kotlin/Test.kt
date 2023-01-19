fun main() {
    var p = Person("hassan", "alaoui", 21, Genre.M)
//    p.genre = Genre.F
//    p.firstName = "hassnae"
    println(p)

    println()

    println(Genre.M.courtesy())
    println(Genre.F.courtesy())
}