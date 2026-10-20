module com.mycompany.can_dinero {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.can_dinero to javafx.fxml;
    exports com.mycompany.can_dinero;
}
