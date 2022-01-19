package chapter03

class `02`(
  // class constructor variable
  val name: String
) {
  // default class variable
  var priority = 3
    set(value) {
      field = value.coerceIn(1..5)
    }

  var isLowPriority = false
    get() = priority < 3

}

fun main() {
  // init
  val test = `02`("Hello").apply { priority = 4 }
}