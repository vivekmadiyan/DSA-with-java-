public class ProductofDigits {
    public static void main(String[] args) {
        System.out.println(productOfDigits(1230)); // Example input
    }

    static int productOfDigits(int n) {
        // Base case: if n is 0, return 1
        if (n%10 == n) {
            return n;
        }
        
        // Recursive case: multiply the last digit by the product of the remaining digits
        return (n % 10) * productOfDigits(n / 10);
    }
}
