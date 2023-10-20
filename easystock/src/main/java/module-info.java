module com.project.easystock {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.project.easystock to javafx.fxml;
    exports com.project.easystock;
}
