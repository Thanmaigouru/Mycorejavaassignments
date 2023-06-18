package colorCodeConverter;

public class ColorCodeConverter {
    String colorName;

    public void getColorCode(char code) {

        switch (code) {

            case 'R':
                colorName = "Red";
            case 'B':
                colorName = "Blue";
            case 'G':
                colorName = "Green";
            case 'O':
                colorName = "Orange";
            case 'Y':
                colorName = "Yellow";
            case 'W':
                colorName = "White";
            default:
                colorName = "Invalid Code";

                break;
        }

    }
}








