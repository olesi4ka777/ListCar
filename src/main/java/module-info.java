module com.example.listcar {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.listcar to javafx.fxml;
    exports com.example.listcar;
}