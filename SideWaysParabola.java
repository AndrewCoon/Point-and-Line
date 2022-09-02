public class SideWaysParabola {
     double a, b, c;
     Point p;

     public SideWaysParabola(double a, double b, double c) {
          this.a = a;
          this.b = b;
          this.c = c;

          p = new Point(0, (a * (0 * 0)) + (b * (0)) + c);
          // ax^2 + bx + c = y
     }

     public void render(GrapherPanel screen) {
          Point current;
          Point prev = p;
          for (double i = 0; i < 10; i += 0.01) {
               current = new Point((this.a * (i * i)) + (this.b * (i)) + this.c, i);
               Line c = new Line(current, prev);
               screen.plotLine(c);
               prev = current;
          }

          Point currentB;
          prev = p;
          for (double i = 0; i > -10; i -= 0.01) {
               currentB = new Point((this.a * (i * i)) + (this.b * (i)) + this.c, i);
               Line cB = new Line(currentB, prev);
               screen.plotLine(cB);
               prev = currentB;
          }

     }

     public Point getVertex() {
          double vX = -b / (2 * a);
          double h = vX;
          double vY = (a * (h * h)) + (b * h) + c;
          Point v = new Point(vX, vY);
          return v;
     }

     public void renderV(GrapherPanel screen) {
          screen.plotPoint(getVertex());
     }

     public Point getYInt() {
          // Standard Parabola form with x = 0 to get y int
          Point yInt = new Point(0, (a * (0 * 0)) + (b * (0)) + c);
          return yInt;
     }

     // public List<Point> getXInts() {
     // Simplified version of standard form with y = 0. X is issolated
     // 
     // y = (1/(4(f-x))) * (x - h) + k where (h, k) is the v
     // return xInt;
     // }
     
     public String toString() {
         String r = "I don't even know";
         return r;
     }
}
