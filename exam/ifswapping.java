void main() {
    IO.println("Enter First number : ");
    int num1 = Integer.parseInt(IO.readln());
    IO.println("Enter Second number : ");
    int num2 = Integer.parseInt(IO.readln());
    if (num2 > num1) {
        IO.println("Current -> Num1 = " + num1 + " Num2 = " + num2);
        IO.println("The second number is more than the first number ... Do nothing .. Bye bye !!!");
    } else {
    IO.println("Current -> Num1 = " + num1 + " Num2 = " + num2);
    IO.println("Swapping .................");
    int num3 = num1;
    num1 = num2;
    num2 = num3;
    IO.println("Now -> Num1 = " + num1 + " Num2 = " + num2);
}
}
