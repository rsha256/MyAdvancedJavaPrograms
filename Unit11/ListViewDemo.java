package Unit11;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ListViewDemo extends Application
{
    private Label response;

    @Override
    public void start(Stage myStage)
    {
        myStage.setTitle( "ListView Demo" );

        FlowPane rootNode = new FlowPane();

        Scene myScene = new Scene( rootNode, 300, 200 );

        ObservableList<String> choices = FXCollections.observableArrayList( "Item 1", "Item 2", "Item 3" );

        ListView<String> myListView = new ListView<>( choices );
        myListView.setPrefSize( 100, 100 );

        myListView.getSelectionModel().setSelectionMode( SelectionMode.MULTIPLE );

        MultipleSelectionModel<String> selectionMod = myListView.getSelectionModel();
        selectionMod.selectedItemProperty().addListener( new ListViewHandler() );

        response = new Label("");

        rootNode.getChildren().add( myListView );
        rootNode.getChildren().add( response );
        myStage.setScene( myScene );
        myStage.show();
    }

    class ListViewHandler implements ChangeListener< String >
    {
        @Override
        public void changed( ObservableValue<? extends String> change, String oldVal, String newVal )
        {
            response.setText( newVal + " was selected" );
        }
    }

    public static void main(String[] args)
    {
        launch( args );
    }
}
