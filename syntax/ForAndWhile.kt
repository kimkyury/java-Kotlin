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

}