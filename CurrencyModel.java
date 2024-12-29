import java.util.HashMap;

public class CurrencyModel {
    private final HashMap<String, Double> exchangeRates;

    public CurrencyModel() {
        // Example exchange rates (1 EUR to other currencies)
        exchangeRates = new HashMap<>();
        exchangeRates.put("RON", 4.9793);
        exchangeRates.put("EUR", 1.0);
        exchangeRates.put("USD", 1.1); // Example rate
    }

    // Method to convert currency
    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (exchangeRates.containsKey(fromCurrency) && exchangeRates.containsKey(toCurrency)) {
            double fromRate = exchangeRates.get(fromCurrency);
            double toRate = exchangeRates.get(toCurrency);
            return (amount / fromRate) * toRate;
        }
        return 0.0;
    }
}
