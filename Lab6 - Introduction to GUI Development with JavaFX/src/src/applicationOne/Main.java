package applicationOne;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,100,
					100);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Address Form");
			//******************
			//HBox rootH = new HBox(5);
			//HBox rootH2 = new HBox(5);
				FlowPane grid = new FlowPane();
		        grid.setAlignment(Pos.BASELINE_CENTER);
		        grid.setHgap(10);
		        grid.setVgap(10);
		        grid.setPadding(new Insets(25, 25, 25, 25));

		      
		        grid.setPadding(new Insets(15));
		       // grid.setAlignment(Pos.CENTER);
		        Label userName = new Label("Name:");
		        grid.getChildren().add(userName);
		        TextField userTextField = new TextField();
		        grid.getChildren().add(userTextField);
		        
		        Label street = new Label("Street:");
		        grid.getChildren().add(street);
		        TextField streetTextField = new TextField();
		        grid.getChildren().add(streetTextField);

		        Label city= new Label("City:");
		        grid.getChildren().add(city);
		        TextField cityTextField = new TextField();
		        grid.getChildren().add(cityTextField);
		      //  Separator sep = new Separator();
		        //sep.setMaxWidth(80);
		        //sep.setHalignment(Pos.BASELINE_LEFT);
		     //   grid.getChildren().add(1, sep);
		        Label state= new Label("State:");
		        grid.getChildren().add(state);
		        TextField stateTextField = new TextField();
		        grid.getChildren().add(stateTextField);
		      //  grid.getChildren().add(stateTextField);
			//******************
		        Label zip= new Label("Zip:");
		        grid.getChildren().add(zip);
		        TextField zipTextField = new TextField();
		        grid.getChildren().add(zipTextField);
		        Scene scenee = new Scene(grid);
		        Button btn = new Button("Submit");
		        HBox hbBtn = new HBox(10);
		        hbBtn.setAlignment(Pos.CENTER);
		        hbBtn.getChildren().add(btn);
		        grid.getChildren().add(hbBtn);
		        btn.setOnAction(new EventHandler<ActionEvent>() {
		        	@Override
		        	public void handle(ActionEvent e) {
		        	  System.out.println(userTextField.getText());
		        	  System.out.println(streetTextField.getText());
		        	  System.out.println(cityTextField.getText()+", "+stateTextField.getText()+" "+zipTextField.getText());
		        	}
		        });
		        
		        primaryStage.setWidth(650);
		        primaryStage.setHeight(200);
		        
			primaryStage.setScene(scenee);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
