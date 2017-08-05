package Unit10;/*
            myStage.setTitle( "Making Fields Uneditable" );
            FlowPane rootNode = new FlowPane();
            Scene myScene = new Scene( rootNode, 300, 200 );
            Label aLabel = new Label( "THe total cost is: " );
            TextField aTextField = new TextField( "$99,999.99" );
            aTextField.setEditable( false );
            rootNode.getChildren().addAll( aLabel, aTextField );
            myStage.setScene( myScene );
            myStage.show();
 */

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.*;

public class MyFXApplication extends Application
{
    @Override
    public void init()
    {

    }

    @Override
    public void start( Stage myStage )
    {
        myStage.setTitle( "My First Java FX Application" );
        // create root node to layout stuff
        FlowPane rootNode = new FlowPane();
        // create scene
        Scene myScene = new Scene( rootNode, 300, 200 );
        // create a label
        Label myLabel = new Label( "This is a label" );
        // add a label to the scene graph
        rootNode.getChildren().add( myLabel );
        // set scene on the stage
        myStage.setScene( myScene );
        // disable resizing
        myStage.setResizable( false );
        // show stage and scene
        myStage.show();
    }

    @Override
    public void stop()
    {
    }
}