void main() {
    IO.println("Enter Your Ages : ");
    int age = Integer.parseInt(IO.readln());
    IO.println("Enter Your Gender F or M : ");
    String gender = (IO.readln());
    String wage;
    if ((age > 15) && (gender.equals("F"))) {
        wage = "Woman";
    } else if ((age > 15) && (gender.equals("M"))) {
        wage = "Man";
    } else if ((age <= 15) && (gender.equals("F"))) {
        wage = "Girl";
    } else {
        wage = "Boy";
    }
    IO.println("Your Type : " + wage);
}