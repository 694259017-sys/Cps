void main() {
    IO.println("Enter Your Ages : ");
    int age = Integer.parseInt(IO.readln());
    String wage;
    if ((age <= 0) || (age >= 110)) {
        wage = "Error Age";
    } else if (age > 59) {
        wage = "Senior";
    } else if (age > 19) {
        wage = "Adult";
    } else if (age > 9) {
        wage = "Teen Ager";
    } else {
        wage = "Child";
    }
    IO.println("Your Age Type is : " + wage);
}
