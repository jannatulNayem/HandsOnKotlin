val namesAndAges = mapOf("Nayem" to 28, "Gourango" to 28, "Makin"
        to 21, "Nayon" to 12)

fun main() {
    val filterdAge = namesAndAges.filter { it.value > 18 }
    println(filterdAge)
}
