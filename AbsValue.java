import java.util.*;

public class AbsValue {
     double a, b, c, xL;

     public AbsValue(double a, double b, double c, double xL) {
          this.a = a;
          this.b = b;
          this.c = c;
          this.xL = xL;
     }

     public void render(GrapherPanel screen) {
          Point v = new Point(b, c);
          Point leftP = new Point(-xL, a * (Math.abs(xL) + xL) + c);
          Point rightP = new Point(3 * xL, a * (Math.abs(xL) + xL) + c);
          Line l1 = new Line(leftP, v);
          Line l2 = new Line(rightP, v);

          screen.plotLine(l1);
          screen.plotLine(l2);
     }

     public Point getVertex() {
          Point r = new Point(b, c);
          return r;
     }

     public Point getYInt() {
          Point y = new Point(0, (a * (Math.abs(b)) + c));
          return y;
     }

     public List<Point> getXInts() {
          List<Point> r = new ArrayList<Point>();
          if (c == 0) {
               r.set(0, getVertex());
               return r;
          } else {
               if (a > 0) {
                    if (c > 0) {
                         return r;
                    } else {

                    }
               }
          }
     }

     public void print(Object s) {
          System.out.println(s);
     }
}
