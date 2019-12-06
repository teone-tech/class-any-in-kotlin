enum class clases {
    class_one,class_two,class_three
}
class test1{
    override fun toString(): String = "test1"
}
class test2{
    override fun toString(): String = "test2"

}
class test3{
    override fun toString(): String = "test3"
}
fun returnClasses(choices: clases):Any = when(choices){
    clases.class_one -> test1 ()
    clases.class_two -> test2 ()
    clases.class_three -> test3 ()


}
fun main(){
    val a = returnClasses(clases.class_one)
    val b = returnClasses(clases.class_two)
    val c = returnClasses(clases.class_three)
    println(a.toString())
    println(b.toString())
    println(c.toString())
}