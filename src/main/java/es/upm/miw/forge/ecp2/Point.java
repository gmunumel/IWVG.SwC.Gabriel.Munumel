package es.upm.miw.forge.ecp2;

public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int xy) {
        this(xy, xy);
    }

    public Point() {
        this(0, 0);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public double module() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double phase() {
        return Math.atan((double) this.y / this.x);
    }

    public void translateOrigin(Point origin) {
        this.x -= origin.getX();
        this.y -= origin.getY();
    }
    
    public int limitX() {
        if (this.x < 0 || this.x > 100) {
            throw new IllegalArgumentException("El valor de x debe estar entre 0 y 100");
        }else {
            return this.x;
        }
    }
    
    public int limitY() {
        if (this.y < -10 || this.y > 10) {
            throw new IllegalArgumentException("El valor de y debe estar entre -10 y 10");
        }else {
            return this.y;
        }
    }
    

    @Override
    public String toString() {
        return "Point[" + x + "," + y + "]";
    }
    
}
