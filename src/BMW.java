public class BMW extends Car implements Printable {
    private String name;
    private String color;

    public BMW(String price, String countryMade, String name, String color) {
        super(price, countryMade);
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void print() {
        System.out.println("Price " + getPrice() +
                "\nCountryMade " + getCountryMade() +
                "\ncolor " + getColor() +
                "\nname " + getName());

    }
}
