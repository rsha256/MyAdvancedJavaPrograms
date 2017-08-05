package Unit11;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ComboBoxDemo extends Application
{
    private Label myLabel;
    private ComboBox<String> shipping;

    @Override
    public void start( Stage myStage )
    {
        myStage.setTitle( "My First Java FX Application" );
        // create root node to layout stuff
        FlowPane rootNode = new FlowPane();
        // create scene
        Scene myScene = new Scene( rootNode, 300, 200 );

        // create list of choices
        ObservableList<String> shippingChoices =
                FXCollections.observableArrayList( "US Postal Service", "FedEx", "UPS", "Airborne Express" );

        // create combo box
        shipping = new ComboBox<>( shippingChoices );

        shipping.setVisibleRowCount( 2 );

        myLabel = new Label( "" );

        // register event handler
        shipping.setOnAction( new ComboBoxHandler() );

        // set default choice
        shipping.setValue( "UPS" );

        // add box to the rootNode
        rootNode.getChildren().add( shipping );
        rootNode.getChildren().add( myLabel );
        // set scene on the stage
        myStage.setScene( myScene );
        // show stage and scene
        myStage.show();
    }
    class ComboBoxHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle( ActionEvent e )
        {
            myLabel.setText( "You selected " + shipping.getValue() );
        }
    }
}