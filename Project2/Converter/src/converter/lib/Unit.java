package converter.lib;

/**
 * Created by kamalkarwal on 16/4/17.
 */

/**
 * Creating Unit interface for re-usability.
 * This class declares all the units used in the class.
 * @author kamalkarwal
 */
public interface Unit {

   
    public String METER = "meter";
    public String INCH = "inch";
    public String MILE = "mile";
    public String CLECIUS= "Celcius" ;
    public String KELVIN = "Kelvin";
    public String FARENHIET = "Farenheit";
    public String GRAM = "gram";
    public String OUNCE= "oz";
    public String POUND= "lb";
    public String SQR_MTR= "m2";
    public String ACRE= "Acre";
    public String HECTARE= "Hectare";
    public String METER_PER_SECOND= "m/s";
    public String KM_PER_HOUR= "km/h";
    public String KNOT= "Knot";
    
    //array of Temperature Units
    public String [] TEMP_UNITS = {KELVIN,CLECIUS,FARENHIET};
    //array of Area Units
    public String [] AREA_UNITS = {ACRE,HECTARE,SQR_MTR};
    //array of length units
    public String [] LENGTH_UNITS = {METER, MILE, INCH};
    //array of mass units
    public String [] MASS_UNITS = {GRAM, OUNCE, POUND};
    //array of speed units
    public String [] SPEED_UNITS = {KM_PER_HOUR,METER_PER_SECOND, KNOT};
} 
            
