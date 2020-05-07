package converter.test;
import converter.lib.Area;
import converter.lib.Unit;
/**
 * Created by kamalkarwal on 16/4/17.
 */
public class AreaTest {
    public static void main(String[] args) {
        Area a = new Area(200, Unit.SQR_MTR) ;
        a.convertTo( Unit.ACRE);
        System.out.println(a);
    }
}
