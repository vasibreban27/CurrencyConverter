public class CurrencyConverter {
    public static void main(String[] args) {
        // Create the View
        CurrencyView view = new CurrencyView();

        // Create the Model
        CurrencyModel model = new CurrencyModel();

        // Create the Controller
        new CurrencyController(view, model);
    }
}
