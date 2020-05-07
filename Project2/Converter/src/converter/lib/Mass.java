package converter.lib;

/**
 * Created by kamalkarwal on 16/4/17.
 */
public class Mass extends Quantity {

    private static final double OUNCE_X = 0.0352739907;
    private static final double POUND_X = 0.0022046244;

    private static final String BASE_UNIT =  GRAM;

    public Mass(double magnitute, String unit) {
        super(magnitute, unit);
    }

    @Override
    public void convertToBaseUnit() {
        if(!(this.getUnit().equals(BASE_UNIT))) {
            switch (this.getUnit()) {
                //if current unit is ounce divide the magnitude by OUNCE_X;
                case OUNCE: this.setMagnitute(this.getMagnitute()/OUNCE_X);
                    break;
                case POUND: this.setMagnitute(this.getMagnitute()/POUND_X);
                    break;
            }
            this.setUnit(BASE_UNIT);
        }
    }

    @Override
    public void convertTo(String unit) {
        convertToBaseUnit();
        switch (unit) {
            case OUNCE: this.setMagnitute(this.getMagnitute()*OUNCE_X);
                break;
            case POUND: this.setMagnitute(this.getMagnitute()*POUND_X);
                break;
        }
        this.setUnit(unit);
    }
}
