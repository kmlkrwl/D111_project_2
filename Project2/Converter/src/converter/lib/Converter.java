/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter.lib;
import converter.exceptions.*;
/**
 *
 * @author kamalkarwal
 */
public class Converter {
    public static final String LENGTH = "Length";
    public static final String AREA = "Area";
    public static final String SPEED = "Speed";
    public static final String MASS = "Mass";
    public static final String TEMP = "Temperature";
    
    public static String convert(String type,String quantity, String currentUnit, String newUnit) throws InvalidFieldException,
            NoSelectionException {
      double mag = 0;
        try {
            mag = Double.parseDouble(quantity);
        } catch (Exception e) {
            throw new InvalidFieldException();
        }
        if(type == null || quantity == null || currentUnit == null || newUnit == null ) {
            throw new NoSelectionException();
        }
        double convMag = 0;
        Quantity myQuantity = null;
        switch(type) {
            case LENGTH : myQuantity = new Length(mag,currentUnit);
                          break;
            case AREA:   myQuantity = new Area(mag,currentUnit);
                          break;   
            case SPEED: myQuantity = new Speed(mag,currentUnit);
                            break;
            case MASS: myQuantity = new Mass(mag,currentUnit);
                            break;
            case TEMP:  myQuantity = new Temperature(mag,currentUnit);
                            break; 
            default:
        
            }
        myQuantity.convertTo(newUnit);
        convMag = myQuantity.getMagnitute();
        String convertedText = String.format("%.3f", convMag);
        return convertedText;
    }
    
    
}
