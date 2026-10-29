package map

fun rarestWord(text: String): String? {
    val words = text.lowercase()
        .split(Regex("[^\\p{L}\\p{N}]+"))
        .filter { it.isNotEmpty() }
    if (words.isEmpty()) return null
    val counts = HashMap<String, Int>()
    for (word in words) {
        counts[word] = (counts[word] ?: 0) + 1
    }
    return counts.entries
        .minWith(compareBy({ it.value }, { it.key }))
        .key
}
fun main() {
    print("Введите строку: ")
    val text = readln()
    val result = rarestWord(text)
    println(result ?: "В строке нет слов")
}
