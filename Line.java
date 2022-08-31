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
        double difAX = getMidpoint().x - a.x;
        double difBX = getMidpoint().x - b.x;

        Point pointA = new Point((2 * difAX + a.x), a.getY());
        Point pointB = new Point((2 * difBX + b.x), b.getY());

        Line retLine = new Line(pointA, pointB);
        return retLine;
    }
}