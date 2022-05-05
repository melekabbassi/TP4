package Ex3;

public class Segment implements Drawable, Moveable {
    private Point p1;
    private Point p2;
    private Integer color;
    
    public Segment(Point p1, Point p2, Integer color) {
        this.p1 = p1;
        this.p2 = p2;
        this.color = color;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    @Override
    public Integer getColor() {
        return color;
    }

    @Override
    public void setColor(Integer color) {
        this.color = color;        
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }
    
    public double length() {
        return p1.distance(p2);
    }

    @Override
    public void translate(Integer tx, Integer ty) {
        p1.translate(tx, ty);
        p2.translate(tx, ty);        
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing segment " + p1.distance(p2));
    }

}
