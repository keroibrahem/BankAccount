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
class Transactions {
       private String Date;
    private String Description;
     private String Type;
    private double Amount;
    private double Balance;

    public  Transactions(String Date, String Description, String Type,double Amount, double Balance) {
        this.Date = Date;
        this.Description = Description;
        this.Type= Type;
        this. Amount=  Amount;
        this.Balance= Balance;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        this.Type = Type;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        this.Amount = amount;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

  
    
}

    
