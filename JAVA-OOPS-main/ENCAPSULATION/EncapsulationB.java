/*Create a class called BankAccount with private properties accountNumber and balance.
Implement public methods to deposit, withdraw, and check the account balance.
Use encapsulation to ensure that the account number and balance are
only accessible and modifiable through the defined methods. */
import java.util.Scanner;
class BankAccount{
    Scanner s=new Scanner(System.in);
    private int accNo;
    private int bal;

    public int getaccNo(){
        return accNo;
    }

    public void setaccNo(int accNo){
        this.accNo=accNo;
    }

    public int getbal(){
        return bal;
    }

    public void setbal(int bal){
        this.bal=bal;
    }

    void deposit(){
        System.out.println("ENTER AMOUNT TO DEPOSIT");
        int dep=s.nextInt();
        int depBal=dep+bal;
        System.out.println("BALANCE AMOUNT AFTER DEPOSIT"+depBal);
    }

    void withdraw(){
         System.out.println("ENTER AMOUNT TO WITHDRAW");
         int wit=s.nextInt();
         int witBal=bal-wit;
         System.out.println("BALANCE AMOUNT AFTER WITHDRAW "+witBal);

    }
    void bal(){
        System.out.println("BALANCE IS : "+bal);

    }

}
class EncapsulationB{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        BankAccount a=new BankAccount();
        a.setaccNo(990197);
        a.setbal(2500);
         System.out.println("ACCOUNT NUMBER : "+a.getaccNo());
       a.bal();
        a.deposit();
        a.withdraw();
        s.close();
    }
}
