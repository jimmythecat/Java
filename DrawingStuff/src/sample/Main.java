package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.ANTIQUEWHITE);
        Stage stage = new Stage();

        Text text = new Text();
        text.setText("Jimmy!!!");
        text.setX(75); //單位為px 1px = 0.04cm
        text.setY(100);
        text.setFont(Font.font("Verdana", 50));
        text.setFill(Color.PLUM);

        Line line  = new Line();
        line.setStartX(77);
        line.setStartY(105);
        line.setEndX(290);
        line.setEndY(105);
        line.setStrokeWidth(5);
        line.setStroke(Color.PLUM);
        line.setOpacity(0.5); //不透明度
        //line.setRotate(45);

        Rectangle rectangle = new Rectangle(); //長方形
        rectangle.setX(320);
        rectangle.setY(60);
        rectangle.setWidth(50);
        rectangle.setHeight(50);
        rectangle.setStrokeWidth(3);
        rectangle.setFill(Color.PLUM);
        rectangle.setOpacity(0.7);

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                475.0, 60.0,
                475.0, 110.0,
                525.0, 110.0
        );  //value should be double
        triangle.setFill(Color.PLUM);
        triangle.setOpacity(0.7);

        Circle circle = new Circle();
        circle.setCenterX(420);
        circle.setCenterY(85);
        circle.setRadius(28);
        circle.setFill(Color.PLUM);
        circle.setOpacity(0.7);

        Image image = new Image("cat.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setX(110);
        imageView.setY(140);

        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(imageView);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
