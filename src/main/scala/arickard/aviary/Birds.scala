package arickard.aviary

object Birds {

  // identify 
  def idiot[A](a: A) = a

  // constant/true
  def kestrel[A,B](a: A)(b: B) = a
 
  // false
  def kite[A,B](a: A)(b: B) = b

  // compose
  def bluebird[A,B,C](f: B => C)(g: A => B): A => C = a => f(g(a))

  // flip
  def cardinal[A,B,C](f: (A,B) => C)(b: B)(a: A) = f(a,b)
}
