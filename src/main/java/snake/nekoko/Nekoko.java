package snake.nekoko;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Nekoko extends Application {
    private static final String APP_TITLE = "Uchu Nekoko Music Player :3";
    // private final Image APP_ICON = new
    // Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/icon.png")));
    private static final String MAIN_VIEW_FILEPATH = "MainView.fxml";

    @Override
    public void start(Stage stage) throws Exception {
        loadApplication(stage);
    }

    private void loadApplication(Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader(Nekoko.class.getResource(MAIN_VIEW_FILEPATH));
            Scene scene = new Scene(loader.load());
            stage.setTitle(APP_TITLE);
            stage.setScene(scene);
            // stage.getIcons().add(APP_ICON);
            stage.show();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(Nekoko.class);
    }
}