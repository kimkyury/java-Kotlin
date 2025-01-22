fun main (){

    val manager = TodoManager()

    while(true){
        println("-----START------")
        println("1. ADD TODO")
        println("2. Delete TODO")


        when (readLine()?.toIntOrNull()){
            1 -> {
                print("TITLE: ")
                val title = readLine().orEmpty()
                manager.addTodo(title)
            }
            2 ->{
                print("ID: ")
                val id = readLine().toIntOrNull()
                if ( id != null){
                    manager.removeTodo(id) 
                }
            }
        }
    }   

}