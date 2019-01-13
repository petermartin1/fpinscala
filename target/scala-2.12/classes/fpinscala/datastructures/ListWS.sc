import fpinscala.datastructures.Cons
import fpinscala.datastructures._
import fpinscala.datastructures.List._

foldRight(List(1,2,3), Nil:List[Int])(Cons(_,_))
val as = List(1,2,3,4)
List.length(as)