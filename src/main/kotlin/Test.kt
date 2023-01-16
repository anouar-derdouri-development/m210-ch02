// const val b = 7 // Good
// const val b = f() // Bad
// const val b by lazy { 7 } // Bad

fun main() {
//    val a = f() // Ok
//    val a by lazy { f() } // Ok

    // val b = 7 // Good
    // const val b = 7 // Bad

//    a = 8 // Bad
//    b = 8 // Bad
}

fun f() : Int {
    return 7
}

class MyClass {
//    val a = 7 // Good
//    const val a = 7 // Bad
}