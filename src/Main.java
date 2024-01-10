public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            cars[0] = createObject("KIA");
            cars[1] = createObject("BMW");
            cars[2] = createObject("MERS");
            cars[i].print();
        }
    }

    public static Car createObject(String className){
        Car car = null;
        switch (className){
            case "BMW":
                car = new BMW("10000$", "GERMANY", "M5", "BLACK");
                break;
            case "KIA":
                car = new KIA("20000$", "KOREA", "AUTO", "NO");
                break;
            case "MERS":
                car = new MERS("30000$", "GERMANY", "2005", "IDEAL");
        }
        return car;
    }
}