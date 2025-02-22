package hus.oop.lab6.exercise2.pointandline;

public class LineSub extends Point{
    private Point end;

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }
    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    @Override
    public String toString() {
        return "LineSub{" +
                "begin=" + super.toString() +
                "end=" + end +
                '}';
    }
    public Point getBegin() {
        return (Point) this;
    }
    public Point getEnd() {
        return end;
    }
    public void setBegin(Point begin) {
        this.setXY(begin.getX(), begin.getY());
    }
    public void setEnd(Point end) {
        this.end = end;
    }
    public int getBeginX() {
        return this.getX();
    }
    public int getBeginY() {
        return this.getY();
    }
    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }
    public void setBeginX(int beginX) {
        this.setX(beginX);
    }
    public void setBeginY(int beginY) {
        this.setY(beginY);
    }
    public void setBeginXY(int beginX, int beginY) {
        this.setXY(beginX, beginY);
    }
    public void setEndX(int endX) {
        end.setX(endX);
    }
    public void setEndY(int endY){
        end.setY(endY);
    }
    public void setEndXY(int endX, int endY) {
        end.setXY(endX, endY);
    }

    public double getLength() {
        return Math.sqrt(Math.pow(end.getX() - this.getX(), 2) + Math.pow(end.getY() - this.getY(), 2));
    }
    public double getGradient() {
        return Math.atan2(end.getY() - this.getY(), end.getX() - this.getX());
    }

}
