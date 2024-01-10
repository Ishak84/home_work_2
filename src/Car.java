public abstract class Car implements Printable{
    private String price;
    private String countryMade;

    public String getPrice() {
        return price;
    }

    public String getCountryMade() {
        return countryMade;
    }

    public Car(String price, String countryMade) {
        this.price = price;
        this.countryMade = countryMade;
    }
}
