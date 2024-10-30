import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
        
        Out.println("Enter the x-coordinate from your point: ");
        double x = In.readDouble();

        Out.println("Enter the y-coordinate from your point: ");
        double y = In.readDouble();

        double radius = 4;
        double distanceMiddlePoint = Math.sqrt((x*x) + (y*y));

        if ((distanceMiddlePoint > radius) && (x >= 0 && x <= 4) && (y >= 0 && y <= 4)) {
            Out.println("Your point is in the green space.");
        } else {
            Out.println("Your point is not in the green space.");
        }
    }
}
