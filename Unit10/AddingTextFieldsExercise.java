package Unit10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class AddingTextFieldsExercise extends Application
{
    @Override
    public void start( Stage myStage )
    {
        myStage.setTitle( "Adding a Text Fields Exercise" );
        FlowPane rootNode = new FlowPane();
        Scene myScene = new Scene( rootNode, 300, 200 );
        TextField textField1 = new TextField( "This is some default text" );
        textField1.setPrefColumnCount( 10 );
        TextField textField2 = new TextField();
        textField2.setText( "I love Java FX" );
        TextField textField3 = new TextField();
        textField3.setPromptText( "Make sure you fill out this text field." );
        rootNode.getChildren().addAll( textField1, textField2, textField3 );
        myStage.setScene( myScene );
        myStage.show();
    }
}
