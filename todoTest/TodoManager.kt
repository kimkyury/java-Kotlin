class TodoManager[
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

]