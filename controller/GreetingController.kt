
@RestController
@RequestMappin("/api")
class GreetingController{

    @GetMapping("/greet")
    fun greet(@RequestParam name: String): String{
        return "안녕, $name"
    }


    /*  Null-Safety를 이용하기 */
    fun safePrintLength(str: String?){ // str은 null 허용이다

        // str이 null이 더라도 [length] 함수에 접근 가능
        // [A ?: B] 를 통해서, null이라면 str.length가 나오며 아니라면 문자열이 출력됨 
        // println(str!!.length)  // str 무조건 null이 아니여야 할 때. null이라면 RunTimeException 발생함
        println(str?.length ?: "null입니다. ")
    }


    /* Coroutine을 통한 비동기 처리 */
    // [suspend] : 해당 함수가 코루틴 내 동작하는 [중단함수]임을 의미
    // - 중단함수는 호출 시 비동기로 처리 됨
    // - [delay], [withContext] 등의 코루틴 함수와 함께 사용 가능
    // - 일반함수는 코루틴 내 호출 불가 But suspend 함수는 호출 가능
    suspend fun fetchData(): ResponseEntity<String>{
        
        // [withContext] : 코루틴의 실행 컨텍스트(Dispatcher) 변경
        // - 현재 코루틴의 컨텍스트를 일시적으로 변경, 지정된 작업 수행
        // - 작업 완료 시 원래 코루틴 컨텍스트로 복원됨
        // [Dispatchers.IO] : I/O 작업에 최적화된 스레드 풀 사용
        return withContext(Dispatchers.IO){
            ResponseENtity.ok("Data Fetched")
        }
    }

    suspend fun fetchData()
}