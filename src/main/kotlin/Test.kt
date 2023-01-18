fun main() {
    var a1 = Account("hassan.alaoui", "123456")
    var a2 = Account("hassan.alaoui", "123456")
    var a3 = Account("hamid.hassani", "987465")
    var a4 = a1.copy()
    var a5 = a3

    a4.password = "000000"
    a5.password = "111111"
    a5.password = "111111"

    println("a1: $a1")
    println("a2: $a2")
    println("a3: $a3")
    println("a4: $a4")
    println("a5: $a5")
    println("a1 ?= a2: ${a2.equals(a1)}")
    println("a1 ?= a3: ${a1 == a3}")

    println("${a1.component1()}")
    println("${a1.component2()}")
}