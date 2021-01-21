class TShirt(
    val size: String,
    val color: String,
    val price: Double,
    val optionalImageAtFornt: Boolean
    )


class User(
    val name: String,
    val email: String,
    val shoppingCart: ShoppingCart,
    val address: Address
    )

class Address(
    val name: String,
    val street: String,
    val city: String,
    val zip: Int
    )


class ShoppingCart(val shippingAddress: Address){
    val currentOrderList:MutableList<TShirt> = mutableListOf()
    fun calculatePrice(): Double{
        var totalPrice = 0.0
        for(item in currentOrderList){
            totalPrice += item.price
        }
        return totalPrice
    }
    fun addItem(item:TShirt){
        currentOrderList.add(item)
    }

}

fun main(){
    val tshirt1 = TShirt("XL", "Blue", 350.00, true)
    val tshirt2 = TShirt("L", "Red", 450.00, false)

    val myAddress = Address("Adharkotha", "202", "boalmari", 7860)

    val nayem = User("Nayem", "nayem@gmail.com", ShoppingCart(myAddress),
        myAddress)


    nayem.shoppingCart.addItem(tshirt1)
    nayem.shoppingCart.addItem(tshirt2)

    val totalBill = nayem.shoppingCart.calculatePrice()
    println("Total Bill: " + totalBill)
    println("Shipping address: ${nayem.address.name}, ${nayem.address
        .street}, ${nayem.address.city}, ${nayem.address.zip}")
}
