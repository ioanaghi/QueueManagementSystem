module app.queuemanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens app.queuemanagementsystem to javafx.fxml;
    exports app.queuemanagementsystem;
    exports app.queuemanagementsystem.GUI;
    opens app.queuemanagementsystem.GUI to javafx.fxml;
}