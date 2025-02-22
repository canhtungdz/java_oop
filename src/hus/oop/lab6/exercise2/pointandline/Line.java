package hus.oop.lab6.exercise2.pointandline;

public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }
    public Line(int beginX, int beginY, int endX, int endY) {
        this.begin = new Point(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    @Override
    public String toString() {
        return "Line{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }
    public int getBeginX() {
        return begin.getX();
    }
    public int getBeginY() {
        return begin.getY();
    }
    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }
    public void setBeginX(int beginX) {
        begin.setX(beginX);
    }
    public void setBeginY(int beginY) {
        begin.setY(beginY);
    }
    public void setBeginXY(int beginX, int beginY ) {
        setBeginX(beginX);
        setBeginY(beginY);
    }
    public void setEndX(int endX) {
        end.setX(endX);
    }
    public void setEndY(int endY) {
        end.setY(endY);
    }
    public void setEndXY(int endX, int endY) {
        setEndX(endX);
        setEndY(endY);
    }

    public double getLength() {
        return Math.sqrt(Math.pow(getEndX() - getEndY(), 2) + Math.pow(getBeginX() - getBeginY(), 2));
    }
    public double getGradient() {
        return Math.atan2(getEndY() - getBeginY(), getEndX() - getBeginX());
    }

}
