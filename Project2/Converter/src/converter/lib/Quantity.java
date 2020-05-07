package converter.lib;

/**
 * Created by kamalkarwal on 16/4/17.
 */


public abstract class Quantity implements Convertable, Unit{

    private double magnitute;
    private String unit;

    public Quantity(double magnitute, String unit) {
        this.magnitute = magnitute;
        this.unit = unit;
    }

    public double getMagnitute() {
        return magnitute;
    }

    public void setMagnitute(double magnitute) {
        this.magnitute = magnitute;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return String.format("%.3f %s",this.getMagnitute(),this.getUnit());
    }


}
