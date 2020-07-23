package exc4;

public class CelToKel implements BaseConverter{
    @Override
    public double convert(double degree) {
        return degree+273.15;
    }
}
