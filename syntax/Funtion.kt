fun main(){

    var a = 1234 //int
    var b = 1234L // long
    var c = 12.45 // double
    var d = 12.45f // float

    println(add(1,2,3))
    println("2:::::" +  add2(1,2,3))

}

// 함수명(input) : 반환
fun add(a: Int, b:Int, c: Int) : Int {
    return a + b + c
}

fun add2(a: Int, b:Int, c: Int) = a + b+ c