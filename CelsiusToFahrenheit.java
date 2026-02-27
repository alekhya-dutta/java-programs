class CelsiusToFahrenheit {

    double celsius;

    CelsiusToFahrenheit(double c) {
        celsius = c;
    }

    double convert() {
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {

        CelsiusToFahrenheit obj = new CelsiusToFahrenheit(30);

        double result = obj.convert();

        System.out.println("Celsius: " + obj.celsius);
        System.out.println("Fahrenheit: " + result);
    }
}
