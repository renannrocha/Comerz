module com.project.easystock {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.postgresql.jdbc;
    requires java.sql;

    opens com.project.easystock to javafx.fxml;
    exports com.project.easystock;
    
    opens com.project.easystock.controllers to javafx.fxml;
    exports com.project.easystock.controllers;
    
    opens com.project.easystock.model to javafx.fxml;
    opens com.project.easystock.dao to javafx.fxml;
    opens com.project.easystock.utils to javafx.fxml;
}
