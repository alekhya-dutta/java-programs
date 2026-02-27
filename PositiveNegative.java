class PositiveNegative {

    int number;

    void setNumber(int n) {
        number = n;
    }

    void check() {
        if (number > 0)
            System.out.println(number + " is Positive");
        else if (number < 0)
            System.out.println(number + " is Negative");
        else
            System.out.println("Number is Zero");
    }

    public static void main(String[] args) {

        PositiveNegative obj = new PositiveNegative();

        obj.setNumber(-5);

        obj.check();
    }
}
