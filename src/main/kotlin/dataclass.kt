fun main() {
    val entertainment = Article("E! News", "Entertainment content", 100)
    val sports = Article("Sports News", "Sports content", 150)
    val originals = listOf<Article>(entertainment, sports)

    val archive = mutableListOf<Article>()
    for (article in originals) {
        archive.add(article)
        val copy = article.copy(title = "Exclusive: " + article.title)
        archive.add(copy)
    }

    println(archive)
}

data class Article(
    var title : String,
    var content: String,
    var readers: Int
)