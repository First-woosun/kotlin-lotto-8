package lotto

fun costInputValidation(inputString: String): Int {
    var returnValue : Int = 0
    try {
        returnValue = inputString.toInt()
        if (returnValue % INPUT_UNIT != ZERO_VALUE) {
            throw IllegalArgumentException("[ERROR] 로또 구매 비용은 1000원 단위입니다.")
        }

        return returnValue
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("[ERROR] 로또 구입 비용은 정수여야 합니다.")
    }
}