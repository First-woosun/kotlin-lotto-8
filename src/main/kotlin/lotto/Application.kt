package lotto

import camp.nextstep.edu.missionutils.Randoms

enum class finalWinning(
    val matchNumber: Int,
    val price: Int,
    private val comment: String,
) {
    WINNING_THREE(3, 5000, "3개 일치 (5,000원)"),
    WINNING_FOUR(4, 50000, "4개 일치 (50,000원)"),
    WINNING_FIVE(5, 1500000, "5개 일치 (1,500,000원)"),
    WINNING_FIVE_WITH_BONUS(5, 3000000, "5개 일치, 보너스 볼 일치 (30,000,000)"),
    WINNING_SIX(6, 2000000000, "6개 일치 (2,000,000,000)");
    
    fun getResultComment(count: Int): String = "${this.comment} - ${count}개"
}

const val INPUT_UNIT = 1000
const val ZERO_VALUE = 0
const val LOTTO_NUMBER = 6;
const val MIN_VALUE = 1
const val MAX_VALUE = 45

fun main() {
    // TODO: 프로그램 구현
    // 로또 구입 비용 입력
    var costInput : Int ? = null
    while (costInput == null) {
        try {
            val tempInput = costInputAndSave()
            costInput = costInputValidation(tempInput)
        } catch (e: Exception) {
            println(e.message)
        }
    }

    // 로또 번호 발행
    val lottoNumbers = publicateLottoNumbers(costInput)

    // 당첨 번호 입력
    var winningNumberFlag = false
    var winningNumbers : Lotto? = null
    while (!winningNumberFlag) {
        try {
            val tempWinningNumbers = inputWinningNumber()
            val tempIntegerValidation = winningNumbersIntegerValidation(tempWinningNumbers)
            val tempRangeValidation = winningNumbersRangeValidation(tempIntegerValidation)
            val tempDuplicateValidation = winningNumbersDuplicateValidation(tempRangeValidation)
            winningNumbers = Lotto(tempDuplicateValidation)
            winningNumberFlag = true
        } catch (e: Exception) {
            println(e.message)
        }
    }
    
    //보너스 번호 입력
    var bonusNumber : Int? = null
    while (bonusNumber == null) {
        try {
            val tempBonusNumber = inputBonusNumber()
            val tempIntegerValidation = bonusNumberIntegerValidation(tempBonusNumber)
            val tempRangeValidation = bonusNumberRangeValidation(tempIntegerValidation)
            bonusNumber = winningNumbers?.let { bonusNumberDuplicateValidation(it.getNumbers(), tempRangeValidation ) }
        } catch (e: Exception) {
            println(e.message)
        }
    }

    // 당첨 통계 출력
    val statastics = getLottoResult(lottoNumbers, winningNumbers!!, bonusNumber)
    println("\n당첨 통계\n---")

    var totalPrize = 0L

    finalWinning.entries.forEach { rank ->
        val count = statastics.getValue(rank)
        totalPrize += rank.price.toLong() * count
        println(rank.getResultComment(count))
    }

    // 총 수익률 계산
    val returnRate = getRateOfReturn(totalPrize, costInput)
    println("총 수익률은 ${String.format("%.1f", returnRate)}%입니다.")
}