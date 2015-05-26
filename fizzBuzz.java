public class fizzBuzz
{
  public static void main(String[] args)
  {
    FizzBuzz(15);
  }
  public static void FizzBuzz(int n)
  {
    for(int i=1;i<n+1;i++)
    {
      if(i%3 == 0)
      {
        System.out.println("Fizz");
      }
      else if(i%5 == 0)
      {
        System.out.println("Buzz");
      }
      else if(i%3 == 0 && i%5 == 0)
      {
        System.out.println("FizzBuzz");
      }
      else
      {
        System.out.println(i);
      }
    }
  }
}
