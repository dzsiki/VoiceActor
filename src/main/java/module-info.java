module org.main {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    opens org.main to javafx.fxml;
    exports org.main;
}
