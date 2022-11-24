/*
Новогодний подарок.
Определить иерархию конфет и прочих сладостей.
Создать несколько объектов-конфет.
Собрать детский подарок с определением его веса.
Провести сортировку конфет в подарке на основе одного из параметров.
Найти конфету в подарке, соответствующую заданному диапазону содержания сахара.
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Это ваш новогодний подарок!");
        System.out.println("Открыть (введите y/n) ?");
        String n = sc.next();

        //Шаблон для поиска символа в строке
        while (!Pattern.matches("[yn]", n)) {
            System.out.println("Неверный ввод!");
            n = sc.next();
        }
        if (n.equals("n")) {
            System.out.println(":C");
            System.exit(0);
        }

        ArrayList<Candy> present = new ArrayList<>();
        present.add(new Chocolate(100.0, 48));
        present.add(new Lollipop(100.6, 66));
        present.add(new Lollipop(50.0, 30));
        present.add(new Chocolate(44.5, 20));
        present.add(new Lollipop(75.0, 36));
        present.add(new Dragee(200., 120));

        //Сортировка по весу: конфеты с большим весом находятся на дне коробки
        present.sort(new CandyWeightComparator());
        for (Candy e : present) {
            System.out.println(e);
        }

        // Подсчет общего веса всех конфет
        double presentWeight = 0;
        for (Candy value : present) {
            presentWeight += value.getWeight();
        }
        System.out.printf("Общий вес подарка: %.2f грамм", presentWeight);
        System.out.println("\n");

        // Поиск конфет по содержанию сахара в заданном диапазоне
        System.out.println("Поиск конфет по содержанию сахара в заданном диапазоне.");
        System.out.println("Укажите нижнюю границу диапазона (целое число!)");
        while (!sc.hasNextInt()) {
            System.out.println("Введено не целое число!");
            sc.nextLine();
        }
        int lowerLimit = sc.nextInt();

        System.out.println("Укажите верхнюю границу диапазона (целое число!)");
        while (!sc.hasNextInt()) {
            System.out.println("Введено не целое число!");
            sc.nextLine();
        }
        int upperLimit = sc.nextInt();
        System.out.println();

        // Вывод конфет с содержанием сахара в указанном диапозоне
        System.out.println("Конфеты с содержанием сахара от " + lowerLimit + " до " + upperLimit + ":");
        for (Candy e : present) {
            if (e.getSugarContent() >= lowerLimit && e.getSugarContent() <= upperLimit) {
                System.out.println(e);
            }
        }
    }
}