class Base {
    var p: Int = 1

    fun f() {
        println("f from Base (p = ${this.p})")
    }

    class NestedClass {
        var pn: Int = 10

        fun fn() {
            println("fn from NestedClass (pn = ${this.pn})")
        }
    }

    inner class InnerClass {
        var pi: Int = 20

        fun fi() {
            p += pi
            println("fi from InnerClass (p = ${p})")
        }
    }
}