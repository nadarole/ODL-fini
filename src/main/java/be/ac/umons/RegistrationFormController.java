package be.ac.umons;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Window;

public class RegistrationFormController {

    private App app;

    @FXML
    private TextField IDUser;



    @FXML
    private Button submitButton1;

    @FXML
    private Button submitButton2;
   /* @FXML
    private TableColumn<Task,String> date;
    @FXML
    private TableColumn<Task,String> tache;
    @FXML
    private TableView<Task> table1;*/


    @FXML
    protected void handleSubmitButton1(ActionEvent event) {
        Window owner = submitButton1.getScene().getWindow();

        if (IDUser.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error", "ID User is required");
            return;
        }
        else{
            App ex = new App();
            ex.showPage("page d'acceuil","Accueil.fxml");
        }


        //AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, owner, "Registration Successful", "Thanks for your registration.");
    }
    @FXML
    protected void handleSubmitButton2(ActionEvent event) {
        Window owner = submitButton2.getScene().getWindow();
        App ex = new App();
        ex.showPage("Agenda","Agenda.fxml");
    }
   /* @FXML
    private void initialize() {
        System.out.println("eee");
        tache.setCellValueFactory(cellData -> cellData.getValue().taskNameProperty());
    }
    public void setApp(App app) {
        this.app = app;

        // Add observable list data to the table
        table1.setItems(app.getTaskData());
    }*/
    }

