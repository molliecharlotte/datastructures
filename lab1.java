public class Rectangle()
{
  private int length
  private int width
  
  public static Rectangle()
    {
      length = 1;
      width = 1;
    }
    
 }
 
 public void Rectangle (int l, int w)
 {
   length = l;
   width = w;
 }

public int getLength()
{
  return length;
}

public int getWidth()
{
  return width;
}

public void setLength(int m)
{
  length = m;
}

public void setWidth(int n)
{
 width = n;
}

public int getArea()
{
  int area = length*width;
  
  for(i=0, i<10, i++)
  {
    System.out.println("The area of the rectangle is" + area);
  }
  
  return area;
}

public boolean isSquare()
{
  if(length==width)
  {
    return true;
  }
  else
  {
    return false;
  }
}

public class IOTestOut()

    
    
    
