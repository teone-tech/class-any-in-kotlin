class Person{
    var name : String = ""
    var surname : String = ""

    override fun toString(): String =  "$name + $surname"
    override fun hashCode(): Int {
        return 1

    }

    override fun equals(other: Any?): Boolean {
        if (other is Person)
            return name == other.name && surname == other.surname
        else
            return false


    }
}
fun main() {
    val a = Person().apply {
        name = "a"
        surname = "b"
    }
    val b = Person().apply {
        name = "a"
        surname = "b"

    }
    println(a==b)
}


