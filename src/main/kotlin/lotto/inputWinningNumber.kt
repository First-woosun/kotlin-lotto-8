package lotto

import camp.nextstep.edu.missionutils.Console

fun inputWinningNumber(): MutableList<String> {
    println("당첨 번호를 입력해 주세요.")
    val inputString = Console.readLine()

    val returnNumbers = inputString.split(",")
    return returnNumbers.toMutableList()
}