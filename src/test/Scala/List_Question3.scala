import org.scalatest.funsuite.AnyFunSuite
class testList_Question3 extends  AnyFunSuite {
  test("List_Question3"){
    assert(List_Question3.length(List(2,5,1,4,3,7,8,6,0,9)) === 10 )
    assert(List_Question3.length(List(9,8,5,6,4,9,7))=== 7)
  }

}
