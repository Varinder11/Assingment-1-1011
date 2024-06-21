module org.example.assign1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    requires org.kordamp.bootstrapfx.core;

    opens org.example.assign1 to javafx.fxml;
    exports org.example.assign1;
}