package converter.test;
import converter.lib.Speed;
import converter.lib.Unit;
/**
 * Created by kamalkarwal on 16/4/17.
 */
public class SpeedTest {
    public static void main(String[] args) {
        Speed s = new Speed(299792458, Unit.METER_PER_SECOND);
        s.convertTo( Unit.KM_PER_HOUR);
        System.out.println(s);
    }
}
