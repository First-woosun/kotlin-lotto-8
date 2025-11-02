package lotto

import camp.nextstep.edu.missionutils.Console

fun inputWinningNumber(): MutableList<String> {
    println("당첨 번호를 입력해 주세요.")
    val inputString = Console.readLine()
    if (inputString.isNullOrEmpty()) {
        throw IllegalArgumentException("[ERROR] 값을 입력해주세요.")
    }
    val returnNumbers = inputString.split(",")
    return returnNumbers.toMutableList()
}