
data class TodoItem (
    var id : Int,
    var title : String,
    var content : String = "",
    var isCompleted : Boolean = false
)


class TodoManager{
    private val todoList = mutableListOf<TodoItem>()
    private var nextId =1

     fun addTodo(title : String){
        val todo = TodoItem(id = nextId++, title = title)
        todoList.add(todo);
        println("Added TODO: $title")
    }

     fun removeTodo(id: Int){

        val removed = todoList.removeIf {it.id == id}

        if (removed){
            println("Deleted TODO: $removed.title")
        }else{
            println("그 ID는 없는 건디")
        }
    }
}


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
                val id = readLine()?.toIntOrNull()
                if ( id != null){
                    manager.removeTodo(id) 
                }
            }
        }
    }   

}