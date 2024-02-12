module org.example.tutorial1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.example.tutorial1 to javafx.fxml;
    exports org.example.tutorial1;
}