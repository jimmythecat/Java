package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML

    private Circle myCircle;
    private double x;
    private double y;

    public void UP(ActionEvent e){
        System.out.println("UP");
        myCircle.setCenterY(y -= 10);
    }
    public void RIGHT(ActionEvent e){
        System.out.println("RIGHT");
        myCircle.setCenterX(x += 10);
    }
    public void DOWN(ActionEvent e){
        System.out.println("DOWN");
        myCircle.setCenterY(y += 10);
    }
    public void LEFT(ActionEvent e){
        System.out.println("LEFT");
        myCircle.setCenterX(x -= 10);
    }
}
