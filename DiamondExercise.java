public class DiamondExercise
{
  public static void main(String[] args)
  {
  //isoscelesTriangle(10);
   diamond(11);
  }
  public static void isoscelesTriangle(int n)
  {
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=n-i;j++)
      {
       System.out.print(" ");
      }
      for(int k=1;k<=2*i-1;k++)
      {
        System.out.print("*");
      }
      System.out.println("\n");
    }
  }

  public static void diamond(int n)
  {
    if(n%2 == 0)
    {
      System.out.print("the input is error,please check");
      return;
    }

    int halfLine = (n+1)/2;
    for(int row=1;row<=n;row++)
    {
      if(row < halfLine)
      {
        for(int j=1;j<=halfLine-row;j++)
        {
         System.out.print(" ");
        }
        for(int k=1;k<=2*row-1;k++)
        {
          System.out.print("*");
        }
        System.out.println("\n");
      }
      else if(row == halfLine)
      {
        System.out.println("XUHAO\n");
      }
      else
      {
        for(int j=1;j<=row-halfLine;j++)
        {
          System.out.print(" ");
        }
        for(int k=1;k<=2*(2*halfLine-row)-1;k++)
        {
          System.out.print("*");
        }
        System.out.println("\n");
      }
    }

  }
}
