import Question2_Array.arr
import org.scalatest.funsuite.AnyFunSuite
class testList_Question2 extends  AnyFunSuite {
  test("List_Question2"){
    assert(List_Question2.f(List(2,3,4,5,6,7,8)) === List(3,5,7))
    assert(List_Question2.f(List(9,8,7,6,5,4,3,2,1)) === List(8,6,4,2))

  }

}
