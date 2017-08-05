package Unit11;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class CheckBoxDemo extends Application
{

    private CheckBox byMail;
    private CheckBox byEMail;
    private CheckBox noThanks;
    private Label response;

    @Override
    public void start( Stage myStage )
    {
        myStage.setTitle( "Check Box Demo" );
        FlowPane rootNode = new FlowPane( Orientation.VERTICAL );
        rootNode.setVgap( 5 );
        rootNode.setAlignment( Pos.CENTER );

        Scene myScene = new Scene( rootNode, 300, 200 );

        response = new Label( "" );
        Label myLabel = new Label( "How would you like to receive your receipt?" );

        byMail = new CheckBox( "Mail" );
        byEMail = new CheckBox( "E-Mail" );
        noThanks = new CheckBox( "No receipt needed" );

        byMail.setOnAction( new MailHandler() );
        byEMail.setOnAction( new EMailHandler() );
        noThanks.setOnAction( new NoHandler() );

        rootNode.getChildren().addAll( byMail, byEMail, noThanks, myLabel, response );
        myStage.setScene( myScene );
        myStage.show();
    }

    class EMailHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle( ActionEvent e )
        {
            showAll();
        }
    }

    class MailHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle( ActionEvent e )
        {
            showAll();
        }
    }

    class NoHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle( ActionEvent e )
        {
            showAll();
        }
    }

    private void showAll()
    {
        String receipts = "Receipts will be sent via:";

        if( byMail.isSelected() )
            receipts += " Mail";
        if( byMail.isSelected() && byEMail.isSelected() )
            receipts += ",";
        if( byEMail.isSelected() )
            receipts += " Email";
        if( noThanks.isSelected() )
        {
            byMail.setSelected( false );
            byEMail.setSelected( false );
            receipts = "No Receipt needed";
        }
        if( !byMail.isSelected() && !byEMail.isSelected() && !noThanks.isSelected() )
            receipts = "";

        response.setText( receipts );
    }

    public static void main(String[] args)
    {
        launch( args );
    }


}