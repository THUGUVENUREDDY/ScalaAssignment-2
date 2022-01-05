object List_Question4 extends App{
  def Absval(arr: List[Int]): List[Int] = arr.map((x: Int) => if (x < 0) -x else x)

  val x = List(2,-4,3,-1,23,-4,-54)
  println("original list")
  println(x)

  println("Absolute values")
  println(Absval(x))

}
