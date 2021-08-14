/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulackafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author kuba
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField cislo1TextField;
    @FXML
    private TextField cisloTextField;
    @FXML
    private ComboBox operaceComboBox;
    @FXML
    private Button vypocitejButton;
    @FXML
    private Label vysledekLabel;
    
    @FXML
    private void handleVypocitejButtonAction(ActionEvent event) {
        double cislo1 = Double.parseDouble(cislo1TextField.getText());
        double cislo2 = Double.parseDouble(cisloTextField.getText());
        String operace = (String)operaceComboBox.getSelectionModel().getSelectedItem();
        double vysledek = 0;
        switch(operace){
            case "+":
                vysledek = cislo1 + cislo2;
                break;
            case "-":
                vysledek = cislo1 - cislo2;
                break;
            case "*":
                vysledek = cislo1 * cislo2;
                break;
            case "/":
                if(cislo2 != 0)
                vysledek = cislo1 / cislo2;
                break;
        }
        vysledekLabel.setText(String.valueOf(vysledek));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> operace = FXCollections.observableArrayList("+","-","*","/");
        operaceComboBox.setItems(operace);
        operaceComboBox.getSelectionModel().selectFirst();
    }    
    
}
