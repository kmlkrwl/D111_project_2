package converter.lib;

/**
 * Created by kamalkarwal on 16/4/17.
 */
public class Temperature extends Quantity {

    private static final String BASE_UNIT =  CLECIUS;
    private static final double ADD_KELVIN = 273.15;


    public Temperature(double magnitute, String unit) {
        super(magnitute, unit);
    }

    @Override
    public void convertToBaseUnit() {
        if(!(this.getUnit().equals(BASE_UNIT))) {
            switch (this.getUnit()) {
                case KELVIN: this.setMagnitute(this.getMagnitute()-ADD_KELVIN);
                    break;
                case FARENHIET: this.setMagnitute((this.getMagnitute()-32)*5/9);
                    break;
            }
        }
    }

    @Override
    public void convertTo(String unit) {
            convertToBaseUnit();
        switch (unit) {
            case KELVIN: this.setMagnitute(this.getMagnitute()+ADD_KELVIN);
                break;
            case FARENHIET: this.setMagnitute((this.getMagnitute()*9/5)+32);
                break;
            default:

        }
        this.setUnit(unit);
    }
}
