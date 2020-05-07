package converter.test;
import converter.lib.Length;
import converter.lib.Unit;
/**
 * Created by kamalkarwal on 16/4/17.
 */
public class LengthTest {
    public static void main(String[] args) {
        Length l = new Length(1, Unit.MILE);
        System.out.println(l.getMagnitute());
        l.convertTo( Unit.INCH);
        System.out.println(l.getMagnitute());
        System.out.println(l.getUnit());
    }


}
