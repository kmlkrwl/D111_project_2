package converter.test;
import converter.lib.Mass;
import converter.lib.Unit;
/**
 * Created by kamalkarwal on 16/4/17.
 */
public class MassTest {
    public static void main(String[] args) {
        Mass m = new Mass(1, Unit.POUND);
        m.convertTo( Unit.GRAM);
        System.out.println(m);
    }
}
