/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author SMART
 */
public class sinup {

    String USER_NAME;
    String NAME;
    int PASSWORD,CARD,PASSWORD_CARD;

    public sinup(String USER_NAME, String NAME, int PASSWORD, int CARD, int PASSWORD_CARD) {
        this.USER_NAME = USER_NAME;
        this.NAME = NAME;
        this.PASSWORD = PASSWORD;
        this.CARD = CARD;
        this.PASSWORD_CARD = PASSWORD_CARD;
    }

    public String getUSER_NAME() {
        return USER_NAME;
    }

    public void setUSER_NAME(String USER_NAME) {
        this.USER_NAME = USER_NAME;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public int getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(int PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public int getCARD() {
        return CARD;
    }

    public void setCARD(int CARD) {
        this.CARD = CARD;
    }

    public int getPASSWORD_CARD() {
        return PASSWORD_CARD;
    }

    public void setPASSWORD_CARD(int PASSWORD_CARD) {
        this.PASSWORD_CARD = PASSWORD_CARD;
    }
    

}
