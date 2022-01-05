import org.scalatest.funsuite.AnyFunSuite
class testQuestion1_Array extends  AnyFunSuite {
  test("Question1_Array"){
    assert(Question1_Array.replace(Array(9,5,8,4,-10,21,6,17,11)) === Array(21,21,21,21,21,-1,17,-1,-1))
    assert(Question1_Array.replace(Array(3,2,1,6,5,4,9,8,7)) === Array(9,9,9,9,9,9,-1,-1,-1))
  }

}
