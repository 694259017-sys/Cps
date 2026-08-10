void main() {
    IO.println("Enter Price of product : ");
    int price = Integer.parseInt(IO.readln());
    IO.println("Enter Quantity of Product : ");
    int quantity = Integer.parseInt(IO.readln());
    int totalprice = price*quantity;
    if (quantity > 10) {
        IO.println("You Have Discount 10%");
        totalprice = price * quantity*90/100;
        IO.println("This your Total Price "+ totalprice);
    } else {
        totalprice = price * quantity;
        IO.println("This your Total Price "+ totalprice);
}
}