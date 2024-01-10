public class KIA extends Car implements Printable {
    private String transmission;
    private String old;

    public KIA(String price, String countryMade, String transmission, String old) {
        super(price, countryMade);
        this.transmission = transmission;
        this.old = old;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getOld() {
        return old;
    }

    @Override
    public void print() {
        System.out.println("Price " + getPrice() +
                "\nCountryMade " + getCountryMade() +
                "\nold " + getOld() +
                "\ntransmission " + getTransmission());

    }
}
