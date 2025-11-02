package lotto

import camp.nextstep.edu.missionutils.Console

fun costInputAndSave() : String {
    println("구입금액을 입력해 주세요.")
    var input : String = Console.readLine()
    return input
}