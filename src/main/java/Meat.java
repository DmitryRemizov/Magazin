public class Meat extends Product implements Food {
    private final String name = "Мясо";
    private final int price = 500;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void eat() {
        System.out.println("Мясо съедено");
    }
}