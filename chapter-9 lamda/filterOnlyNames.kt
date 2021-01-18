val namesAndAges = mapOf(
    "Nayem" to 28, "Gourango" to 28, "Makin"
            to 21, "Nayon" to 12
)

fun main() {
    val filterdNames = namesAndAges.filter { it.value > 18 }.keys
        .toList()
    println(filterdNames)
}
