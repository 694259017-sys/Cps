void main() {
    IO.println("Enter Your Point : ");
    int point = Integer.parseInt(IO.readln());
    if ((point <= 0) || (point >= 100)) {
        IO.println("You must enter a correct score, try again later.");
    } else if (point >= 80) {
        IO.println("Your grade is A");
    } else if ((point >= 70) && (point < 80)) {
        IO.println("Your grade is B");
    } else if ((point >= 60) && (point < 70)) {
        IO.println("Your grade is C");
    } else if ((point >= 50) && (point < 60)) {
        IO.println("Your grade is D");
    } else {
        IO.println("Your grade is E");
    }
}
