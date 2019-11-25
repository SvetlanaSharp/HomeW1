fun main(args: Array <String>) {
    val amount = 200
    val totalamount = 11000
    val fee = calculateFee(200, 11000, false)  // exclusive по умолчанию = false
    println(fee)
}


fun calculateFee(amount: Int, totalamount: Int,exlusive: Boolean = false) : Int {
    var freePrecent = when (totalamount) {
        in 0..1000 -> 30
        in 1001..10000 -> 25
        in 10001..50000 -> 20
        else -> 15
    }
    return amount * (freePrecent - if (exlusive) 5 else 0)/100

}
