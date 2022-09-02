import javax.print.event.PrintJobListener;

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

          print(leftP + " " + v + " " + rightP);
     }

     public Point getVertex() {
          Point r = new Point(b, c);
          return r;
     }

     public void print(Object s) {
          System.out.println(s);
     }
}
