package com.example.csc311_cardgame_24;

public class CardValue {
    public int getCardValue(String cardString){
        int cardValue = -1;
        char cardChar = cardString.charAt(0);
        switch (cardChar){
            case 'a': cardValue = 1;
            break;
            case '2':cardValue = 2;
            break;
            case '3':cardValue = 3;
            break;
            case '4':cardValue = 4;
            break;
            case '5':cardValue = 5;
            break;
            case '6':cardValue = 6;
            break;
            case '7':cardValue = 7;
            break;
            case '8':cardValue = 8;
            break;
            case '9':cardValue = 9;
            break;
            case '1':cardValue = 10;
            break;
            case 'j': cardValue = 11;
            break;
            case 'q': cardValue = 12;
            break;
            case 'k': cardValue = 13;

        }return cardValue;

    }
}
