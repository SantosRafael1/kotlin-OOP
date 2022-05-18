
open class Person (name: String, age: Int) {
    init {
        println("name: $name")
        println("age: $age")
    }

    open fun displayHello() {
        println("Hello")
    }

    fun talk() {
        println("I'm talking...")
    }

    open fun displayAge(age: Int) {
        println("My age is $age")
    }
}

class MathTeacher (name: String, age: Int) : Person (name, age) {
    fun teachMath() {
        println("they is teaching math...")
    }

    //sobrepor o método displayHello()
    override fun displayHello() {
        println("Hello in another way!")
    }
}

class Businessman (name: String, age: Int) : Person (name, age) {
    fun runBusiness () {
        println("Are running a business")
    }
}

class Footballer (name: String, age: Int) : Person (name, age) {
    fun playFootball() {
        println("Are playing football")
    }

    override fun displayAge(age: Int) {
        //a palavra-chave super é usada para acessar propriedades e métodos da classe derivada
        super.displayAge(age)
        println(age - 1)
    }
}

fun main() {
    val mathTeacher = MathTeacher("Mrs. Lane", 30)
    mathTeacher.teachMath()
    mathTeacher.displayHello()

    val businessman = Businessman("Johnson", 35)
    businessman.runBusiness()
    businessman.talk()

    val footballer = Footballer("Josh", 23)
    footballer.displayAge(32)
}