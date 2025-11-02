package lotto

fun winningNumbersDuplicateValidation(inputNumbers: MutableList<Int>): MutableList<Int> {
    if(inputNumbers.size != inputNumbers.toSet().size) {
        throw hasDuplicateException("[ERROR] 당첨 번호 중복은 혀용되지 않습니다.")
    }
    return inputNumbers
}