void main() {
    IO.println("Choose Product Type : ");
    IO.println("1. Consumer Goods (Vat 7%)");
    IO.println("2. Luxury Goods (Vat 10%)");
    IO.println("3. Tax-exempt Goods (Vat 0%)");
    IO.println("");
    IO.println("Enter Choice : ");
    int choice = Integer.parseInt(IO.readln());
    if (choice == 1) {
        IO.println("You Select Consumer Goods.");
        IO.println("Enter Unit Price : ");
        int unitPrice = Integer.parseInt(IO.readln());
        IO.println("Enter Quantity : ");
        int quantity = Integer.parseInt(IO.readln());
        int totalProductPrice = unitPrice * quantity;
        IO.println("Total Product Price = " + totalProductPrice);
        double vat = (7.0 / 100) * totalProductPrice;
        IO.println("Vat amount : " + vat);
        double netAmountToPay = totalProductPrice + vat;
        IO.println("Net Amount To Pay : " + netAmountToPay + "baht");
    } else if (choice == 2) {
        IO.println("You Select Luxury Goods.");
        IO.println("Enter Unit Price : ");
        int unitPrice = Integer.parseInt(IO.readln());
        IO.println("Enter Quantity : ");
        int quantity = Integer.parseInt(IO.readln());
        int totalProductPrice = unitPrice * quantity;
        IO.println("Total Product Price = " + totalProductPrice);
        double vat = (10.0 / 100) * totalProductPrice;
        IO.println("Vat amount :" + vat);
        double netAmountToPay = totalProductPrice + vat;
        IO.println("Net Amount To Pay :  " + netAmountToPay + "baht");
    } else if (choice == 3) {
        IO.println("You Select Tax-Empty Goods.");
        IO.println("Enter Unit Price : ");
        int unitPrice = Integer.parseInt(IO.readln());
        IO.println("Enter Quantity : ");
        int quantity = Integer.parseInt(IO.readln());
        int totalProductPrice = unitPrice * quantity;
        IO.println("Total Product Price = " + totalProductPrice);
        int vat = 0;
        IO.println("Vat amount : " + vat);
        int netAmountToPay = totalProductPrice + vat;
        IO.println("Net Amount To Pay : " + netAmountToPay + "baht");
    } else {
        IO.println("Invalid Number...");
        IO.println("Plese Select 1-3");
    }
}