fun main() {
    val book = Book(Book.getEditor())
    println(book.editor.name)
}

class Book(val editor: Editor) {
    companion object {
        fun getEditor() = Editor("Antonio")
    }
}

class Editor(val name: String)