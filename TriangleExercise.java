public class TriangleExercise
{
  public static void main(String[] args)
  {
    System.out.println("*");
    drawHorizontalLine(3);
    drawVerticalLine(3);
    drawRightTriangle(3);
  }

  public static void drawHorizontalLine(int n)
  {
    for(int i=0;i<n;i++)
    {
      System.out.print("*");
    }
    System.out.println("");
  }

  public static void drawVerticalLine(int n)
  {
    for(int i=0;i<n;i++)
    {
      System.out.println("*");
    }
  }

  public static void drawRightTriangle(int n)
  {
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<i;j++)
      {
        System.out.print("*");
      }
      System.out.println("*");
    }
  }
}
