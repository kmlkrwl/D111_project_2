package converter.lib;

/**
 * Created by kamalkarwal on 16/4/17.
 */
public class Length extends Quantity {

    private static final double METER_X = 1.0;
    private static final double INCH_X = 39.3701;
    private static final double MILE_X = 0.0006213712;

    public Length(double magnitute, String unit) {
        super(magnitute, unit);
    }

    /**
     * Convert to base unit , in this case meter, before converting to any other unit.
     */
    @Override
    public void convertToBaseUnit() {
        if(!(this.getUnit().equals(METER))) {
            switch (this.getUnit()) {
                case INCH: 
                    this.setMagnitute(this.getMagnitute()/INCH_X);
                    break;
                case MILE: this.setMagnitute(this.getMagnitute()/MILE_X);
                    break;
            }
            this.setUnit(METER);
        }
    }

    @Override
    public void convertTo(String unit) {
        convertToBaseUnit();
        //cconvert from meter to whatever unit
       switch (unit) {
           case METER: this.setMagnitute(this.getMagnitute()*METER_X);

               break;
           case INCH: this.setMagnitute(this.getMagnitute()*INCH_X);

               break;
           case MILE: this.setMagnitute(this.getMagnitute()*MILE_X);
               break;
       }
       this.setUnit(unit);
    }

   
}
