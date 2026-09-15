module com.risav.library_management_system {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;
    requires java.sql;
    
    opens com.risav.library_management_system to javafx.fxml;
    exports com.risav.library_management_system;
    requires spring.boot;
}
