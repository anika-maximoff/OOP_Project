module main.mainprojectoop {
    requires javafx.controls;
    requires javafx.fxml;


    opens main.mainprojectoop to javafx.fxml;
    exports main.mainprojectoop;
}