/*package 1monthplan.Week1;
*/
class BankAccount{
    private int AccountNumber = 898;
    private String name = "Anshika";

    public int getAccountNumber(){
        return AccountNumber;
    }
    public String getName(){
        return name;
    }


}

public class BankAccount_encap {
   public static void main(String[] args) {
       BankAccount obj = new BankAccount();
       System.out.println("Employee name: "+obj.getName()+" "+"and the account number is: "+obj.getAccountNumber());
   }
}
