package lotto

fun bonusNumberRangeValidation(inputNumber: Int) : Int {
    if (inputNumber < MIN_VALUE || inputNumber > MAX_VALUE){
        throw ArgumentOutOfRangeException("[ERROR] 보너스 숫자는 1 ~ 45 사이의 값만 가능합니다.")
    }
    return inputNumber
}
