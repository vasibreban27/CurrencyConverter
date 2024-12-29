import javax.swing.*;
import java.awt.*;

public class CurrencyView extends JFrame {
    // Components
    JComboBox<String> fromCurrency;
    JComboBox<String> toCurrency;
    JTextField amountField;
    JTextField resultField;
    JButton convertButton;

    public CurrencyView() {
        // Set up the GUI
        setTitle("Currency Converter");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        // Components
        fromCurrency = new JComboBox<>(new String[]{"RON", "EUR", "USD"});
        toCurrency = new JComboBox<>(new String[]{"RON", "EUR", "USD"});
        amountField = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);
        convertButton = new JButton("Convert");

        // Add components to the GUI
        add(new JLabel("From Currency:"));
        add(fromCurrency);
        add(new JLabel("To Currency:"));
        add(toCurrency);
        add(new JLabel("Amount:"));
        add(amountField);
        add(new JLabel("Result:"));
        add(resultField);

        add(convertButton);

        setVisible(true);
    }
}
