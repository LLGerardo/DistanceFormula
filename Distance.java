
public class Lauraplayground_week_5_lab3A_Assignment2 {
    public static void main(String[] args) {
        distance(1, 0, 4, 4);

        distance(10, 2, 3, 15);
    }

    public static double distance(double a, double b, double c, double d) {
        return (Math.sqrt((Math.pow((a - c), 2)) + (Math.pow((b - d), 2))));

    }
}
