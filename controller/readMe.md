# 코루틴을 통한 비동기 처리 분석

```
@GetMapping("/data")
suspend fun fetchData(): ResponseEntity<String> {
    return withContext(Dispatchers.IO) {
        ResponseEntity.ok("Data fetched")
    }
}
```

**suspend**
- 코루틴 내에서 동작하는 중단 함수임을 나타내는 키워드
- 호출 시 비동기로 처리됨 (delay, withContext 등의 코루틴 함수와 함께 사용 가능)

**withContext()**
- 현재 코루틴의 컨텍스트를 일시적으로 변경하고 지정된 작업을 수행함
- 컨텍스트 변경이란, 실행환경(Thread || Dispatcher)을 변경한다는 것임
- 작업이 완료되면 원래의 코루틴 컨텍스트로 복원됨

**Dispatchers.IO**
- 입출력(I/O) 작업에 최적화된 스레드 풀을 사용하도록함
- DB Query, File I/O, Request Network 등.. 시간이 오래 걸리는 작업 처리

**동작 과정 정리**
1. Client가 GET /data를 요청한다
2. SpringBot가 이 요청을 FetchData 함수에 매핑함
3. fetchData 함수는 suspend 함수로 정의되어있으므로 Coroutine에서 실행됨
4. withContext() 블록이 실행되며, Dispatchers.IO를 통해 I/O 최적화 스레드로 변경됨
5. ReponseEntity.ok() 실행으로 HTTP 응답 객체 생성
6. Client에게 200 OK 응답이 반환됨

**왜 suspend, withContext를 쓸까**
- 비동기 작업을 순차적으로 처리하면서도 스레드를 차단하지 않고 효율적으로 쓰자
- 기존 비동기 작업은 콜백 헬을 유발하지만, 이를 통해 동기 코드처럼 깔끔하게 비동기 작업을 작성할 수 있다
- 모든 코드를 기본 스레드에서 실행하면 블로킹 작업이 다른 작업을 지연시킬 수 있었다

