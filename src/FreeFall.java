public class FreeFall implements Function {
    private final double g = 9.8;
    private double c;
    private double m;

    public FreeFall(double c, double m) {
        this.c = c;
        this.m = m;
    }

    @Override
    public double function(double x, double t) {
        return g - c * x / m;
    }
}
