import kotlin.properties.Delegates

class Car(val brand: String, var color: String, val model: String){
    var fuelTank = Fueltank()
    fun drive(distance: Double){
        var amountOfFuelRequired = (1.0/5.0) * distance;
        if(fuelTank.currentAmountOfFuel >= amountOfFuelRequired)
        {
            println("${distance}km has driven successfully")
            fuelTank.currentAmountOfFuel -= amountOfFuelRequired;
            fuelTank.level = (1 / 20.00) *
                    (fuelTank.currentAmountOfFuel)
        }else println("You don't have sufficient fuel")
    }

}

class Fueltank(){
    var level = 0.0
    var currentAmountOfFuel = 0.0
    companion object{
        var capacity = 20.0
    }
    fun addFuel(amount: Double){
        if(amount + currentAmountOfFuel <= capacity){
            currentAmountOfFuel += amount
            println("has refilled successfully")
            level = (1 / 20.00) * (currentAmountOfFuel)
        }else{
            println("${amount} liter fuel refill not possible")
            println("try ${capacity - currentAmountOfFuel} liter or" +
                    " below of it");
        }
    }
    var lowFuel: Boolean by Delegates.observable(true){
        _, _, _ ->
        if(level < 0.1) println("Warning!!! BEEP BEEP. Low Fuel")
        if(level < 0.1) true else false
    }
}

fun main() {
    val myCar = Car("Toyota", "White", "avalon")
    myCar.drive(10.00)
    myCar.fuelTank.addFuel(20.00);
    myCar.drive(10.00);
    myCar.drive(20.00);
    myCar.drive(70.00);
    println(myCar.fuelTank.level)
    println(myCar.fuelTank.lowFuel)
    myCar.fuelTank.lowFuel = false
    myCar.drive(1.00);
}