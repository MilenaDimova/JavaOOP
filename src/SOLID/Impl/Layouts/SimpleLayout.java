package SOLID.Impl.Layouts;

import SOLID.Interfaces.Layout;
import SOLID.enums.ReportLevel;

public class SimpleLayout implements Layout {

    @Override
    public String format(String time, String message, ReportLevel reportLevel) {
        return String.format("%s – %s – %s", time, reportLevel, message);
    }
}
