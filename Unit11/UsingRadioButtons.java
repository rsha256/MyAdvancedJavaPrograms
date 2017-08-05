package Unit11;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class UsingRadioButtons extends Application
{
    private Label shippingMethod = new Label( "Please select a shipping method" );
    private RadioButton aUSPSButton;
    private RadioButton aFEDEXButton;
    private RadioButton aUPSButton;
    private RadioButton noButton;

    @Override
    public void start( Stage myStage )
    {
        myStage.setTitle( "Radio Buttons" );
        FlowPane rootNode = new FlowPane( 10, 10 );
        rootNode.setAlignment( Pos.CENTER );

        Scene myScene = new Scene( rootNode, 300, 200 );

        // below i create 3 radio buttons
        aUSPSButton = new RadioButton( "USPS" );
        aFEDEXButton = new RadioButton( "FedEx" );
        aUPSButton = new RadioButton( "UPS" );
        noButton = new RadioButton( "None" );

        aUSPSButton.setOnAction( new USPSHandler() );
        aFEDEXButton.setOnAction( new FedExHandler() );
        aUPSButton.setOnAction( new UPSHandler() );
        noButton.setOnAction( new NoHandler() );

        ToggleGroup myGroup = new ToggleGroup();

        // below i sync the 3 buttons with the ToggleGroup object (defined one line above)
        aUSPSButton.setToggleGroup( myGroup );
        aFEDEXButton.setToggleGroup( myGroup );
        aUPSButton.setToggleGroup( myGroup );
        noButton.setToggleGroup( myGroup );

        // make it start with the FedEx button selected
        aFEDEXButton.setSelected( true );

        rootNode.getChildren().addAll( aUSPSButton, aFEDEXButton, aUPSButton, noButton, shippingMethod );
        myStage.setScene( myScene );
        myStage.show();
    }

    class USPSHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle( ActionEvent e )
        {
            shippingMethod.setText( "You have selected the United States Postal Service!" );
        }
    }

    class UPSHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle( ActionEvent e )
        {
            shippingMethod.setText( "You have selected the United Parcel Service!" );
        }
    }

    class FedExHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle( ActionEvent e )
        {
            shippingMethod.setText( "You have selected the Federal Express!" );
        }
    }

    class NoHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle( ActionEvent e )
        {
            shippingMethod.setText( "No Shipping Required!" );
        }
    }

}