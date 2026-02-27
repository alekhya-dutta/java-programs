class AddTwoNumbers {
    int a;
    int b;

    void add() {
        int sum = a + b;
        System.out.println("Sum is: " + sum);
    }

    public static void main(String[] args) {
        AddTwoNumbers obj = new AddTwoNumbers();
        obj.a = 10;
        obj.b = 20;
        obj.add();
    }
}
