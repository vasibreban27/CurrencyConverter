import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyController {
    private final CurrencyView view;
    private final CurrencyModel model;

    public CurrencyController(CurrencyView view, CurrencyModel model) {
        this.view = view;
        this.model = model;

        // Add action listener for the Convert button
        this.view.convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleConversion();
            }
        });
    }

    // Handle conversion when the button is clicked
    private void handleConversion() {
        try {
            String fromCurrency = (String) view.fromCurrency.getSelectedItem();
            String toCurrency = (String) view.toCurrency.getSelectedItem();
            double amount = Double.parseDouble(view.amountField.getText());

            double result = model.convert(fromCurrency, toCurrency, amount);
            view.resultField.setText(String.format("%.2f", result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(view, "Please enter a valid amount.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
