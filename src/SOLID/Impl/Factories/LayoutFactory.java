package SOLID.Impl.Factories;

import SOLID.Impl.Layouts.SimpleLayout;
import SOLID.Impl.Layouts.XmlLayout;
import SOLID.Interfaces.Factory;
import SOLID.Interfaces.Layout;

public class LayoutFactory implements Factory<Layout> {
    @Override
    public Layout produce(String input) {
        Layout layout = null;

        if (input.equals("SimpleLayout")) {
            layout = new SimpleLayout();
        } else if (input.equals("XmlLayout")) {
            layout = new XmlLayout();
        }

        return layout;
    }
}
