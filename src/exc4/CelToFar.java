package exc4;

public class CelToFar implements BaseConverter {
    @Override
    public double convert(double degree) {
        return degree*9/5+32;
    }
}
