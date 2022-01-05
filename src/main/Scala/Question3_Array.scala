object Question3_Array extends App{
  def max_diff(arr:Array[Int]):Int = {
    var max_diff = 0
    val len = arr.length
    for(i <- 0 to len-1){
      for(j <- i+1 to len-1){
        if(arr(i)<arr(j) && (arr(i)-arr(j)).abs>max_diff) max_diff = (arr(i)-arr(j)).abs
      }
    }
    max_diff
  }
  println ( " max difference is := ")
  println(max_diff(Array(2,3,1,7,9,5,11,3,5)))
}
