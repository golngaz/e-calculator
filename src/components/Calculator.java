package src.components;

import javax.swing.*;

public class Calculator {

    public JPanel root;

    private JTextField totalField;

    private JTextField baseField;

    private JTextField nicotineField;

    private JButton addFlavorButton;
    private JPanel flavorsPanel;

    private FlavorsComponent flavorsComponent;

    public Calculator() {
    }

    public void next() {

        flavorsComponent = new FlavorsComponent();

        flavorsPanel.add(new JTextField());
    }
}
