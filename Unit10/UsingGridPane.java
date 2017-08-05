package Unit10;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class UsingGridPane extends Application
{
    @Override
    public void start(Stage myStage)
    {
        myStage.setTitle( "Using the Grid Pane" );
        GridPane rootNode = new GridPane();
        rootNode.setPadding( new Insets( 30 ) );
        rootNode.setHgap( 5 );
        rootNode.setVgap( 5 );
        rootNode.setAlignment( Pos.CENTER );

        Scene myScene = new Scene( rootNode, 450, 200 );

        rootNode.add( new Label( "First Name:" ), 0, 0 );
        rootNode.add( new TextField(), 1, 0 );
        rootNode.add( new Label( "MI:" ), 0, 1 );

        TextField middleInitial = new TextField();
        middleInitial.setPrefColumnCount( 1 );

        rootNode.add( middleInitial, 1, 1 );
        rootNode.add( new Label( "Last Name:" ), 0, 2 );
        rootNode.add( new TextField(), 1, 2 );

        Button aButton = new Button( "Add Name" );
        rootNode.add( aButton, 1, 3 );
        rootNode.setHalignment( aButton, HPos.RIGHT );

        myStage.setScene( myScene );
        myStage.show();
    }
}