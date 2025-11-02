package lotto

fun bonusNumberIntegerValidation(inputNumber : String) : Int {
    try {
        val number = inputNumber.toInt()
        return number
    } catch (e: IllegalArgumentException) {
        throw IllegalArgumentException("[ERROR] 보너스 숫자는 정수 하나만 가능합니다.")
    }
}