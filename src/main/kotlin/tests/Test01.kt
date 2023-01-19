package tests

import classes.Carree
import classes.Forme
import classes.Rectangle

fun main() {
//    var f: Forme() // ? sealed→ abstract

    var f: Forme = Rectangle(2.0, 6.0)
    println(typeOfForme(f))

    f = Carree(2.0)
    println(typeOfForme(f))
}

fun typeOfForme(f: Forme): String {
    when (f) {
        is Carree -> return "c"
        is Rectangle -> return "r"
    }
}

