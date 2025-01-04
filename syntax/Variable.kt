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
}