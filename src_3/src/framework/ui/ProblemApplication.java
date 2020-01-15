/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.ui;

import domains.arithmetic.ArithmeticGUI;
import domains.arithmetic.ArithmeticProblem;
import domains.dummy.DummyGUI;
import domains.dummy.DummyProblem;
import domains.farmer.FarmerGUI;
import domains.farmer.FarmerProblem;
import domains.puzzle.PuzzleProblem;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

/**
 *
 * @author Henry Keskitalo
 */
public class ProblemApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        TabPane tabPane = new TabPane();
        

        /* Add tabs using the following */
        Tab tab = new Tab();
        tab.setText("Arithmetic Problem");
        tab.setContent(new ProblemGUI(new ArithmeticProblem(), 600, 750));
        tabPane.getTabs().add(tab);

        Tab tab1 = new Tab();
        tab1.setText("Dummy Problem");
        tab1.setContent(new ProblemGUI(new DummyProblem(), 600, 750));
        tabPane.getTabs().add(tab1);
        
        Tab tab2 = new Tab();
        tab2.setText("FWGC Problem");
        tab2.setContent(new ProblemGUI(new FarmerProblem(), 600, 750));
        tabPane.getTabs().add(tab2);
        
        Tab tab3 = new Tab();
        tab3.setText("8-Puzzle Problem");
        tab3.setContent(new ProblemGUI(new PuzzleProblem(), 600, 750));
        tabPane.getTabs().add(tab3);
        
        Scene scene = new Scene(tabPane);

        primaryStage.setTitle("Problem Solver");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}