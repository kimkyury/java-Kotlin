fun html (block: Html.() -> Unit) : Html{
    val html = Html()
    html.block()
    return html
}

class Html {
    private val children = mutableListOf<String>()

    // block: Body.() : Body 객체를 [수신객체]로 사용함을 의미
    fun body(block: Body.() -> Unit){  // Unit:반환값이 없음을 의미
        val body = Body()
        body.block() // 수신 객체로 Body 인스턴스 전달
        children.add("<body>${body.render()}</body>")
    }

    fun render() = "<html>${children.joinToString()}</html>"
}

class Body{
    private val elements = mutableListOf<String>()
    
    /**
     * <h1> 요소 추가
     */
    fun h1(text: String){
        elements.add("<h1>$text</h1>")
    }

    /**
     * <p> 요소 추가
     */
    fun p(text:String){
        elements.add("<p>$text</p>")
    }

    fun render() = elements.joinToString("")
}


fun main(){
    val htmlcontent = html {
        body {
            h1("Welcom ! here is DSL")
            p("Simple Exmpale ㅇㅇ")
        }
    }

    println(htmlcontent.render())
}
