
//Data Class é usada em situações onde a classe deve unicamente segurar DADOS
//OBS: uma Data Class deve ao menos ter um parâmetro no construtor primário
data class User (var name: String, var age: Int)

fun main(args: Array<String>) {
    val me = User("Rafael", 34)
    println("Name: ${me.name}")
    println("Age: ${me.age}")

    //Data Class gera alguns métodos para manipular os dados
    val user1 = me.copy(name = "Rafa", age = 3) //função copy copía as propriedades do objeto 'me'
    println("User 1: ${user1.name}")
    println("User 1: ${user1.age}")

    //toString() retorna uma representação do objeto em formato de string
    val user2 = User("User2", 44)
    println(user2.toString())

    //hashCode() retorna um código hash do objeto em questão
    val user3 = User("user3", 77)
    println(user3.hashCode())
}