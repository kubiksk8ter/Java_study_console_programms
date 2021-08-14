/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upominacnarozenin;




import java.net.URL;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;

import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.util.Callback;

/**
 *
 * @author kuba
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private ListView<Osoba> osobyListView;
    @FXML
    private Label dnesLabel;
    @FXML
    private Label nejblizsiLabel;
    @FXML
    private Label narozeninyLabel;
    @FXML
    private Label vekLabel;
    
    private SpravceOsob spravceOsob = new SpravceOsob();
    
    
    @FXML
    public void handleOdebratButtonAction(ActionEvent event){
        Osoba vybrana = osobyListView.getSelectionModel().getSelectedItem();
        if(vybrana != null){
            spravceOsob.odeber(vybrana);
        }
    }
    
    private void vytvorObsahDialogu(Dialog<Osoba> dialog){
    //Vytvoření "potvrzovacího" tlačítka pro potvrzení dialogu
    ButtonType createButtonType = new ButtonType("OK", ButtonData.OK_DONE);
    //Nastavení tlačítka dialogu
    dialog.getDialogPane().getButtonTypes().setAll(createButtonType, ButtonType.CANCEL);

    // Mřížka
    GridPane grid = new GridPane();
    grid.setAlignment(Pos.CENTER);
    grid.setPadding(javafx.geometry.Insets.EMPTY);
    grid.setHgap(10);
    grid.setVgap(10);

    // Komponenty
    TextField jmenoTextField = new TextField();
    TextField datumTextField = new TextField();
    Label jmenoLabel = new Label("Jméno");
    Label datumLabel = new Label("Datum narození");

    grid.add(jmenoLabel, 0, 0);
    grid.add(jmenoTextField, 1, 0);
    grid.add(datumLabel, 0, 1);
    grid.add(datumTextField, 1, 1);

    dialog.setResultConverter(new Callback<ButtonType, Osoba>() {
        @Override
        public Osoba call(ButtonType param) {
            try{
                Calendar narozeniny = Datum.naparsuj(datumTextField.getText());
                return new Osoba(jmenoTextField.getText(), narozeniny);
            } catch (ParseException | IllegalArgumentException ex){
                System.out.println("Chyba: " + ex.getMessage());
                Alert alert = new Alert(AlertType.ERROR, "Osobu se nepodařilo naparsovat!");
                alert.showAndWait();
                return null;
            }
        }
    });
            

    dialog.getDialogPane().setContent(grid);
}
/** Metoda dělá v podstatě to, co za nás jinak dělá JavaFX Scene Builder. Tento přístup se u JavaFX také používá, čili když si ho teď popíšeme, budete schopni porozumět dalším JavaFX aplikacím, které FXML z nějakého důvodu nevyužívají.
  * Na začátku si vytvoříme nové potvrzovací tlačítko s vlastním textem. Toto tlačítko spolu s tlačítkem Cancel přidáme do dialogu.
  * Dále si vytvoříme GridPane, tabulkový panel, kterému nastavíme zarovnání a okraje.
  * Nyní si vytvoříme komponenty, které naskládáme do buněk GridPane. Uvedeme vždy komponentu, sloupec a řádek, do kterého ji chceme vložit.
  * Další řádky tvoří obsluhu události nastavení výsledku dialogu. Implementaci logiky si necháme na další lekci. Zatím budeme jednoduše vracet null.
  * Naplněný GridPane a tlačítko přidáme dialogu pomocí metody dialog.getDialogPane().setContent(grid).
  * Abychom z té práce vůbec něco viděli, upravíme obslužnou metodu přidávacího tlačítka do následující podoby: 
  */ 
    public void handlePridatButtonAction(ActionEvent event) {
    Dialog<Osoba> dialog = new Dialog<>();
    dialog.setTitle("Nová osoba");
    dialog.setWidth(350);
    dialog.setHeight(250);

    vytvorObsahDialogu(dialog);
    final Optional<Osoba> vysledek = dialog.showAndWait();
    if(vysledek.isPresent()){
        Osoba osoba = vysledek.get();
        spravceOsob.pridej(osoba);
        }
    } 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        dnesLabel.setText(Datum.zformatuj(Calendar.getInstance()));
        osobyListView.setItems(spravceOsob.getOsoby());
        if(!spravceOsob.getOsoby().isEmpty())
            osobyListView.getSelectionModel().select(0);
    }    
    
}
