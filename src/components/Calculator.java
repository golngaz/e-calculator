package src.components;

import javax.swing.*;
import java.awt.event.*;

public class Calculator {

    public JPanel root;

    private JTextField totalField;

    private JTextField baseField;

    private JTextField nicotineField;

    private JButton addFlavorButton;


    private JPanel flavorsPanel;

    private JTextField flavor1Field;

    private JTextField flavor2Field;

    private JTextField flavor3Field;

    private JSlider baseSlider;

    private JButton baseButton;

    private JSlider nicotineSlider;

    private JButton nicotineButton;

    private JSlider flavor1Slider;

    private JSlider flavor2Slider;

    private JSlider flavor3Slider;

    private JButton flavor1Button;

    private JButton flavor2Button;

    private JButton flavor3Button;

    private JPanel flavor1Panel;

    private JPanel flavor2Panel;

    private JPanel flavor3Panel;

    private JButton deleteFlavorButton;

    private int total = 10;

    private int flavorCount;

    public Calculator() {
        flavor2Panel.setVisible(false);
        flavor3Panel.setVisible(false);
        deleteFlavorButton.setVisible(false);

        this.flavorCount = 1;

        addFlavorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (flavorCount == 1) {
                    addPanel(flavor2Panel);
                } else if (flavorCount == 2) {
                    addPanel(flavor3Panel);
                }
            }
        });

        deleteFlavorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (flavorCount == 3) {
                    removePanel(flavor3Panel);
                } else {
                    removePanel(flavor2Panel);
                }
            }
        });

        totalField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);

                try {
                    String text = totalField.getText();
                    if (!text.equals("")) {
                        int number = Integer.parseInt(text);
                        if (number < 0) {
                            throw new NumberFormatException();
                        }

                        total = number;
                    }
                } catch (NumberFormatException exception) {
                    totalField.setText(Integer.toString(total));
                }
            }
        });
    }

    private void addPanel(JPanel panel) {
        panel.setVisible(true);

        deleteFlavorButton.setVisible(true);
        flavorCount++;
    }

    private void removePanel(JPanel panel) {
        panel.setVisible(false);

        flavorCount--;
        if (flavorCount == 1) {
            deleteFlavorButton.setVisible(false);
        }
    }
}
