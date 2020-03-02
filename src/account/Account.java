/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 * date: March 2nd
 * @author Rubal Singh
 */
public class Account {

    
        private double initialbalance = 50;
        /**
         * new interest rate
         * interest at a rate of 3% after one month, it is calculated
         */
        private double interestRate= 6.25;
        private String user;
 
     /**constructor that takes the initial balance
      * @param initialBalance 
      */
        public Account(double initialBalance,String givenUser)
        {
            initialbalance=initialBalance;
            user=givenUser;
            //Note that the initial balance must be greater than 50.       
        }

     /**The method for depositing amount and 
      * updating balance*/
        public void credit(double amount)
        {
           initialbalance=getBalance()+amount;
        }

     /**The method for debit(withdrawing amount) and 
      * updating balance */
        public void debit(double amount)
        {
          initialbalance=getBalance()-amount;

        }
        
     /**The getter for the balance
      * it has added new conditions
     * @return the balance
     */
        public double getBalance() 
        {
        if (initialbalance>=50){
            System.out.println("account was created");
        }
        else{
            System.out.println("account was not created");
        }
            return initialbalance;
        
        }

    /**The getter for InterestRate
     * @return the interestRate
     */
        public double getInterestRate() 
        {
            return interestRate;
        }

    /**user is the read only field
     * @return the user
     */
    public String getUser() {
        return user;
    }
   /**
    * 
    * return balance after applying interest rate
    * @return 
    */ 
    public double getBalanceAfterInterest(){
        return initialbalance * interestRate ;
    }
    
    
}//class end
