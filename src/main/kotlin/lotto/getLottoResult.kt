package lotto

fun getLottoResult(lottoNumbers: MutableList<MutableList<Int>>, winningNumbers: Lotto, bonusNumber: Int): Map<finalWinning, Int> {
    val winCounts = lottoNumbers.mapNotNull { userLotto ->
        val matchCount = winningNumbers.compare(userLotto.toMutableList())
        val hasBonus = userLotto.contains(bonusNumber)
        when (matchCount) {
            6 -> finalWinning.WINNING_SIX
            5 -> if (hasBonus) finalWinning.WINNING_FIVE_WITH_BONUS else finalWinning.WINNING_FIVE
            4 -> finalWinning.WINNING_FOUR
            3 -> finalWinning.WINNING_THREE
            else -> null // mapNotNull이 null은 자동 제거
        }
    }
        .groupingBy { it }.eachCount()
    return finalWinning.entries.associateWith { 0 }.plus(winCounts)
}