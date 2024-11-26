public class T {
    public static void main(String[] args) {
        triangle(4, 0);
    }
    static void triangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*"); // Use print instead of println to stay on the same line
            triangle(r, c + 1);
        } else {
            System.out.println(); // Move to the next line after finishing one row
            triangle(r - 1, 0);
        }
    }
}
