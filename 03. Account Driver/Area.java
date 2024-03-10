public class Area {

  double computeArea(double rad)
  {
      //calculating circle area
      double circle_area = Math.PI * Math.pow(rad,2);
      return circle_area;
  }

    double computeArea(double length, double height)
    {
        //calculating rectangle area
        double rect_area = length * height;
        return rect_area;
    }
}
