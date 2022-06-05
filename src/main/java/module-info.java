module com.hls.testjava {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.hls.testjava to javafx.fxml;
    exports com.hls.testjava;
}