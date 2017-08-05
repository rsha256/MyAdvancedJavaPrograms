package Unit10;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneDemo extends Application
{
    @Override
    public void start( Stage myStage )
    {
        myStage.setTitle( "Making Fields Uneditable" );

        BorderPane rootNode = new BorderPane();

        Scene myScene = new Scene( rootNode, 300, 200 );

        Label left = new Label( "Left" );
        Label right = new Label( "Right" );
        Label center = new Label( "Center" );
        Label top = new Label( "Top" );
        Label bottom = new Label( "Bottom" );

        rootNode.setLeft( left );
        rootNode.setAlignment( left, Pos.CENTER );
        rootNode.setRight( right );
        rootNode.setAlignment( right, Pos.CENTER );
        rootNode.setCenter( center );
        rootNode.setAlignment( center, Pos.CENTER );
        rootNode.setTop( top );
        rootNode.setAlignment( top, Pos.CENTER );
        rootNode.setBottom( bottom );
        rootNode.setAlignment( bottom, Pos.CENTER );

        myStage.setScene( myScene );
        myStage.show();
    }
}