import org.scalatest.funsuite.AnyFunSuite
class testQuestion3_Array extends  AnyFunSuite {
  test("Question3_Array") {
    assert(Question3_Array.max_diff(Array(2,3,1,7,9,5,11,3,5)) === 10)
    assert(Question3_Array.max_diff(Array(2,3,7,8,5,6,9)) === 7)
    assert(Question3_Array.max_diff(Array(2,3,7,8,-5,6,-9))=== 11)

  }

}
