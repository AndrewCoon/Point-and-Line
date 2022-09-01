# Point-and-Line

public class Parabola {
    double a, b, c;
    Point p;
    public Parabola(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        
        p = new Point(0, (a * (0 * 0)) + (b * (0) ) + c);
        // ax^2 + bx + c = y
    }
    
    public void render(GrapherPanel screen) {
        Point current;
        Point prev = p;
        for (double i=0; i<10; i+=0.01) {
            current = new Point(i, (this.a * (i * i)) + (this.b * (i) ) + this.c);
            Line c = new Line(current, prev);
            screen.plotLine(c);
            prev = current;
        }

        Point currentB;
        prev = p;
        for (double i=0; i>-10; i-=0.01) {
            currentB = new Point(i, (this.a * (i * i)) + (this.b * (i) ) + this.c);
            Line cB = new Line(currentB, prev);
            screen.plotLine(cB);
            prev = currentB;
        }     

    }
    
    public Point getVertex() {
        double vX = -b/2*a;
        double vY = -(b*b - 4*a*c)/4*a;
        Point v = new Point(vX, vY);      
        return v;
    }
    
    public void renderV(GrapherPanel screen) {
        screen.plotPoint(getVertex());
    }
}
