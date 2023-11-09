public class Hexagon {
    private double r;
    private double[] XY;

    public Hexagon() {
        XY = new double[2];
        for (int i = 0; i < 2; i++) {
            XY[i] = 0;
        }
        r = 0;
    }

    public Hexagon(double r, double x, double y) {
        XY = new double[2];
        this.r = r;
        XY[0] = x;
        XY[1] = y;
    }

    public Hexagon(Hexagon obj) {
        XY = new double[2];
        r = obj.r;
        XY = obj.XY;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setXY(double[] XY) {
        this.XY = XY;
    }

    public void setXY(double x, double y) {
        XY[0] = x;
        XY[1] = y;
    }

    public double getR() {
        return r;
    }

    public double[] getXY() {
        return XY;
    }

    public double getX() {
        return XY[0];
    }

    public double getY() {
        return XY[1];
    }

    public double Square() {
        return 3 * Math.sqrt(3) * Math.pow(r, 2) / 2;
    }

    public void Move(double x, double y) {
        XY[0] += x;
        XY[1] += y;
    }

    public String toString() {
        return "Радіус: " + r + "; Точки: x = " + XY[0] + "; y = " + XY[1] + ';' + "\n S = " + Square() + ';';
    }
}
