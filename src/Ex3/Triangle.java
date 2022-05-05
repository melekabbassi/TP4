package Ex3;

public class Triangle implements Drawable, Moveable {
    private Segment s1;
    private Segment s2;
    private Segment s3;
    private Integer color;

    public Triangle(Segment s1, Segment s2, Segment s3, Integer color) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
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
        System.out.println("Drawing triangle " + s1.getP1().toString() + " " + s1.getP2().toString() + " " + s2.getP2().toString() + " " + s3.getP1().toString() + " with color " + color);
    }
}
