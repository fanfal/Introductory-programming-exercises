import java.util.Vector;
public class primeFactor
{
  public static void main(String[] args)
  {
        generate(1);
  }
  public static void generate(int n)
  {
    int prime = 2;
    while(prime <= n)
    {
      if(prime == n)
      {
        System.out.print(n);
        break;
      }
      else if (n%prime == 0)
      {
        System.out.print(prime+",");
        n = n/prime;
      }
      else
      {
        prime++;
      }
    }
  }
}
