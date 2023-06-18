package colorCodeConverter;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ColorCodeConverterMain {
    public static void main(String[] args) {

        ColorCodeConverter colorCodeConverter = new ColorCodeConverter();

        colorCodeConverter.getColorCode('R');
        System.out.println("Color :" +colorCodeConverter.colorName);

        colorCodeConverter.getColorCode('Y');
        System.out.println("Color :" +colorCodeConverter.colorName);

        colorCodeConverter.getColorCode('T');
        System.out.println("Color :" +colorCodeConverter.colorName);


    }
}