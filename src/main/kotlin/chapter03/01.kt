package chapter03

/**
 * const 와 val 의 차이?
 *
 * const 는 컴파일 타임 상수고, val 은 런타임 상수이다.
 * 컴파일 상수는 컴파일 시간에 값을 이용할 수 있어야 한다.
 */
class `01`(
  val name: String,
  val _priority: Int = DEFAULT_PRIORITY,
) {

  var priority = validPriority(_priority)
    set(value) {
      field = validPriority(value)
    }

  private fun validPriority(p: Int) = p.coerceIn(MIN_PRIORITY, MAX_PRIORITY)


  companion object {
    const val MIN_PRIORITY = 1
    const val MAX_PRIORITY = 5
    const val DEFAULT_PRIORITY = 3
  }

}