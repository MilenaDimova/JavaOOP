package SOLID.Impl;

import SOLID.Interfaces.Appender;
import SOLID.Interfaces.Logger;
import SOLID.enums.ReportLevel;

import java.util.Arrays;

public class MessageLogger implements Logger {
    private Appender[] appenders;

    public MessageLogger(Appender... appenders) {
        this.appenders = appenders;
    }

    @Override
    public void logInfo(String time, String message) {
        Arrays.stream(appenders).forEach(appender -> appender.append(time, message, ReportLevel.INFO));
    }

    @Override
    public void logWarning(String time, String message) {
        Arrays.stream(appenders).forEach(appender -> appender.append(time, message, ReportLevel.WARNING));
    }

    @Override
    public void logError(String time, String message) {
        Arrays.stream(appenders).forEach(appender -> appender.append(time, message, ReportLevel.ERROR));
    }

    @Override
    public void logCritical(String time, String message) {
        Arrays.stream(appenders).forEach(appender -> appender.append(time, message, ReportLevel.CRITICAL));
    }

    @Override
    public void logFatal(String time, String message) {
        Arrays.stream(appenders).forEach(appender -> appender.append(time, message, ReportLevel.FATAL));
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Logger info").append(System.lineSeparator());
        for (Appender appender : appenders) {
            builder.append(appender).append(System.lineSeparator());
        }

        return builder.toString();
    }
}
