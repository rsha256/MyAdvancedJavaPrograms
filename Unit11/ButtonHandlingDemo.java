package Unit11;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonHandlingDemo extends Application
{
    private Button myButton;

    public static void main( String [] args )
    {
        launch( args );
    }

    @Override
    public void start( Stage myStage )
    {
        myStage.setTitle( "Button Handling" );
        FlowPane rootNode = new FlowPane( 10, 10 );
        rootNode.setAlignment( Pos.CENTER );

        Scene myScene = new Scene( rootNode, 300, 200 );

        // make myButton a Button
        myButton = new Button( "Click me!" );

        // register an event handler
        myButton.setOnAction( new ButtonHandler() );

        rootNode.getChildren().add( myButton );
        myStage.setScene( myScene );
        myStage.show();
    }

    class ButtonHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle( ActionEvent e )
        {
            myButton.setText( "Clicked!" );
        }
    }
}