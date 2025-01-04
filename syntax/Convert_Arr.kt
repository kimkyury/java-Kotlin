fun main(){
    var a :Int = 54321
    var b : Long = a.toLong() // 명시적형변환, 암시적형변환 불허

    var intArr = arrayOf(1,2,3,4,5);
    var nullArr = arrayOfNulls<Int>(5); // 크기설정 동시에 배열 만들기

    println(intArr[4]);
    println(intArr);


}