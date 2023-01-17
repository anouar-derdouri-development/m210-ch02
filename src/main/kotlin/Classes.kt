
class C : A {
    override fun bar() { print("C: bar") }
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()

        println("D: foo")
    }

    override fun bar() {
//        super<A>.bar()
        // ! Bad: bar in A is abstract

        super<B>.bar()
        // super.bar() is OK

        println("D: bar")
    }
}