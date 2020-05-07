package converter.test;
import converter.lib.Temperature;
import converter.lib.Unit;

/**
 * Created by kamalkarwal on 16/4/17.
 */
public class TemperatureTest {
    public static void main(String[] args) {
        Temperature t = new Temperature(37,  Unit.KELVIN);
        t.convertTo( Unit.FARENHIET);
        System.out.println(t);
    }
}
