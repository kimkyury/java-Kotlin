fun main (){

    /* for */

    // ver1
    val items = listOf("String", "kim", "kimkim", "kgyury")
    for(item in items){
        println(item)
    }

    // ver2 (with Idx)
    for( (idx, v) in items.withIndex()){
        println("Idx: $idx: $v")
    }

    // ver2 (range)
    println("----defult----")
    for(i in 1..5){
        println(i)
    }

    println("----until")
    for(i in 1 until 5){
        println(i)
    }

    println("---downTo----")
    for(i in 5 downTo 1){
        println(i)
    }

    println("---step----")
    for(i in 1..10 step 2){
        println(i)
    }


    /* while */
    println("-----------------")

    var count = 3
    while (count > 0){
        println("$count")
        count--
    }

    println("-----------------")
    do {
        println("$count")
    }while (count > 3)

    println("-----------------")

    // 1 부터 100까지 숫자 출력하기
    for(i in 1..100){
        print("$i "  )
    }
    println("-----------------")

    // 1부터 100사이의 짝수만 출력하기
    var num = 1
    while(num < 101){
        print("$num " )
        num +=2
    }

    // when을 통해 숫자를 스트링 치환하기
    // 사용자의 입력받기, 변환 실패 시에는 Null을 가짐
    println("-----------------")

    val input = readLine()?.toIntOrNull()
    val numStr = when {
        input == 1 -> "하나"
        input == 2 -> "둘"
        else -> "기타"
    }
    print("$numStr")
}