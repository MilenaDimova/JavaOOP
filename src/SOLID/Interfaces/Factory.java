package SOLID.Interfaces;

public interface Factory<T> {
    T produce(String input);
}
