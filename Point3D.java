public class Point3D extends Point2D{
    private float z;

    // Hàm tạo không tham số
    public Point3D() {
        super(); // Gọi hàm tạo của lớp cha
        this.z = 0.0f;
    }

    // Hàm tạo có tham số
    public Point3D(float x, float y, float z) {
        super(x, y); // Gọi hàm tạo của lớp cha
        this.z = z;
    }

    // Getter và setter cho z
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    // Phương thức hiển thị thông tin điểm 3D
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
}
