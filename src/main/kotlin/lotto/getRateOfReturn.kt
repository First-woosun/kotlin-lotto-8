package lotto

const val HUNDRED = 100.0

fun getRateOfReturn(totalReturn : Long, inputCost : Int) : Double {
    return (totalReturn.toDouble() / inputCost.toDouble()) * HUNDRED
}