public class App {
    public static void main(String[] args) throws Exception {
        Automobile auto1 = new Automobile("Москвич", "412", "Розовый", "Бензин", "МКП", "1.8 литров", "Седан", 4);
        Automobile auto2 = new Automobile("Икарус", "256", "Красный", "Дизель", "МКП", "10.35 литров", "Автобус", 4);
        System.out.println(auto1);
        auto1.refueling();
        auto1.movement();
        System.out.println(auto2);
        auto2.refueling();
        auto2.movement();
    }
    
}
