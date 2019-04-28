package arickard.aviary

import org.scalatest._

class BirdsSpec extends FlatSpec {

  "An idiot" should "return its input" in {
    assert(Birds.idiot(1) == 1)
  }

  "A Kestral" should "return its first argument" in {
    assert(Birds.kestrel(1)(2) == 1 )
  }
}
