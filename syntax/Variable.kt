fun main(){

    // 기본자료형에서 값의 미초기화 불허, 명시적 null 초기화는 가능
    var a : Int = 123
    var long : Long = 1234L
    var hex : Int = 0x1af // 16진수, 8진수 표기는 불허

    var charV : Char  = 'a'
    var bool : Boolean = true

    var str = "String!!!"
    var str2 = """String!!!
    ..
    ..
    ..!!!!!!!!""""

    println(str2);



    /** val과 var의 차이 **/
    val name : String = "Kim" // 변경 불가능
    var age: Inte = 30 // 변경 가능

    println("Name: $name, Age: $age")

    age = 20
    println("Updated Age: $age")

}