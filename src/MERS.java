public class MERS extends Car implements Printable {
    private String year;
    private String state;

    public MERS(String price, String countryMade, String year, String state) {
        super(price, countryMade);
        this.year = year;
        this.state = state;
    }

    public String getYear() {
        return year;
    }

    public String getState() {
        return state;
    }

    @Override
    public void print() {
        System.out.println("Price " + getPrice() +
                "\nCountryMade " + getCountryMade() +
                "\nYear " + getYear() +
                "\nState " + getState());
    }
}
