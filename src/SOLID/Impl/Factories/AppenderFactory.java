package SOLID.Impl.Factories;

import SOLID.Impl.Appenders.ConsoleAppender;
import SOLID.Impl.Appenders.FileAppender;
import SOLID.Interfaces.Appender;
import SOLID.Interfaces.Factory;
import SOLID.Interfaces.Layout;
import SOLID.enums.ReportLevel;

public class AppenderFactory implements Factory<Appender> {
    private LayoutFactory layoutFactory;

    public AppenderFactory() {
        this.layoutFactory = new LayoutFactory();
    }

    @Override
    public Appender produce(String input) {
        String[] tokens = input.split("\\s+");

        String appenderType = tokens[0];
        String layoutType = tokens[1];

        Layout layout = layoutFactory.produce(layoutType);
        Appender appender = null;
        if (appenderType.equals("ConsoleAppender")) {
            appender = new ConsoleAppender(layout);
        } else if (appenderType.equals("FileAppender")) {
            appender = new FileAppender(layout);
        }

        if (tokens.length >= 3) {
            assert appender != null;
            appender.setReportLevel(ReportLevel.valueOf(tokens[2]));
        }

        return appender;
    }
}
