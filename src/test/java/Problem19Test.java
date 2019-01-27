import euler.Problem19;
import org.junit.Assert;
import org.junit.Test;

public class Problem19Test {
    
    @Test 
    public void findDayOfWeekTest() {

        Problem19 problem19 = new Problem19();

        Assert.assertEquals("1970/01/01 is Thursday", 5, problem19.findDayOfWeek(1970, 0, 1));
        Assert.assertEquals("1984/02/01 is Wednesday", 4, problem19.findDayOfWeek(1984, 1, 1));
        Assert.assertEquals("1992/03/01 is Sunday", 1, problem19.findDayOfWeek(1992, 2, 1));
        Assert.assertEquals("1996/04/01 is Monday", 2, problem19.findDayOfWeek(1996, 3, 1));
        Assert.assertEquals("1996/06/01 is Saturday", 7, problem19.findDayOfWeek(1996, 5, 1));
        Assert.assertEquals("1996/10/01 is Tuesday", 3, problem19.findDayOfWeek(1996, 9, 1));
        Assert.assertEquals("1996/11/01 is Friday", 6, problem19.findDayOfWeek(1996, 10, 1));
    }
}
