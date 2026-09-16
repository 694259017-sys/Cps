void main() {
    IO.println("Enter Your pin : ");
    int pin = Integer.parseInt(IO.readln());
    IO.println("Enter Your Balance : ");
    int balance = Integer.parseInt(IO.readln());
    IO.println("Enter Your Use Pin : ");
    int upin = Integer.parseInt(IO.readln());
    if (upin == pin) {
        IO.println("===== ATM MENU =====");
        IO.println("1. Check balance");
        IO.println("2. Withdraw money");
        IO.println("3. Deposit money");
        IO.println("4. Exit");
        IO.println("Enter Your Choice : ");
        int choice = Integer.parseInt(IO.readln());
        if (choice == 1) {
            IO.println("Your balance is " + balance + " Baht.");
        } else if (choice == 2) {
            IO.println("Enter Your Withdraw : ");
            int withdraw = Integer.parseInt(IO.readln());
            if (withdraw <= 0) {
                IO.println("The amount must be greater than 0");
            } else if (withdraw <= balance) {
                balance = balance - withdraw;
                IO.println("ยืนยันการถอน");
                IO.println("Remaining Balance " + balance + "Baht.");
            } else {
                IO.println("Insufficient funds.");
            }
        } else if (choice == 3) {
            IO.println("Enter Your Deposit : ");
            int deposit = Integer.parseInt(IO.readln());
            if (deposit < 0) {
                IO.println("The amount must be greater than 0.");
            } else {
                balance = balance + deposit;
                IO.println("ยืนยันการฝาก");
                IO.println("Remaining Balance " + balance + "Baht.");
            }
        } else if (choice == 4) {
            IO.println("Thank you for using the ATM.");
        } else {
            IO.println("Invalid Option.");
        }
    } else {
        IO.println("Incorrect PIN.");
    }
}