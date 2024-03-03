open class Animal(protected val name: String, protected val age: Int, protected val weight: Int) {
    fun walk() {
        println("$name can walk")
    }
}
class Giraf(name: String, age: Int, weight: Int, val neckLength: Int): Animal(name, age, weight) {
    fun neck(){
        println("$name has a long neck")
    }
}
class Elephant(name: String, age: Int, weight: Int): Animal(name, age, weight)

class Flamingo(name: String, age: Int, weight: Int): Animal(name, age, weight) {
    fun fly(){
        println("$name can fly")
    }
}
fun main() {
    val animal1 = Animal("Ivan", 16, 123)
    val animal2 = Animal("Avas", 15, 54)
    val giraf = Giraf("Petr", 17, 700,9)
    giraf.neck()
    val elephant = Elephant("Masha", 34, 1000)
    val flamingo = Flamingo("Ira", 10, 50 )
    flamingo.fly()
    val zoo = listOf<Animal>(animal1, animal2, giraf, elephant, flamingo)
    for (animal in zoo) {
        animal.walk()
    }
}