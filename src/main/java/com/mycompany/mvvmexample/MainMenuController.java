import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;

public class MainMenuController {
    
    @FXML
    private void handleNew() {
        // code to handle "New" action
        System.out.println("New clicked!");
    }

    @FXML
    private void handleOpen() {
        // code to handle "Open" action
        System.out.println("Open clicked!");
    }

    @FXML
    private void handleSave() {
        // code to handle "Save" action
        System.out.println("Save clicked!");
    }

    @FXML
    private void handleExit() {
        // code to handle "Exit" action
        System.exit(0);
    }

    @FXML
    private void handleAbout() {
        // code to handle "About" action
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About");
        alert.setHeaderText("My App");
        alert.setContentText("This is a demo app created using JavaFX.");
        alert.showAndWait();
    }
}
