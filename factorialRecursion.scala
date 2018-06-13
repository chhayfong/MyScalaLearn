object factorialRecursion {

    def main(args: Array[String]) {
        println(factorial(5))
    }

    def factorial(n: Int): Int = {
      if (n == 0) 
          return 1
      else
          return n * factorial(n-1)
    }
} //5 * factor(4) = 5 * 24 = 120
  //4 * factor(3) = 4 * 6 = 24
  //3 * factor(2) = 3 * 2 = 6
  //2 * factor(1) = 2