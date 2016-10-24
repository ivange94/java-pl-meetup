public class MathExamples {

    public static void main(String[] args) {
	int x = 64;
	double sqrtOfX = Math.sqrt(x);
	System.out.printf("Square root of %d is %f\n", x, sqrtOfX);
	double xCube = Math.pow(x, 3);
	System.out.printf("%d^3 = %f\n", x, xCube);
	System.out.println("The absolute value of -2 = " + Math.abs(-2));
    }
}