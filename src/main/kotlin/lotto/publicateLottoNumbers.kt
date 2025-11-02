package lotto
import camp.nextstep.edu.missionutils.Randoms

fun publicateLottoNumbers(inputNumber: Int): MutableList<MutableList<Int>> {
    val lottoNumbers = inputNumber / INPUT_UNIT
    println("\n${lottoNumbers}개를 구매했습니다.")

    var returnNumbersCollections = mutableListOf<MutableList<Int>>()
    for (attempt in ZERO_VALUE..<lottoNumbers) {
        returnNumbersCollections.add(Randoms.pickUniqueNumbersInRange(MIN_VALUE, MAX_VALUE, LOTTO_NUMBER))
        println(returnNumbersCollections[attempt])
    }
    println("")
    return returnNumbersCollections
}