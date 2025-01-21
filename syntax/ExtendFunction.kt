fun String.addPrefix(prefix: String): String{
    return "$prefix$this"
}

val String.firstChar: Char
    get() = this[0]


object Logger{
    fun log(message: String){
        println("Log: $message")
    }
}

class User(val name: String){
    companion object{
        fun createGuestUser(): User{
            return User("Guest")
        }
    }
}

class Box<T>(val value: T)

fun <T> printItems(items: List<T>){
    for (item in items){
        println(item)
    }
}

fun <T: Number> sum(a: T, b: T): Double{
    return a.toDouble() + b.toDouble()
}

fun main(){
    

    println(">>>>>>>> Extend Function")
    // 확장함수는 클래스 내부의 private, protected 멤버에는 접근할 수 없다
    val name = "Kyuri"
    println(name.addPrefix("HIHI! "))

    println(">>>>>>>> Extend Property")
    // 클래스에 프로퍼티를 추가함
    // 실제 필드가 추가되는 것은 아니며, 계산된 값을 반환함
    val text = "Kotlin"
    println(text.firstChar)

    println(">>>>>>> Singleton")
    Logger.log("This is a log message")


    println(">>>>>>> Companion Object(동반객체)") // It's like "static" At Java
    val guest = User.createGuestUser()
    println(guest.name);

    println(">>>>>>> Generic")
    val intBox = Box(10)
    val stringBox = Box("Hello")
    println(intBox.value)
    println(stringBox.value)

    println(">>>>>>> Generic With Fun")
    val numbers = listOf(1, 2, 3)
    val Strings = listOf("A", "B", "C")
    printItems(numbers) 
    printItems(Strings)

    println(sum(10, 20))
    println(sum(10.3, 9.2))
}