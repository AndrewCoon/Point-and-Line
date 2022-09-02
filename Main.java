public class Main {
     public static void main(String[] args) {
          
         
          GrapherPanel test = new GrapherPanel();
          Point a = new Point(1, 1);
          Point b = new Point(-1, -1);
          Line l = new Line(a, b);
          Line perpL = l.getPerpBisector();

          test.plotPoint(a);
          test.plotLine(l);
          test.plotLine(perpL);

          print("Point: " + a);
          print("Point X: " + a.getX());
          print("Point Y: " + a.getY());

          print("Line: " + l);
          print("Point on Line A: " + l.getPointA());
          print("Point on Line B: " + l.getPointB());
          print("Line length: " + l.getLength());
          print("Midpoint: " + l.getMidpoint());
          print("Slope: " + l.getSlope());
          print("Perp Slope: " + l.getPerpSlope());
          print("Perpendicular Line: " + perpL);

          Parabola p = new Parabola(3, 4, 1);
          p.render(test);
          p.renderV(test);
          // test.plotPoint(p.getXInt());
          test.plotPoint(p.getYInt());
          print("Parabola: " + p);
          AbsValue k = new AbsValue(2, 3, 0, 3);
          k.render(test);
          print("Absolute Value Function: " + k);
          test.plotPoint(k.getVertex());
          test.plotPoint(k.getYInt());
          SideWaysParabola sWP = new SideWaysParabola(3,5,1);
     }

     public static void print(Object s) {
          System.out.println(s);
     }
}
