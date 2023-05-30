import src.manual.Calculator;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setSize(800, 600);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        Calculator calculator = new Calculator();
        frame.add(calculator.root);

        frame.setVisible(true);

        calculator.next();
    }
}
