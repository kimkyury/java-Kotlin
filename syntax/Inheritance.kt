open class Animal(val name : String){
    open fun sound(){
        println("$name makes some noize")
    }
}

class Dog(name: String) : Animal(name){
    override fun sound(){
        println("$name: wal wal!!!!!")
    }
}

object Singleton {
    var count: Int = 0

    fun increment(){
        count++
    }
}

data class User(val name:String, val age:Int)

fun main(){

    println(">>>>>>>>Inheritance")
    val dog = Dog("happy")
    dog.sound()

    println(">>>>>>>Data Class")
    val user1 = User("Alice", 25)
    val user2 = user1.copy(age=26) // 복사와 동시에 수정

    println(user1)
    println(user2)

    println(">>>>>>>Singleton With [object] keyword")
    Singleton.increment()
    Singleton.increment()
    println("Count: ${Singleton.count}")

}