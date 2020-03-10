package view;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import controller.ControlerBase;
import controller.GUIMainController;
import controller.GameUI;
import model.PLAYERMOVE;
import model.Player;

public class GraphicalGameUI extends Application implements GameUI {
	
	public GraphicalGameUI() {

	}
	public static void main(String[] args) {
		launch(args);
	

		
	}

	public ArrayList<Player> setPlayers() throws Exception {
		String numPlayers = "1";
		ArrayList<Player> players = new ArrayList<Player>();

		int num = Integer.parseInt(numPlayers);
		for (int i = 0; i < num; i++) {
			Player p = new Player("Player " + (i + 1));
			players.add(p);
		}
		return players;
	}
	
	public int getAndShowPlayerBet(Player player) {
		return 0;
	}
	
	public void notifyNowPlayerTurn(Player player) {
		
	}
	
	public PLAYERMOVE getPlayerMove(Player player) {
		return PLAYERMOVE.STAND;
	}
	
	public void displaySum(int sum) {

	}
	
	public void notifyBusted(Player player) {

	}
	
	public void displayBalances(ArrayList<Player> players) {

	}
	
	public void notifyBroke(Player player) {
		
	}
	
	public boolean playAnotherRound() {
		return false;
	}
	
	public void begin(Stage primaryStage,GUIMainController gui) throws Exception {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/view/ProjectEnterPlay.fxml"));
		  Parent pane = loader.load();
		
	  Scene scene = new Scene( pane );
	  
	  ControlerBase controller = loader.getController();
	   controller.start(gui);
    	primaryStage.setTitle("Black Jack");
		primaryStage.setScene(scene);
		primaryStage.show();
    }
	

	public void start(Stage primaryStage) throws Exception{
		GUIMainController gui = new GUIMainController();
		begin(primaryStage,gui);
		
	}
}	