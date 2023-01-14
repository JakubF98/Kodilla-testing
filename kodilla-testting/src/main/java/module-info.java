module com.example.kodillatestting {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kodillatestting to javafx.fxml;
    exports com.example.kodillatestting;
}