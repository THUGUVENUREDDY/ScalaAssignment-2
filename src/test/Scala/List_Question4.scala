import org.scalatest.funsuite.AnyFunSuite
class testList_Question4 extends  AnyFunSuite {
  test("List_Question4"){
    assert(List_Question4.Absval(List(2,-4,3,-1,23,-4,-54)) === List(2,4,3,1,23,4,54))
    assert(List_Question4.Absval(List(-3,-2,-5,5,-8,-9,-7)) === List(3,2,5,5,8,9,7))
    assert(List_Question4.Absval(List(-2,-4,-3,-1)) === List(2,4,3,1))
  }

}
