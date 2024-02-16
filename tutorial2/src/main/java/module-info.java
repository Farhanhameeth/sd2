module org.example.tutorial2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.example.tutorial2 to javafx.fxml;
    exports org.example.tutorial2;
}