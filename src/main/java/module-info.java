module com.example.csc311_cardgame_24 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.smartcardio;
    requires exp4j;
    requires simple.openai;


    opens com.example.csc311_cardgame_24 to javafx.fxml;
    exports com.example.csc311_cardgame_24;


}
