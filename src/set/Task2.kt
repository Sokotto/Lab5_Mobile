package set

fun readNumbers(prompt: String): List<Int> {
    print(prompt)
    return readln().split(" ").filter { it.isNotEmpty() }.map { it.toInt() }
}
fun commonNumbers(first: List<Int>, second: List<Int>): List<Int> {
    val set1 = first.toSet()
    val set2 = second.toSet()
    return set1.intersect(set2).sorted()
}
fun main() {
    val first = readNumbers("Первый список: ")
    val second = readNumbers("Второй список: ")
    val common = commonNumbers(first, second)
    println("Общие числа: ${common.joinToString(" ")}")
}
