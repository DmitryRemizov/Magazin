public class Tablet extends Product implements Device, Mobile {
    //Interface Segregation Principle - применяем разные интерфейсы вместо одного большого
    //Dependency Inversion Principle - разделив интерфейсы мы не зависим от их общей функциональности,
    // мы можем поменять один интерфейс на другой
    private final String name = "Планшет";
    private final int price = 5000;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void enable() {
        System.out.println("Планшет включен");
    }

    @Override
    public void carry() {
        System.out.println("Планшет взят с собой");
    }
}
