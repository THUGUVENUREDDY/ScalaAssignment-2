object List_Question2 extends App {

  def f(arr:List[Int]):List[Int] = (arr.indices.collect { case i if i % 2 != 0 => arr(i) }).toList

  val nums = List(2,5,3,4,6,7,8,9)
  println("Original list:")
  println(nums)

  println("Odd positioned numbers of the said list:")
  println(f(nums))

}
