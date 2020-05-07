package converter.lib;

/**
 * Created by kamalkarwal on 16/4/17.
 */
public class Speed extends Quantity {

    private static final double KM_H_X = 3.6;
    private static final double KNOT_X = 1.94384;
    private static final String BASE_UNIT = METER_PER_SECOND;

    public Speed(double magnitute, String unit) {
        super(magnitute, unit);
    }

    @Override
    public void convertToBaseUnit() {
        if(!(this.getUnit().equals( METER))) {
            switch (this.getUnit()) {
                case KM_PER_HOUR: this.setMagnitute(this.getMagnitute()/KM_H_X);
                    break;
                case KNOT: this.setMagnitute(this.getMagnitute()/KNOT_X);
                    break;
            }
            this.setUnit( METER);
        }
    }

    @Override
    public void convertTo(String unit) {
        convertToBaseUnit();
        //cconvert from meter to whatever unit
        switch (unit) {

            case KM_PER_HOUR: this.setMagnitute(this.getMagnitute()*KM_H_X);

                break;
            case KNOT: this.setMagnitute(this.getMagnitute()*KNOT_X);
                break;
        }
        this.setUnit(unit);
    }
}
