
//classe abstrata não pode ser instanciada, mas pode ser superclasse de subclasse.
abstract class Person (name: String) {

    init {
        println("My name is $name")
    }

    var age: Int = 30

    fun displaySSN(ssn: Int) {
        println("My SSN is $ssn")
    }

    //membro abstrato não tem implementação. Isso deve ser implementado em suas subclasses.
    abstract fun displayJob (description: String)
}

//classe Teacher é derivada da classe abstrata Person
class Teacher (name: String) : Person (name) {

    //Implementação do método abstrato na classe abstrata Person
    override fun displayJob(description: String) {
        println("Job: $description")
    }

}

fun main() {
    val mathTeacher = Teacher ("Johana")
    mathTeacher.displayJob("Math Teacher at the university")
    mathTeacher.displaySSN(54904093)
}