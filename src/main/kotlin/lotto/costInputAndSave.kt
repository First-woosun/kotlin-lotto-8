package lotto

import camp.nextstep.edu.missionutils.Console

fun costInputAndSave() : String {
    println("구입금액을 입력해 주세요.")
    val input = Console.readLine()
    if(input.isNullOrEmpty()) {
        throw IllegalArgumentException("[ERROR] 값을 입력해주세요.")
    }
    return input
}