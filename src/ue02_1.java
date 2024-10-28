import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {
        Out.println("Enter three numbers and press Enter after each: ");

        int numberOne = In.readInt();
        int numberTwo = In.readInt();
        int numberThree = In.readInt();

        int max = 0;

        if (numberOne >= numberTwo && numberOne >= numberThree) {
            max = numberOne;
        } else if (numberTwo > numberOne && numberTwo >= numberThree) {
            max = numberTwo;
        } else {
            max = numberThree;
        }

        Out.println("The max number is " + max);
    }
}
