public interface Product {
//    Шаблон Factory Method (Фабричний метод):
//Шаблон Factory Method використовується для створення об'єктів без вказівки конкретного класу,
// який буде створюватись. Замість цього, він визначає інтерфейс для створення об'єктів,
// а конкретні класи відкладають реалізацію цього інтерфейсу до підкласів.
// У Java цей шаблон часто використовується
// для створення об'єктів різних типів на основі певного умовного оператора або параметра.
    void doSomething();
}

public class ConcreteProductA implements Product {
    @Override
    public void doSomething() {
        System.out.println("Doing something in ConcreteProductA");
    }
}

public class ConcreteProductB implements Product {
    @Override
    public void doSomething() {
        System.out.println("Doing something in ConcreteProductB");
    }
}

public interface ProductFactory {
    Product createProduct();
}

public class ConcreteProductAFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}

public class ConcreteProductBFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
