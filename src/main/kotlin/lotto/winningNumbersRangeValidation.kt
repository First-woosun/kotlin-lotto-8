package lotto

fun winningNumbersRangeValidation(inputNumbers: MutableList<Int>): MutableList<Int> {
    var returnNumbers = mutableListOf<Int>()
    for(number in inputNumbers) {
        if(number !in MIN_VALUE..MAX_VALUE) {
            throw ArgumentOutOfRangeException("[ERROR] 당첨 번호는 1 ~ 45 사이의 숫자만 입력 가능합니다.")
        }
        returnNumbers.add(number)
    }
    return returnNumbers
}