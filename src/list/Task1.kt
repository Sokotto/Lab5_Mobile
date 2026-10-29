package list

fun countPairs(numbers: List<Int>): Long {
    val sorted = numbers.sorted()
    var pairs = 0L
    var i = 0
    while (i < sorted.size) {
        var j = i
        while (j < sorted.size && sorted[j] == sorted[i]) j++
        val k = (j - i).toLong()
        pairs += k * (k - 1) / 2
        i = j
    }
    return pairs
}

fun main() {
    print("Введите числа через пробел: ")
    val numbers = readln().split(" ").filter { it.isNotEmpty() }.map { it.toInt() }
    println("Количество пар: ${countPairs(numbers)}")
}
