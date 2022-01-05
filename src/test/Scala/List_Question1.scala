import org.scalatest.funsuite.AnyFunSuite
class testList_Question1 extends  AnyFunSuite {
  test("List_Question1"){
    assert(List_Question1.n_times_elements(List(1,2,3,4),3)===List(1,1,1,2,2,2,3,3,3,4,4,4))
    assert(List_Question1.n_times_elements(List(7,8,9,4,5),2)===List(7,7,8,8,9,9,4,4,5,5))
  }

}
