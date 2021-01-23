class IceCream(val name: String = "cone"){
    val ingreients: ArrayList<String>  by lazy{
        when(name){
            "cone" -> arrayListOf<String>("egg", "sugar",
                "vanilla", "salt", "flour", "butter")
            "chocobar" -> arrayListOf<String>("fat", "milk",
                "sugar", "gelatin", "ovaltin", "chocolate", "cream")
            else -> arrayListOf<String>("milk", "sugar", "water",
                "color")
        }
    }
}

fun main() {

    val cone = IceCream()
    println(cone.ingreients)

    val chocobar = IceCream("chocobar")
    println(chocobar.ingreients)

    val others = IceCream("sokal sondha")
    println(others.ingreients)

}