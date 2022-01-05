object List_Question3 extends App{
  def length[A](nums:List[A]):Int = {nums.length}
  val nums1 = List(2,5,1,4,3,7,8,6,0,9)
  println("Original List:")
  println(nums1)
  println("Length of the said list:")
  println(length(nums1))
}
