package snake.nekoko.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class MainViewController implements Initializable {
    private static final String PLAYER_VIEW_FILEPATH = "/DisocgraphyView.fxml";
    private static final String DISCOGRAPHY_VIEW_FILEPATH = "/DisocgraphyView.fxml";

    @FXML
    private StackPane bannerContainer;
    @FXML
    private ImageView bannerImage;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (bannerImage != null && bannerContainer != null) {
            bannerImage.fitWidthProperty().bind(bannerContainer.widthProperty());
            bannerImage.fitHeightProperty().bind(bannerContainer.heightProperty());
        }
    }

    public void viewMoreButton(ActionEvent actionEvent) {
    }

    public void album1Button(ActionEvent actionEvent) {
    }

    public void album2Button(ActionEvent actionEvent) {
    }
}
