package exc4;

public class ConverterTest {
    public static void main(String[] args) {
        BaseConverter kelvin = new CelToKel();
        BaseConverter farengeit = new CelToFar();
        System.out.println(kelvin.convert(100));
        System.out.println(farengeit.convert(100));
    }
}
