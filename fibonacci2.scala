object fibbonacci2
{
     def main(args: Array[String]): Unit = 
    {
         var a = 0 
         var b = 1
         var i = 0
         for(i<-1 to 10)
            {
             val c = a + b
             a = b
             b = c
             println(c)
            }
        }
}