package applicationTwo;

import java.util.Arrays;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class StringUtility  extends Application{

	public static void main(String[] args) {
        launch(args);
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		 primaryStage.setTitle("String Utility");
		 	GridPane grid = new GridPane();
	        grid.setAlignment(Pos.CENTER);
	        grid.setHgap(10);
	        grid.setVgap(10);
	        grid.setPadding(new Insets(25, 25, 25, 25));
	        
	        
	    //    scenetitle.setFont(Font.font("Harlow Solid Italic", FontWeight.NORMAL, 20)); //Tahoma
	     //   grid.add(scenetitle, 0, 0, 2, 1);

	        
	        
	        Button btnCount = new Button("Count Letters");
	        Button btnRev = new Button("Reverse Letters");
	        Button btnRemDup = new Button("Remove Duplicate");
	        VBox hbBtn = new VBox(15);
	        hbBtn.setAlignment(Pos.CENTER);
	        hbBtn.getChildren().add(btnCount);
	        hbBtn.getChildren().add(btnRev);
	        hbBtn.getChildren().add(btnRemDup);
	       // grid.getChildren().add(hbBtn);
	        grid.add(btnCount, 0, 1);
	        grid.add(btnRev, 0, 2);
	        grid.add(btnRemDup, 0, 3);
	        
	        Label inputTxt = new Label("Input:");
	        TextField inputTxtField = new TextField();
	        Label outputTxt = new Label("Output:");
	        TextField outTxtField = new TextField();
	        grid.add(inputTxt, 1, 0);
	        grid.add(inputTxtField, 1, 1);
	        grid.add(outputTxt, 1, 2);
	        grid.add(outTxtField, 1, 3);
	        btnCount.setOnAction(new EventHandler<ActionEvent>() {
	        	@Override
	        	public void handle(ActionEvent e) {
	        		Integer len=inputTxtField.getText().length();
	        		
	        		outTxtField.setText(len.toString() );
	        	}
	        });
	        btnRev.setOnAction(new EventHandler<ActionEvent>() {
	        	@Override
	        	public void handle(ActionEvent e) {
	        		StringBuilder input1 = new StringBuilder();
	        		input1.append(inputTxtField.getText());
	        		
	        		outTxtField.setText(input1.reverse().toString());
	        	}
	        });

	        btnRemDup.setOnAction(new EventHandler<ActionEvent>() {
	        	@Override
	        	public void handle(ActionEvent e) {
	        		
	        		
	        		char str[] = inputTxtField.getText().toCharArray(); 
	                int n = str.length; 
	             
	        		outTxtField.setText(removeDuplicate(str, n));
	        	}
	        });
	        
	       // grid.setVgap(10);
	        
	       // grid.getChildren().add(vBox);
	        primaryStage.setWidth(650);
	        primaryStage.setHeight(200);
	        Scene scenee = new Scene(grid);
		primaryStage.setScene(scenee);
		primaryStage.show();
	}
	static String removeDuplicate(char str[], int n) 
    { 
        // Used as index in the modified string 
        int index = 0; 
  
        // Traverse through all characters 
        for (int i = 0; i < n; i++) 
        { 
  
            // Check if str[i] is present before it  
            int j; 
            for (j = 0; j < i; j++)  
            { 
                if (str[i] == str[j]) 
                { 
                    break; 
                } 
            } 
  
            // If not present, then add it to 
            // result. 
            if (j == i)  
            { 
                str[index++] = str[i]; 
            } 
        } 
        return String.valueOf(Arrays.copyOf(str, index)); 
    } 

}
