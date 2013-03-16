object Sample {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def f[T: Acceptable](t: T) = t                  //> f: [T](t: T)(implicit evidence$2: Acceptable[T])T
  
  f(1)                                            //> res0: Int = 1
  f(1L)                                           //> res1: Long = 1
  //f("")    Error
}