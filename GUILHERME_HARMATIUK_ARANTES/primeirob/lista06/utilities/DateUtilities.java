package primeirob.lista06.utilities;

import java.util.Date;

public class DateUtilities {
    public Long oneWholeDay () {
        Long ms = 86400000l;
        return ms;
    }
    public Date afterXDays (Long x) {
        Long oneday = oneWholeDay();
        Long afterXDays = oneday * x;
        Date currentDate = new Date();
        Long value = currentDate.getTime() + afterXDays;
        Date dayAfterXDays = new Date(value);
        return dayAfterXDays;
    }
}
