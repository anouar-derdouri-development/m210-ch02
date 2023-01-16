class MyClass constructor(var i: Int) {
    companion object {
        var v = true
        fun f(): String {
            return "fun inside companion object"
        }
    }

    override fun toString(): String {
        return "$i"
    }

    fun f(): String {
        return "fun inside MyClass"
    }
}

fun main() {
    var o = MyClass(14)
    println("toString: ${o.toString()}")
    println("i: ${o.i}")
    println("f(): ${o.f()}")

    println()

    println("f(): ${MyClass.f()}")
    MyClass.v = false
    println("v: ${MyClass.v}")
}

