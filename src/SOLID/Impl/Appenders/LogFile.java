package SOLID.Impl.Appenders;

import SOLID.Interfaces.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class LogFile implements File {
    private static final String DEFAULT_FILE_NAME = "default.txt";

    private StringBuilder text;
    private int size;
    private String fileName;

    public LogFile() {
        this(DEFAULT_FILE_NAME);
    }

    public LogFile(String fileName) {
        this.text = new StringBuilder();
        this.size = 0;
        this.fileName = fileName;
    }

    @Override
    public int getSize() {
        return this.calculateSize();
    }

    private int calculateSize() {
        int size = 0;

        for(char symbol : this.text.toString().toCharArray()) {
            if (Character.isAlphabetic(symbol)) {
                size += symbol;
            }
        }
        return size;
    }

    @Override
    public boolean write(String text) {
        try {
            Files.write(Paths.get(this.fileName), text.getBytes(), StandardOpenOption.APPEND);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void append(String text) {
        text = addLineBreakInFile(text);
        this.text.append(text);
        this.write(text);
    }

    private String addLineBreakInFile(String text) {
        StringBuilder builder = new StringBuilder(text);
        builder.append(System.lineSeparator());
        return builder.toString();
    }
}
