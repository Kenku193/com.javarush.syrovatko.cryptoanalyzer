module com.javarush.syrovatko.cryptoanalyzer {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.javarush.syrovatko.cryptoanalyzer to javafx.fxml;
    exports com.javarush.syrovatko.cryptoanalyzer;
    exports com.javarush.syrovatko.cryptoanalyzer.controller;
    opens com.javarush.syrovatko.cryptoanalyzer.controller to javafx.fxml;
}