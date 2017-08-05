package Unit11;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonHandling extends Application
{
    private Button onButton;
    private Button offButton;
    private Label label;

    @Override
    public void start( Stage myStage )
    {
        myStage.setTitle( "Button Handling" );
        FlowPane rootNode = new FlowPane( 10, 10 );
        rootNode.setAlignment( Pos.CENTER );

        Scene myScene = new Scene( rootNode, 300, 200 );

        label = new Label("Push a Button");

        // make Buttons
        onButton = new Button( "On" );
        offButton = new Button( "Off" );

        // register an event handler
        offButton.setOnAction( new ButtonHandler() );
        onButton.setOnAction( new ButtonHandler2() );

        rootNode.getChildren().addAll( onButton, offButton, label );
        myStage.setScene( myScene );
        myStage.show();
    }

    class ButtonHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle( ActionEvent e )
        {
            label.setText( "Off button pushed" );
        }
    }

    class ButtonHandler2 implements EventHandler<ActionEvent>
    {
        @Override
        public void handle( ActionEvent e )
        {
            label.setText( "On button pushed" );
        }
    }

}