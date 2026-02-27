class OddEven {

    int number;

    void setNumber(int n) {
        number = n;
    }

    void check() {
        if (number % 2 == 0)
            System.out.println(number + " is Even");
        else
            System.out.println(number + " is Odd");
    }

    public static void main(String[] args) {

        OddEven obj = new OddEven();

        obj.setNumber(7);

        obj.check();
    }
}
