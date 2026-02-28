module snake.nekoko {
    requires javafx.controls;
    requires javafx.fxml;

    opens snake.nekoko to javafx.fxml;
    exports snake.nekoko;
    exports snake.nekoko.controller;
    opens snake.nekoko.controller to javafx.fxml;
}