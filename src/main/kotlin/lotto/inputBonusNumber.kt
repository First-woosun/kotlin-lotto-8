package lotto

import camp.nextstep.edu.missionutils.Console

fun inputBonusNumber(): String{
    println("\n보너스 번호를 입력해주세요.")
    val returnString = Console.readLine()
    if (returnString.isNullOrEmpty()) {
        throw IllegalArgumentException("[ERROR] 값을 입력해주세요")
    }
    return returnString
}