package Unit10;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneDemo2 extends Application
{
    @Override
    public void start( Stage myStage)
    {
        myStage.setTitle( "Changing the Flow Pane" );
        FlowPane rootNode = new FlowPane();
        rootNode.setPadding( new Insets( 30 ) );
        rootNode.setHgap( 5 );
        rootNode.setVgap( 5 );

        Scene myScene = new Scene( rootNode, 300, 200 );

        rootNode.getChildren().addAll( new Label( "First Name:" ), new TextField(), new Label( "MI:" ) );
        TextField middleInitial = new TextField();
        middleInitial.setPrefColumnCount( 1 );
        rootNode.getChildren().addAll( middleInitial, new Label( "Last Name:" ), new TextField() );

        myStage.setScene( myScene );
        myStage.show();
    }
}