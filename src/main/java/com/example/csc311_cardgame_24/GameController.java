package com.example.csc311_cardgame_24;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;


public class GameController {

    @FXML
    private AnchorPane card1;

    @FXML
    private AnchorPane card2;

    @FXML
    private AnchorPane card3;

    @FXML
    private AnchorPane card4;

    @FXML
    private ImageView cardImage1;

    @FXML
    private ImageView cardImage2;

    @FXML
    private ImageView cardImage3;

    @FXML
    private ImageView cardImage4;

    @FXML
    private Button hintBtn;

    @FXML
    private Button refreshBtn;

    @FXML
    private Button verifyBtn;

    private randomCard r1 = new randomCard();
    private randomCard r2 = new randomCard();
    private randomCard r3 = new randomCard();
    private randomCard r4 = new randomCard();

    private CardValue cardVal = new CardValue();



    @FXML
    void hintBtnClick(ActionEvent event) {
        System.out.println("hintBtnClick");

    }


    @FXML
    void refreshBtnClick(ActionEvent event) {
        String cardUrl = r1.getRandomCard();String cardUrl2 = r2.getRandomCard();
        String cardUrl3 = r3.getRandomCard();String cardUrl4 = r4.getRandomCard();

        int card1Value = cardVal.getCardValue(cardUrl);
        int card2Value = cardVal.getCardValue(cardUrl2);
        int card3Value = cardVal.getCardValue(cardUrl3);
        int card4Value = cardVal.getCardValue(cardUrl4);


        System.out.println(cardUrl + "\n" + cardUrl2 + "\n" + cardUrl3 + "\n" + cardUrl4);
        System.out.println(card1Value + "\n" + card2Value + "\n" + card3Value + "\n" + card4Value);


    }

    @FXML
    void verifyBtnClick(ActionEvent event) {
        System.out.println("verifyBtnClick");


    }
}


