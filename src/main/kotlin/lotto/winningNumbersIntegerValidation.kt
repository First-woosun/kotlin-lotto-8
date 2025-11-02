package lotto

fun winningNumbersIntegerValidation(stringCollection: MutableList<String>) : MutableList<Int> {
    var returnCollection : MutableList<Int> = mutableListOf()
    for(string in stringCollection) {
        var tempNumber : Int = 0
        try {
            tempNumber = string.toInt()
        } catch (e: IllegalArgumentException) {
            throw IllegalArgumentException("[ERROR] 당첨 번호는 숫자만 입력 가능합니다.")
        }
        returnCollection.add(tempNumber)
    }
    return returnCollection
}