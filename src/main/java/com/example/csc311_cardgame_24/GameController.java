package com.example.csc311_cardgame_24;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
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
    public int hintCount = 0;

    @FXML
    private Button refreshBtn;

    @FXML
    private Button verifyBtn;

    @FXML
    private TextField expressionTxt;

    @FXML
    private Label label1;

    private randomCard r1 = new randomCard();
    private randomCard r2 = new randomCard();
    private randomCard r3 = new randomCard();
    private randomCard r4 = new randomCard();

    private CardValue cardVal = new CardValue();

    int card1Value;
    int card2Value;
    int card3Value;
    int card4Value;



    @FXML
    void hintBtnClick(ActionEvent event) {
        hintCount++;

        if (hintCount == 3) {
            label1.setText("Try Harder");
        }if (hintCount >= 5) {
            label1.setText("Shame");
        }

    }


    @FXML
    void refreshBtnClick(ActionEvent event) {
        String cardUrl1 = r1.getRandomCard();String cardUrl2 = r2.getRandomCard();
        String cardUrl3 = r3.getRandomCard();String cardUrl4 = r4.getRandomCard();

        Image card1 = new Image(String.valueOf(getClass().getResource("/com/example/csc311_cardgame_24/Images/" + cardUrl1)));
        Image card2 = new Image(String.valueOf(getClass().getResource("/com/example/csc311_cardgame_24/Images/" + cardUrl2)));
        Image card3 = new Image(String.valueOf(getClass().getResource("/com/example/csc311_cardgame_24/Images/" + cardUrl3)));
        Image card4 = new Image(String.valueOf(getClass().getResource("/com/example/csc311_cardgame_24/Images/" + cardUrl4)));

        cardImage1.setImage(card1);cardImage2.setImage(card2);
        cardImage3.setImage(card3);cardImage4.setImage(card4);

        card1Value = cardVal.getCardValue(cardUrl1);card2Value = cardVal.getCardValue(cardUrl2);
        card3Value = cardVal.getCardValue(cardUrl3);card4Value = cardVal.getCardValue(cardUrl4);


        System.out.println(cardUrl1 + "\n" + cardUrl2 + "\n" + cardUrl3 + "\n" + cardUrl4);
        System.out.println(card1Value + "\n" + card2Value + "\n" + card3Value + "\n" + card4Value);


    }

    @FXML
    void verifyBtnClick(ActionEvent event) {
        String exp = expressionTxt.getText();

        String card1StringValue = Integer.toString(card1Value);
        String card2StringValue = Integer.toString(card2Value);
        String card3StringValue = Integer.toString(card3Value);
        String card4StringValue = Integer.toString(card4Value);


        int count = 0;
        for(int i = 0; i <= exp.length()-1; i++) {
            if(exp.charAt(i) == (card1StringValue.charAt(0)) ||
               exp.charAt(i) == (card2StringValue.charAt(0)) ||
               exp.charAt(i) == (card3StringValue.charAt(0)) ||
               exp.charAt(i) == ( card4StringValue.charAt(0))) {
                count++;
            }
        }

        if(count == 4) {

            Solution s1 = new Solution();
            boolean correct = s1.checkSolution(expressionTxt.getText());
            if (correct) {
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }
        }else{
            System.out.println("Your expression must contain all the cards");
        }




    }
}


