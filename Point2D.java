public class Point2D {
    private float x;
    private float y;

    // Hàm tạo không tham số
    public Point2D() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    // Hàm tạo có tham số
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getter và setter cho x
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    // Getter và setter cho y
    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    // Phương thức hiển thị thông tin điểm 2D
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
