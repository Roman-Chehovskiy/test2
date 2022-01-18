import java.util.Arrays;
import java.util.Scanner;

public class Loader {

    public static String []sklad = new String[12];
    public static String tovarName;

    public static void main(String[] args) {
       for (int i = 0; i < sklad.length; i++) {
           sklad[i] = "";
       }
       int nomberOperation;
       Scanner vvodTovarName = new Scanner(System.in);
       while (true) {
           System.out.println("Выберите операцию и введите ее номер");
           System.out.println("1. Добавить товар");
           System.out.println("2. Проверить наличие товара");
           System.out.println("3. Удалить товар");
           System.out.println("4. Выйти из программы");
           nomberOperation = vvodTovarName.nextInt();
           if (nomberOperation >= 1 && nomberOperation <= 4) {
               System.out.println("Введите название товара");
               tovarName = vvodTovarName.nextLine();
               provercaNomberOperation(nomberOperation);
           } else System.out.println("неверно введена операция");
       }
    }

    public static void provercaNomberOperation(int nomer) {
        switch (nomer) {
            case 1:
                addTovar(sklad, tovarName);
                break;
            case 2:
                chekTovar(sklad, tovarName);
                break;
            case 3:
                deliteTovar(sklad, tovarName);
                break;
            case 4:
                System.exit(0);
        }
    }

    public static void addTovar(String []scladTovarov, String name) {
        if (chekTovar(scladTovarov, name) == true) System.out.println("Такой товар уже есть");
        else {
            int n = -1;
            for (int i = 0; i < scladTovarov.length; i++) {
                if (scladTovarov[i] == "") {
                    n = i;
                    break;
                }
            }
            if (n < 0) System.out.println("Склад полон, очистите склад");
            else {
                scladTovarov[n] = name;
            }
        }
    }

    public static boolean chekTovar(String []scladTovarov, String name) {

    }

    public static void deliteTovar(String []scladTovarov, String name) {

    }
}
