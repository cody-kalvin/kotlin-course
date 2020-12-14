fun main() {
    val browser = Browser()
    browser.load("https://website.com/about")
    browser.load("https://website.com/faq")
}

class Browser {
    init {
        println("Connecting...")
        load("https://website.com/home")
    }

    fun load(url: String) {
        println(url)
    }
}