fun main() {
    println("Base: ")
    var o1 = Base()
    var o2 = Base()

    o1.p = 2
    o2.p = 5

    o1.f()
    o2.f()

    println("\nNestedClass: ")

    println("Anonymous object: ")
    println(Base.NestedClass().pn) // ? Base.NestedClass() is an anonymous object
    Base.NestedClass().pn += 3
    println(Base.NestedClass().pn)

    println("Named object: ")
    var objOfNestedClass = Base.NestedClass()
    println(objOfNestedClass.pn)
    objOfNestedClass.pn *= 2
    objOfNestedClass.fn()

    println("\nInnerClass: ")

    println(o1.InnerClass().pi)
    o1.InnerClass().fi()
    o2.InnerClass().fi()
}