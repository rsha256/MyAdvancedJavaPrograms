package Unit10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class UneditableFields extends Application
{
    @Override
    public void start( Stage myStage )
    {
        myStage.setTitle( "Making Fields Uneditable" );
        FlowPane rootNode = new FlowPane();
        Scene myScene = new Scene( rootNode, 300, 200 );
        Label aLabel = new Label( "The total cost is: " );
        TextField aTextField = new TextField( "$ 99,999.99" );
        aTextField.setEditable( false );
        rootNode.getChildren().addAll( aLabel, aTextField );
        myStage.setScene( myScene );
        myStage.show();
    }
}
