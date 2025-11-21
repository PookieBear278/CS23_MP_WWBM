module com.evengroup.cs23_mp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.evengroup.cs23_mp to javafx.fxml;
    exports com.evengroup.cs23_mp;
}