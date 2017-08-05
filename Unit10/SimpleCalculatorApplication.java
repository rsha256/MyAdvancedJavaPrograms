package Unit10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class SimpleCalculatorApplication extends Application
{
    @Override
    public void start( Stage myStage )
    {
        myStage.setTitle( "Simple Calculator" );
        FlowPane rootNode = new FlowPane();
        Scene myScene = new Scene( rootNode, 300, 200 );
        Label firstValue = new Label( " First Value:        " );
        Label secondValue = new Label( " Second Value:   " );
        Label sumLabel = new Label( " Sum is:              " );
        TextField firstField = new TextField( "First Value" );
        TextField secondField = new TextField( "Second Value" );
        TextField sumField = new TextField();
        sumField.setEditable( false );
        rootNode.getChildren().addAll( firstValue, firstField, secondValue, secondField, sumLabel, sumField );
        myStage.setScene( myScene );
        myStage.show();
    }
}
