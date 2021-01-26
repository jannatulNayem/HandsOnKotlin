import kotlin.math.PI

class Circle(var radius: Double = 0.0){
    var area: Double
        get() {
            return PI * radius * radius
        }
        set(value){
            radius = Math.sqrt(value/ PI);
        }
    fun grow(factor: Int = 3): Double{
        return factor * area
    }
}


fun main(){
    var circle = Circle(1.00)
    println(circle.area)
    println(circle.grow(factor = 3))
}
// Write a method that can change an instance's are by a growth
// factor. For example if you call circle.grow(factor = 3), the
// area of the instance will triple
// Hint: Make area a var and add a setter to it.
