package SOLID.Impl.Layouts;

import SOLID.Interfaces.Layout;
import SOLID.enums.ReportLevel;

public class XmlLayout implements Layout {

    @Override
    public String format(String time, String message, ReportLevel reportLevel) {
        String output = "<log>" + System.lineSeparator() +
                String.format("   <date>%s</date>", time) + System.lineSeparator() +
                String.format("   <level>%s</level>", reportLevel) + System.lineSeparator() +
                String.format("   <message>%s</message>", message) + System.lineSeparator() +
                "</log>";
        return output;
    }
}
