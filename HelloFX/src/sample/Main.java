package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args); //Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        //Stage stage = new Stage();
        Group root = new Group();
        Scene scene = new Scene(root, Color.ANTIQUEWHITE);

        Image icon = new Image("graycat.jpg");
        stage.setTitle("Jimmythecat :)");
        stage.getIcons().add(icon);
        //stage.setWidth(420);
        //stage.setHeight(420);
        //stage.setResizable(false);
        stage.setX(0); //左上角為原點 與原點的距離
        stage.setY(0);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("You can't escape unless you press J");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("J"));

        stage.setScene(scene);
        stage.show();
    }
}
