class MaxOfThree {

    int a;
    int b;
    int c;

    void setValues(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    void findMax() {
        if (a >= b && a >= c)
            System.out.println("Maximum is: " + a);
        else if (b >= a && b >= c)
            System.out.println("Maximum is: " + b);
        else
            System.out.println("Maximum is: " + c);
    }

    public static void main(String[] args) {

        MaxOfThree obj = new MaxOfThree();

        obj.setValues(10, 25, 15);

        obj.findMax();
    }
}
