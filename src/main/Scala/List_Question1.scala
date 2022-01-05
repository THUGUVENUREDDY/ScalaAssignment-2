object List_Question1 extends App{
  def n_times_elements(list:List[Int], n: Int):List[Int] = { list flatMap { element => List.fill(n)(element)  }}

  val nums = List(1,2,3,4)
  println("Element List:")
  println(nums)

  val result = n_times_elements(nums, 3)
  println("Add each element 3 times to a given list of integers:")
  result.foreach(println)
}
