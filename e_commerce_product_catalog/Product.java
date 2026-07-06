package e_commerce_product_catalog;

abstract class Product {
    private String name;
    private double price;
    private int stock;

    //constructor "Product"
    public Product(String name, double price, int stock) {
        this.name = name;

        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price must be positive");
        }

        this.stock = stock;
    }


    //getter
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getStock() {
        return stock;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    //abstact method "calculateDiscount"
    abstract public double calculateDiscount(double price);

    public double finalPrice() {
        return (getPrice() - calculateDiscount(price));
    }
}

class ElectronicsProduct extends Product {

    public ElectronicsProduct(String name, double price, int stock) {
        super(name, price, stock);
    }

    @Override
    public double calculateDiscount(double price) {
        return (getPrice() * 10/100);
    }
    
}

class ClothingProduct extends Product {

    public ClothingProduct(String name, double price, int stock) {
        super(name, price, stock);
    }

    @Override
    public double calculateDiscount(double price) {
        return (getPrice() * 20/100);
    }
    
}

class FoodProduct extends Product {
    private int expiryDate;

    public FoodProduct(String name, double price, int stock, int expiryDate) {
        super(name, price, stock);
        this.expiryDate = expiryDate;
    }

    public int getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(int expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public double calculateDiscount(double price) {
        return (getPrice() * 5/100);
    }
}

class Main {
    public static void main(String[] args) {
        Product[] products = {
            new ElectronicsProduct("Mixer", 5000, 2),
            new ClothingProduct("T-shirts", 1600, 10),
            new FoodProduct("Pizza", 100, 1, 02/02/2003)
        };

        for(Product p : products) {
            System.out.println("Product: " + p.getName());
            System.out.println("Price: " + p.getPrice());
            System.out.println("Discount: " + p.calculateDiscount(2000));
            System.out.println("Final Price: " + p.finalPrice());
            System.out.println("----------------");
        }
    }
}
