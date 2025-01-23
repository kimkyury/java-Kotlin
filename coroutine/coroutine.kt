import kotlinx.coroutines.*

// runBlocking: 코루틴 빌더
fun main() = runBlocking {
    println("Start: ${Thread.currentThread().name}")

    // 새로운 코루틴 시작시키기
    launch {
        delay(1000L)
        println("World: ${Thread.currentThread().name}")
    }

    // Main 코루틴
    println("Hello: ${Thread.currentThread().name}")
    delay(2000L)

    // Output:: 
    // START -> Hello -> World
}