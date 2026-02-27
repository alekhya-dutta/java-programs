class SwapNumbers {

    int number;

    SwapNumbers(int n) {
        number = n;
    }

    void display() {
        System.out.println(number);
    }

    public static void main(String[] args) {

        SwapNumbers obj1 = new SwapNumbers(10);
        SwapNumbers obj2 = new SwapNumbers(20);

        System.out.println("Before Swapping:");
        obj1.display();
        obj2.display();

        int temp = obj1.number;
        obj1.number = obj2.number;
        obj2.number = temp;

        System.out.println("After Swapping:");
        obj1.display();
        obj2.display();
    }
}
