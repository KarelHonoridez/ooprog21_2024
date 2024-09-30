public class Circle
{
   public double radius, diameter, area;
   
   public Circle()
   {
      radius = 1.0;
      calculateDiameter(); 
      calculateArea();
   }
   

   public void setRadius(double rad)
   {
      radius = rad;
      calculateDiameter();
      calculateArea();
   }
   private void calculateDiameter()
   {
      diameter = radius * 2;
   }
   
   private void calculateArea()
   {
      area = Math.PI * radius * radius;
   }
   

   public double getRadius()
   {
      return radius;
   }
   public double getDiameter()
   {
      return diameter;
   }
   public double getArea()
   {
      return area;
   }
   
}
