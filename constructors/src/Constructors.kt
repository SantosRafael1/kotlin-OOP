
//construtores primários

//o bloco de código dentro dos parênteses é o construtor primário.
//há duas propriedades no construtor: name e age
/*class Person (var name: String, var age: Int) {

}*/

//construtor com bloco de inicialização. Nesse caso, usa-se o comando init para inicializar o construtor
//com algum código adicional
class Person (fName: String, age: Int) {
    private var firstName: String
    private var personAge: Int

    init {
        println("A person has been created!")
        firstName = fName
        personAge = age
        println("Name = $firstName")
        println("Age = $age")
    }
}

fun main() {
    Person("John", 32)
}