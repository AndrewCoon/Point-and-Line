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
          print("Point X: " + a.getY());

          print("Line: " + l);
          print("Point on Line A: " + l.getPointA());
          print("Point on Line B: " + l.getPointB());
          print("Line length: " + l.getLength());

          print("Slope: " + l.getSlope());
          print("Perp Slope: " + l.getPerpSlope());
          print("Perpendicular Line: " + perpL);

          Parabola p = new Parabola(3, 4, 1);
          p.render(test);
          p.renderV(test);
          // test.plotPoint(p.getXInt());
          test.plotPoint(p.getYInt());

          AbsValue k = new AbsValue(2, 3, 0, 3);
          k.render(test);
          test.plotPoint(k.getVertex());
     }

     public static void print(Object s) {
          System.out.println(s);
     }
}
