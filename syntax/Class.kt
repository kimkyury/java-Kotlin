class Person(val name: String, var age: Int)

class Car(val brand:String, val year:Int){
    fun displayInfo(){
        println("Brand: $brand, Year:$year")
    }
}

class Animal(val name:String){ // 기본생성자를 정의하였음
    var age: Int = 0

    constructor(name: String, age: Int) : this(name){
        // 1. this(name)을 통해 기본생성자로 name을 초기화함
        // 2. age를 추가로 초기화함
        this.age = age
    }

    fun displayInfo(){
        println("Name: $name, Age:$age")
    }

}

fun main(){

    /* class And Object */
    val person = Person("Alice", 25)
    println("Name ${person.name}, Age: ${person.age}")

    person.age = 26 // age는 var이므로 변경 가능
    println("Age is ${person.age}")

    /* Default Constructor */
    println(">>>>>>>>>>Default Contructor")
    val car = Car("현대", 2022)
    car.displayInfo()

    /* secondary constructor(보조 생성자) */
    println(">>>>>>>>>>Secondary Contructor")
    val animal = Animal("Dog", 3)
    animal.displayInfo()
}

