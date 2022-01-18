package chapter02.`01`

/**
 * Question: 변수가 절대로 Null 값을 갖지 못하게 하고 싶다.
 */

/**
 * 물음표를 사용하지 않고 변수의 타입을 정의한다. 또한 Nullable Type 은 안전 호출연산자나 엘비스 연산자와 결합해서 사용한다.
 */

fun test1() {
  val name: String
  val name2: String?

  // 아래와 같이 null 을 할당하면 컴파일이 되지 않음
  //  name = null
  name2 = null

}

fun test2() {
  val p = Person(
    first = "North",
    middle = null,
    last = "West"
  )

  if (p.middle != null) {
    // smart cast!
    val middleNameLength = p.middle.length
  }

}

fun test3() {
  var p = Person(
    first = "North",
    middle = null,
    last = "West"
  )

  if (p.middle != null) {
    // not smart cast! var 를 사용할 경우에는 smart cast 가 되지 않는다.
    // val middleNameLength = p.middle!!.length

    // 다만 not-null assertion operator 는 NullPointerException 을 유발할 수도 있으므로 ? 연산자를 이용하자
    val middleNameLength = p.middle?.length
  }

}

fun test4() {
  var p = Person(
    first = "North",
    middle = null,
    last = "West"
  )

  if (p.middle != null) {
    // not smart cast! var 를 사용할 경우에는 smart cast 가 되지 않는다.
    // val middleNameLength = p.middle!!.length

    // 다만 not-null assertion operator 는 NullPointerException 을 유발할 수도 있으므로 ? 연산자를 이용하자
    val middleNameLength = p.middle?.length ?: 0
  }

}


class Person(
  val first: String,
  val middle: String?,
  val last: String,
)

