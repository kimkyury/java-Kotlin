fun main (){

    /** 조건문 만들기 */

    // 정석 ver
    val score = 85
    val result = if (score >= 90){
        "90"
    } else if (score >= 80){
        "80"
    }else{
        "50"
    }
    println("Grade: $result")

    // 간단 ver
    val isEven = if ( score %2 == 0) "Even" else "Odd"


    /** when 만들기 */
    val day =3
    val dayName = when (day){
        1 -> "Mon"
        2 -> "Tues"
        3 -> "Wendes"
        else -> "else"
    }

    println("Day: $dayNmae")

}