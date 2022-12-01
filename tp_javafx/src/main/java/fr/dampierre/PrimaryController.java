package fr.dampierre;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtPivot;

    void btnPivoterClick(ActionEvent event) {

        String rotationString = txtPivot.getText();
        int rotation = Integer.parseInt(rotationString);
        txtPivot.setRotate(rotation);
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
