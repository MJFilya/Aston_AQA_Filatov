public class Park {

    private String parkName;

    public Park(String parkName) {
        this.parkName = parkName;
    }

    class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printAttractionInfo() {
            System.out.println("Парк: " + parkName);
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price + " руб.");
            System.out.println("----------------------------");
        }
    }

    public static void main(String[] args) {
        Park park = new Park("Central Park");

        Park.Attraction attraction1 = park.new Attraction(
                "Американские горки", "10:00 - 22:00", 1200
        );

        Park.Attraction attraction2 = park.new Attraction(
                "Колесо обозрения", "09:00 - 21:00", 800
        );

        Park.Attraction attraction3 = park.new Attraction(
                "Дом ужасов", "12:00 - 23:00", 900
        );

        attraction1.printAttractionInfo();
        attraction2.printAttractionInfo();
        attraction3.printAttractionInfo();
    }
}
