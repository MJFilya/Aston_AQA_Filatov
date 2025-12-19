public class Product {

    private String name;
    private String productionDate;
    private String manufacturer;
    private String country;
    private double price;
    private boolean isReserved;

    public Product(String name, String productionDate, String manufacturer,
                   String country, double price, boolean isReserved) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.isReserved = isReserved;
    }

    // Метод вывода информации о товаре
    public void printInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + country);
        System.out.println("Цена: " + price);
        System.out.println("Забронирован: " + (isReserved ? "Да" : "Нет"));
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {

        Product[] productsArray = new Product[5];

        productsArray[0] = new Product(
                "Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599, true
        );

        productsArray[1] = new Product(
                "iPhone 16 Pro", "15.01.2025",
                "Apple Inc.", "USA", 6299, false
        );

        productsArray[2] = new Product(
                "Xiaomi 15", "20.12.2024",
                "Xiaomi Ltd.", "China", 3999, true
        );

        productsArray[3] = new Product(
                "Sony Xperia Z7", "05.11.2024",
                "Sony Corp.", "Japan", 4899, false
        );

        productsArray[4] = new Product(
                "Huawei Mate 60", "30.10.2024",
                "Huawei", "China", 4599, true
        );

        for (Product product : productsArray) {
            product.printInfo();
        }
    }
}

