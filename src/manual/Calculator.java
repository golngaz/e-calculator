package src.manual;

import src.components.FlavorsComponent;

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
        root = new JPanel();
        totalField = new JTextField();
        baseField = new JTextField();
        nicotineField = new JTextField();
        addFlavorButton = new JButton("Add Flavor");
        flavorsPanel = new JPanel();

        root.add(totalField);
        root.add(baseField);
        root.add(nicotineField);
        root.add(addFlavorButton);
        root.add(flavorsPanel);
    }

    public void next() {
        flavorsComponent = new FlavorsComponent();

        flavorsPanel.add(new JTextField());
    }
}
