/* Menu
1. convert 
1.1 choose currency 1 
1.2 choose currency 2 
1.3 print the outcome (calculator)
-------------------------------------------
2. view from egp to usd
3. view from egp to eur
5. view from usd to egp
6. view from usd to eur
7. view from eur to egp
8. view from eur to usd
-------------------------------------------
9. Exit (break)
*/  

/*
print the menu
take input from user
make if conditions or switch
    excute the code of chossen menu 
*/


import java.util.Scanner;

public class Currency_Convertor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Account Balance in EGP:");
        float Account_Balance_EGP = scanner.nextFloat();
        System.out.println("Enter Account Balance in USD:");
        float Account_Balance_USD = scanner.nextFloat();
        System.out.println("Enter Account Balance in EUR:");
        float Account_Balance_EUR = scanner.nextFloat();

        int choice;
        do{
            System.out.println("");
            System.out.println("----Menu----");
            System.out.println("1. Display Account Balance");
            System.out.println("2. Convert currency");
            System.out.println("3. Display value of EGP to USD");
            System.out.println("4. Display value of EGP to EUR");
            System.out.println("5. Display value of USD to EGP");
            System.out.println("6. Display value of USD to EUR");
            System.out.println("7. Display value of EUR to EGP");
            System.out.println("8. Display value of EUR to USD");
            System.out.println("9. --Exit--");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // consume the leftover newline
            
            switch(choice) {
                case 1:
                    System.out.println("Account Balance in EGP:" + Account_Balance_EGP + "\n" +
                    "Account Balance in USD:" + Account_Balance_USD + "\n" +
                    "Account Balance in EUR:" + Account_Balance_EUR);
                    break;
                case 2:
                    System.out.println("Choose currency 1 (EGP, USD, EUR):");
                    String currency_1 = scanner.nextLine();
                    System.out.println("Choose currency 2 (EGP, USD, EUR):");
                    String currency_2 = scanner.nextLine();

                    /*
    --------------------------------------------------------------------------------------------------------------------
                    */

                    if (currency_1.equals("EGP") && currency_2.equals("USD")){
                        System.out.println("Enter the ammount in EGP to change:");
                        float amount_to_change_EGP = scanner.nextFloat();
                        if (Account_Balance_EGP < amount_to_change_EGP){
                            System.out.println("Amount to change not avilabe, current balance: " + Account_Balance_EGP);
                            break;
                        }
                        System.out.println("Result: " + (amount_to_change_EGP*0.021));
                        Account_Balance_EGP -= (amount_to_change_EGP);
                        Account_Balance_USD += (amount_to_change_EGP*0.021);
                        System.out.println("Account Balance in EGP:" + Account_Balance_EGP);
                        System.out.println("Account Balance in USD:" + Account_Balance_USD);
                    }
                    //------------------------------------------------------------------------------

                    else if (currency_1.equals("EGP") && currency_2.equals("EUR")){
                        System.out.println("Enter the ammount in EGP to change:");
                        float amount_to_change_EGP = scanner.nextFloat();
                        if (Account_Balance_EGP < amount_to_change_EGP){
                            System.out.println("Amount to change not avilabe, current balance: " + Account_Balance_EGP);
                            break;
                        }
                        System.out.println("Result: " + (amount_to_change_EGP*0.018));
                        Account_Balance_EGP -= (amount_to_change_EGP);
                        Account_Balance_EUR += (amount_to_change_EGP*0.018);
                        System.out.println("Account Balance in EGP:" + Account_Balance_EGP);
                        System.out.println("Account Balance in USD:" + Account_Balance_USD);
                    }
                    //------------------------------------------------------------------------------

                    else if (currency_1.equals("EUR") && currency_2.equals("USD")){
                        System.out.println("Enter the ammount in EUR to change:");
                        float amount_to_change_EUR = scanner.nextFloat();
                        if (Account_Balance_EUR < amount_to_change_EUR){
                            System.out.println("Amount to change not avilabe, current balance: " + Account_Balance_EUR);
                            break;
                        }
                        System.out.println("Result: " + (amount_to_change_EUR*1.18));
                        Account_Balance_EUR -= (amount_to_change_EUR);
                        Account_Balance_USD += (amount_to_change_EUR*1.18);
                        System.out.println("Account Balance in EUR:" + Account_Balance_EUR);
                        System.out.println("Account Balance in USD:" + Account_Balance_USD);
                    }
                    //------------------------------------------------------------------------------

                    else if (currency_1.equals("EUR") && currency_2.equals("EGP")){
                        System.out.println("Enter the ammount in EUR to change:");
                        float amount_to_change_EUR = scanner.nextFloat();
                        if (Account_Balance_EUR < amount_to_change_EUR){
                            System.out.println("Amount to change not avilabe, current balance: " + Account_Balance_EUR);
                            break;
                        }
                        System.out.println("Result: " + (amount_to_change_EUR*56.29));
                        Account_Balance_EUR -= (amount_to_change_EUR);
                        Account_Balance_EGP += (amount_to_change_EUR*56.29);
                        System.out.println("Account Balance in EUR:" + Account_Balance_EUR);
                        System.out.println("Account Balance in EGP:" + Account_Balance_EGP);
                    }
                    //------------------------------------------------------------------------------

                    else if (currency_1.equals("USD") && currency_2.equals("EUR")){
                        System.out.println("Enter the ammount in USD to change:");
                        float amount_to_change_USD = scanner.nextFloat();
                        if (Account_Balance_USD < amount_to_change_USD){
                            System.out.println("Amount to change not avilabe, current balance: " + Account_Balance_USD);
                            break;
                        }
                        System.out.println("Result: " + (amount_to_change_USD*0.85));
                        Account_Balance_USD -= (amount_to_change_USD);
                        Account_Balance_EUR += (amount_to_change_USD*0.85);
                        System.out.println("Account Balance in USD:" + Account_Balance_USD);
                        System.out.println("Account Balance in EUR:" + Account_Balance_EUR);
                    }
                    //------------------------------------------------------------------------------

                    else {
                        System.out.println("Enter the ammount in USD to change:");
                        float amount_to_change_USD = scanner.nextFloat();
                        if (Account_Balance_USD < amount_to_change_USD){
                            System.out.println("Amount to change not avilabe, current balance: " + Account_Balance_USD);
                            break;
                        }
                        System.out.println("Result: " + (amount_to_change_USD*47.79)); // USD TO EGP
                        Account_Balance_USD -= (amount_to_change_USD);
                        Account_Balance_EGP += (amount_to_change_USD*47.79);
                        System.out.println("Account Balance in USD:" + Account_Balance_USD);
                        System.out.println("Account Balance in EGP:" + Account_Balance_EGP);
                    }
                    break;
                case 3:
                    System.out.println("1 EGP = 0.021 USD");
                    break;
                case 4:
                    System.out.println("1 EGP = 0.018 EUR");
                    break;
                case 5:
                    System.out.println("1 USD = 47.79 EGP");
                    break;
                case 6:
                    System.out.println("1 USD = 0.85 EUR");
                    break;
                case 7:
                    System.out.println("1 EUR = 56.29 EGP");
                    break;
                case 8:
                    System.out.println("1 EUR = 1.18 USD");
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Please enter valid number");
            }
        } while (choice != 9);

        scanner.close();
    }
}
