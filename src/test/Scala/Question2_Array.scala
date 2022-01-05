import org.scalatest.funsuite.AnyFunSuite
class testQuestion2_Array extends  AnyFunSuite {
  test("Question2_Array") {
    assert(Question2_Array.max_product(Array(2,3,5,7,-7,5,8,-5)) === 56)
    assert(Question2_Array.max_product(Array(3,2,6,5,4,9,8)) === 72)

  }
}
