module calculatorApp {
    requires javafx.controls;
    requires javafx.fxml;

    opens calculatorApp to javafx.fxml;
    exports calculatorApp;
}
