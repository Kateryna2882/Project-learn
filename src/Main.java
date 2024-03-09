import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Створення LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Додавання елементів у LinkedList
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);

        // Виведення елементів у LinkedList
        System.out.println("Елементи у LinkedList:");
        for (Integer element : linkedList) {
            System.out.println(element);
        }

        // Розрахунок суми елементів у LinkedList
        int sum = 0;
        for (Integer element : linkedList) {
            sum += element;
        }

        // Виведення суми
        System.out.println("Сума елементів: " + sum);
    }
}
