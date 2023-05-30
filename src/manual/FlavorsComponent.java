package src.manual;

import javax.swing.*;

public class FlavorsComponent {

    public JPanel root;

    public JTextField textField1;

    private JTextField textField2;

    public FlavorsComponent() {
        root = new JPanel();
        textField1 = new JTextField();
        textField2 = new JTextField();

        root.add(textField1);
        root.add(textField2);
    }
}
