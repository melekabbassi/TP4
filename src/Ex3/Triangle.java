package Ex3;

public class Triangle implements Drawable, Moveable {
    private Segment s1;
    private Segment s2;
    private Segment s3;
    private Integer color;

    public Triangle(Point p1, Point p2, Point p3, Integer color) {
        this.s1 = new Segment(p1, p2, color);
        this.s2 = new Segment(p2, p3, color);
        this.s3 = new Segment(p3, p1, color);
        this.color = color;
    }

    public Segment getS1() {
        return s1;
    }

    public Segment getS2() {
        return s2;
    }

    public Segment getS3() {
        return s3;
    }

    @Override
    public Integer getColor() {
        return color;
    }

    @Override
    public void setColor(Integer color) {
        this.color = color;
    }

    public void setS1(Segment s1) {
        this.s1 = s1;
    }

    public void setS2(Segment s2) {
        this.s2 = s2;
    }

    public void setS3(Segment s3) {
        this.s3 = s3;
    }

    @Override
    public void translate(Integer tx, Integer ty) {
        s1.translate(tx, ty);
        s2.translate(tx, ty);
        s3.translate(tx, ty);
    }

    @Override
    public void draw() {
        s1.draw();
        s2.draw();
        s3.draw();             
    }
}
