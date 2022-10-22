public class Customer {
    String cnic,name;
    double balance;
    int pin;
    String accountNo;
    String card;
    double amount;
    

    public Customer(String cnic, String name, double balance, int pin, String accountNo, String card){
        this.cnic = cnic;
        this.name = name;
        this.balance = balance;
        this.pin = pin;
        this.accountNo = accountNo;
        this.card = card;
    }
    
    public boolean withraw (double amount)
    {
        if (this.balance-amount>=0)
        {
            this.balance-=amount;
            return true;
        }
             return false;
    } 
    
    public void deposit (double amount)
    {
        this.balance+= amount;
    }
    
    public String getcnic(){
        return cnic;
    }
    
    public String getName(){
        return name;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public int getPin(){
        return pin;
    }
    
    public String getAccountNo(){
        return accountNo;
    }
    
    public String getCard(){
        return card;
    }
    
    @Override
    public String toString (){
        return cnic+";"+name+";"+balance+";"+pin+";"+accountNo+";"+card;
    }
}
