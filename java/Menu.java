

import product.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<Product> products = new ArrayList<Product>();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        // Загрузка данных при старте
        try {
            products = Data.loadProductsFromJson();
        } catch (IOException e) {
            System.out.println("Не удалось загрузить товары");
        }

        boolean running = true;
        while (running) {
            printMenu();

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    showProducts();
                    break;
                case 3:
                    saveAndExit();
                    running = false;
                    break;
                default:
                    System.out.println("Неверный выбор");
            }
        }
    }

    private void printMenu() {
        System.out.println("\n=== МЕНЮ ===");
        System.out.println("1. Добавить товар");
        System.out.println("2. Показать товары");
        System.out.println("3. Сохранить и выйти");
        System.out.print("Выберите: ");
    }

    private void addProduct() {
        Product p = new Product();

        System.out.print("Введите ID: ");
        p.setId(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Введите название: ");
        p.setName(scanner.nextLine());

        System.out.print("Введите цену: ");
        p.setPrice(scanner.nextDouble());

        products.add(p);
        System.out.println("Товар добавлен!");
    }

    private void showProducts() {
        if (products.isEmpty()) {
            System.out.println("Товаров нет!");
            return;
        }

        System.out.println("\nСПИСОК ТОВАРОВ:");
        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            System.out.println(p.getId() + ". " + p.getName() + " - " + p.getPrice() + " руб.");
        }
    }

    private void saveAndExit() {
        try {
            Data.saveProductsToJson(products);
            Data.exportProductsToExcel(products, "products.xlsx");
        } catch (IOException e) {
            System.out.println("Ошибка сохранения: " + e.getMessage());
        }
    }
}