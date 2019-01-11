//Class: CS 5000/01
//Term:  Fall 2018
//Name:  Jiwon Her
//Instructor: Dr. Haddad
//Assignment: 8
//IDE:  jGrasp

import java.text.NumberFormat;
import java.util.*;
public class Account {
   private int id;
   private double balance;
   private static double annualInterestRate = 0.0;
   private Date dateCreated;
   Account() {
      this.id = 0;
      this.balance = 0.0;
      this.dateCreated = new Date();
   }
   Account(int id, double balance) {
      this.id = id;
      this.balance = balance;
      this.dateCreated = new Date();
   }
   public int getid() {
      return this.id;
   }
   public void setid(int id) {
      this.id = id;
   }
   public double getbalance() {
      return this.balance;
   }
   public void setbalance(double balance) {
      this.balance = balance;
   }
   public double getannualInterestRate() {
      return Account.annualInterestRate;
   }
   public void setannualInterestRate(double annualInterestRate) {
      Account.annualInterestRate = annualInterestRate / 100.0;
   }
   public Date getdateCreated() {
      return this.dateCreated;
   }
   public String getMonthlyInterestRate() {
      NumberFormat formatter = NumberFormat.getPercentInstance();
      formatter.setMinimumFractionDigits(2);
      return formatter.format((annualInterestRate / 12)); // % format
   }
   public String getMonthlyInterest() {
      NumberFormat formatter = NumberFormat.getCurrencyInstance();
      return formatter.format((this.balance * (annualInterestRate / 12))); // must format as currency($)!!
   }
   public void withdraw(double amount) {
      this.balance = balance - amount;
   }
   public void deposit(double amount) {
      this.balance = balance + amount;
   }
   public String toString() {
      NumberFormat formatterCurrency = NumberFormat.getCurrencyInstance();
      NumberFormat formatterPercent = NumberFormat.getPercentInstance();
      formatterPercent.setMinimumFractionDigits(2);
      return ("Account ID:\t\t\t\t" + this.id + "\nAccount Balance:\t\t" + formatterCurrency.format(this.balance)
          + "\nInterest Rate:\t\t\t" + formatterPercent.format(this.getannualInterestRate())
          + "\nDate Opened:\t\t\t" + dateCreated);
   }
}

