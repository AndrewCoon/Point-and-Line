public class Line {
    Point a, b;

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Point getPointA() {
        return a;
    }

    public Point getPointB() {
        return b;
    }

    public double getSlope() {
        return (a.y - b.y) / (a.x - b.x);
    }

    public double getLength() {
        double difY = a.y - b.y;
        double difX = a.x - b.x;
        return Math.sqrt((difY * difY) + (difX * difX));
    }

    public Point getMidpoint() {
        double xM = (a.x + b.x) / 2;
        double yM = (a.y + b.y) / 2;
        Point m = new Point(xM, yM);
        return m;
    }

    public double getPerpSlope() {
        return (-1 / getSlope());
    }

    public String toString() {
        String ret = "(" + a.x + ", " + a.y + ") -> (" + b.x + ", " + b.y + ")";
        return ret;
    }

    public Line getPerpBisector() {
        Point d = getMidpoint();
        double r = Math.toRadians(90);
        double difAX = a.x - d.x;
        double difAY = a.y - d.y;
        
        double difBX = b.x - d.x;
        double difBY = b.y - d.y;
        
        double fX = difAX * Math.cos(r);
        fX = fX - (difAY * Math.sin(r));
        double gY = difAX * Math.sin(r);
        gY = gY + (difAY * Math.cos(r));
        
        gY += d.y;
        gX += d.x;
        
        double fX2 = difBX * Math.cos(r);
        fX2 = fX2 - (difBY * Math.sin(r));
        double gY2 = difBX * Math.sin(r);
        gY2 = gY2 + (difBY * Math.cos(r));
        
        fX2 += d.x;
        gY2 += d.y;    
    
        Point j = new Point(fX,gY);
        Point k = new Point(fX2,gY2);
        Line l = new Line(j,k);

        return l;
    }
}