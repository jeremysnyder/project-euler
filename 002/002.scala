var fibs = Seq(1, 2)

def next = fibs(fibs.length - 1) + fibs(fibs.length - 2)

while (next < 4000000) fibs = fibs :+ next

val sum = fibs.foldLeft(0) { (sum, fib) => if (fib % 2 == 0) sum + fib else sum }

println(sum)