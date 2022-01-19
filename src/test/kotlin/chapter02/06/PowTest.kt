package chapter02.`06`

import org.junit.Test
import kotlin.test.assertEquals


class PowTest {

  @Test
  fun `raise to power` () {
    assertEquals(2 `**` 3, 8)
  }


}