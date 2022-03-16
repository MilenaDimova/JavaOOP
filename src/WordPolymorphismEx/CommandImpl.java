package WordPolymorphismEx;

public class CommandImpl implements CommandInterface {
    @Override
    public String uppercase(String text, int startIndex, int endIndex) {
        return text;
    }

    @Override
    public String cut(String text, int startIndex, int endIndex) {
        return text;
    }

    @Override
    public String paste(String text, int startIndex, int endIndex) {
        return text;
    }
}
