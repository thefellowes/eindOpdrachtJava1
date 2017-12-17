package sample;

import javafx.beans.Observable;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Observer;

public class Controller{
    private Model model;
    private addMovie addMovieDisplay;

    Controller(Model model, addMovie addMovieDisplay){
        this.model = model;
        this.addMovieDisplay = addMovieDisplay;
    }

    public void update(Observable o, Object arg){
        addMovieDisplay.clear();
    }

    public Model getData(){
        return model;
    }
}
