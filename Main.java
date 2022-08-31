public class Main {
     public static void main(String[] args) {
          GrapherPanel test = new GrapherPanel();
          Point a = new Point(1, 1);
          Point b = new Point(-1, -1);
          Line l = new Line(a, b);
          Point c = l.getPerpBisector().getPointA();
          Line perpL = new Line(l.getPerpBisector().getPointA(), l.getPerpBisector().getPointB());

          test.plotPoint(a);
          test.plotPoint(b);

          l.getPerpBisector().getPointB();
          test.plotLine(l);
          test.plotLine(l.getPerpBisector());

          print("Point: " + a);
          print("Line: " + l);
          print("Slope: " + l.getSlope());
          print("Perp Slope: " + l.getPerpSlope());
          print("Perp Function Test: " + perpL.getSlope());
     }

     public static void print(Object s) {
          System.out.println(s);
     }
}
