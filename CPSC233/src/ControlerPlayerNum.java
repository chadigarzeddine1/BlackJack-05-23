

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControlerPlayerNum {
	Stage primaryStage;
    @FXML

    private String numplayer;

    private boolean playerset = false;
    @FXML
   // void hitClick(ActionEvent event) throws Exception {
//    	 Parent pane = FXMLLoader.load(
//                 getClass().getResource("Projectlayout.fxml"));
//
//         Scene scene = new Scene( pane );
//         Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
//         window.setScene(scene);
//         window.show();
    	//System.out.print("yes");
    //}
   
    public Button getEnter() {
    	return enter;
    }
    @FXML
   
    public void enterClick() {
    	numplayer = numplay.getText();
    }
    

    public String getNumplayers()  {

    	return numplayer;
  
    	}
    public boolean getPlayerSet()  {

    	return playerset;
  
    	}
    
    
    public void setPrimaryStage(Stage stage) {
  	  this.primaryStage = stage;
  	}
  public Stage getStage() {
  	return primaryStage;
  }
  
  public void changeScene(String fxml) throws Exception{
      Parent pane = FXMLLoader.load(
             getClass().getResource("Projectlayout.fxml"));

     Scene scene = new Scene( pane );
     primaryStage.setScene(scene);
  }
  @FXML
  private Button hit;

  @FXML
  private TextField numplay;

  @FXML
  private Button enter;

  @FXML
  private Button stand;

  @FXML
  void hitClick(ActionEvent event) {

  }

  @FXML
  void standClick(ActionEvent event) {

  }

  @FXML
  void enterClick(ActionEvent event) throws Exception {
	  Parent pane = FXMLLoader.load(
            getClass().getResource("Projectlayout.fxml"));

    Scene scene = new Scene( pane );
    Stage window =(Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(scene);
    numplayer = numplay.getText();
    
  }

}