package WordPolymorphismEx;

public interface CommandInterface {
    String uppercase(String text, int startIndex, int endIndex);
    String cut(String text, int startIndex, int endIndex);
    String paste(String text, int startIndex, int endIndex);
}
