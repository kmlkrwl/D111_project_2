package converter.lib;

/**
 * Created by kamalkarwal on 16/4/17.
 */
public class Area extends Quantity {

    private static final double ACRE_X = 0.0002471054;
    private static final double HECTARE_X = 0.0001;
    private static final String BASE_UNIT = SQR_MTR;

    public Area(double magnitute, String unit) {
        super(magnitute, unit);
    }

    @Override
    public void convertToBaseUnit() {
        if(!(this.getUnit().equals(BASE_UNIT))) {
            switch (this.getUnit()) {
                case ACRE: this.setMagnitute(this.getMagnitute()/ACRE_X);
                    break;
                case HECTARE: this.setMagnitute(this.getMagnitute()/HECTARE_X);
                    break;
            }
            this.setUnit(BASE_UNIT);
        }
    }

    @Override
    public void convertTo(String unit) {
        convertToBaseUnit();
        switch (unit) {
            case ACRE: this.setMagnitute(this.getMagnitute()*ACRE_X);
                break;
            case HECTARE: this.setMagnitute(this.getMagnitute()*HECTARE_X);
                break;
        }
        this.setUnit(unit);
    }
}
