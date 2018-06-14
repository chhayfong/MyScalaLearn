object fibbinacci
{
    def main(args: Array[String]) 
    {
        println(fibbinacci(6))
    }
    def fibbinacci( n : Int ) : Int = 
    {
        var a = 0
        var b = 1
        var i = 0  
 
  while( i < n ) 
  {
    val c = a + b
    a = b
    b = c
    i = i + 1
  }  
  return a
    }
}