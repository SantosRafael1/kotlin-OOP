
//Por padrão, todos os membros de uma interface são abstratos
interface Person {
    var name: String
    val room: Int get() = 34 // propriedade já implementada
    //val number: Int = 5       não permitido

    //método implementado
    fun sayHello() {
        println("Hello!")
    }

    fun sayYes(): String //método que retorna uma String

    fun sayNo() //método sem implementação
}

//classe Teacher herda a interface Person
class Teacher : Person {

    override var name = "John"

    override fun sayNo () {
       println("No")
    }

    override fun sayYes(): String {
        return "Yes"
    }

    init {
        println("name: $name")
    }
}

fun main() {
    val teacher = Teacher()
    teacher.sayHello()
    println("Room: ${teacher.room}")
}