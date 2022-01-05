object Question2_Array extends App {
  def max_product(arr:Array[Int]):Int = {
    var max_pro = arr.max
    val len = arr.length
    for(i <- 0 to len-1){
      for(j <- i+1 to len-1 ){
        if(arr(i)*arr(j) > max_pro) max_pro = arr(i)*arr(j)
      }
    }
    max_pro
  }
  println(max_product(Array(2, 3, 5, 7, -7, 5, 8, -5)))
}