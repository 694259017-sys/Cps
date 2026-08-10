void main() { 
    IO.println("Enter Price : ");
    int price = Integer.parseInt(IO.readln());
    IO.println("Enter Quantity : ");
    int quantity = Integer.parseInt(IO.readln());
    int totalprice = price*quantity;
    if (totalprice > 1000) {
        IO.println("Not enough money!!!");
    } else {
    IO.println("This your change");
    int change = 1000 - totalprice;
    IO.println("Your change = " + change);
    int b500 = change / 500;
    change = change % 500;
    int b100 = change / 100;
    change = change % 100;
    int b50 = change / 50;
    change = change % 50;
    int b20 = change / 20;
    change = change % 20;
    int b10 = change / 10;
    change = change % 10;
    int b5 = change / 5;
    change = change % 5;
    int b2 = change / 2;
    change = change % 2;
    IO.println("Five-hundred note = " + b500);
    IO.println("One-hundred note = " + b100);
    IO.println("Fifty note = " + b50);
    IO.println("Twenty note = " + b20);
    IO.println("Ten coin = " + b10);
    IO.println("Five coin = " + b5);
    IO.println("Two coin = " + b2);
    IO.println("One coin = " + change);
}
}