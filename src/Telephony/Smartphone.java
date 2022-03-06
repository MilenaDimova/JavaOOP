package Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }


    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();
        this.urls.stream().forEach(url -> {
            if (isUrlValid(url)) {
                sb.append("Browsing: ").append(url).append("!").append(System.lineSeparator());
            } else {
                sb.append("Invalid URL!").append(System.lineSeparator());
            }
        });
        return sb.toString();
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        this.numbers
                .stream()
                .forEach(number -> {
                    if (isNumberValid(number)) {
                        sb.append("Calling... ").append(number).append(System.lineSeparator());
                    } else {
                        sb.append("Invalid number!").append(System.lineSeparator());
                    }
                });
        return sb.toString();
    }

    private boolean isUrlValid(String url) {
        for (int i = 0; i < url.length(); i++) {
            if (Character.isDigit(url.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean isNumberValid(String number) {
        for (int i = 0; i < number.length(); i++) {
            if (Character.isLetter(number.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
