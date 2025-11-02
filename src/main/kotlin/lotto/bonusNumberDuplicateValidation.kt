package lotto

fun bonusNumberDuplicateValidation(inputNumbers : List<Int> , inputNumber : Int) : Int {
    for (number in inputNumbers) {
        if(number == inputNumber) {
            throw hasDuplicateException("[ERROR] 보너스 숫자가 중복됩니다.")
        }
    }
    return inputNumber
}