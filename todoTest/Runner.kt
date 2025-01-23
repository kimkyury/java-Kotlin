
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
            println("Deleted TODO: ${removed.title}")
        }else{
            println("그 ID는 없는 건디")
        }
    }

    fun showTodos(){
        if (todoList.isEmpty()){
            println("비어있습니다.")
            return
        }

        todoList.forEach { todo ->
            println("ID: ${todo.id}, 제목: ${todo.title}, 완료 여부: ${if (todo.isCompleted) "완료" else "미완료"}")
        }
    }

    fun markCompleted(id: Int){

        val todo = todolist.find{it.id == id}
        if ( todo != null){
            todo.isCompleted = true
            println("완료: ${todo.id})
        } else{
            println("찾을 수 없습니다")
         }

    }
}


fun main (){

    val manager = TodoManager()

    while(true){
        println("-----START------")
        println("1. ADD TODO")
        println("2. Delete TODO")
        println("3. Show TODO")
        println("4. Make Complete TODO")


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
            3 -> {
                manager.showTodos();
            }
            4 -> {
                print("ID: ")
                val id = readLine()?.toIntOrNull()
                if ( id != null){
                    manager.markCompleted(id)
                }

            }
        }
    }   

}