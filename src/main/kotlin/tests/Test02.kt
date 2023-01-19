package tests

import classes.Carree
import classes.Forme
import classes.Rectangle

fun main() {
    var formes: Array<Forme> = arrayOf(
        Rectangle(2.0, 1.0),
        Rectangle(3.5, 2.0),
        Carree(3.0),
        Rectangle(1.0, 1.2),
    )

   formes.forEach {
       println(typeOfForme(it))
   }
}

