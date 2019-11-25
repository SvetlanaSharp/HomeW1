fun main() {
    val weight =100
    val grewup = 170
    val index = bodyMassIndex (100.0, 170.0)
    val verdict = when(index) {
        in 0.0..16.0 -> "Выраженный дефицит массы тела"
        in 16.1..18.51 -> "Недостаточная (дефицит) масса тела"
        in 18.51..24.99 -> "Норма"
        in 25.0..30.0 -> "Избыточная масса тела (предожирение)"
        in 30.1..35.0 -> "Ожирение"
        in 35.1..40.0 -> "Ожирение резкое"
        else ->"Очень резкое ожирение"
    }
    println(verdict)

}

fun bodyMassIndex (weight:Double, grewup: Double): Double {
    val grewupM = grewup / 100
    return weight / (grewupM * grewupM)
}

