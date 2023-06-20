// 1) Вычислить сумма чисел от 1 до n
// 2) Вывести все простые числа от 1 до 1000
// 3) Реализовать простой калькулятор
// 4) (задание со *) Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
// 5) (задание со *) Доделать задания 5, 8, 9 из презинтации к уроку


public class App {
    public static void main(String[] args) throws Exception {
        
        hometask2();
        
    }


    public static void hometask2(String[] args) {

        for (int j = 2; j <= 1000; j++) {
            boolean simple = false;

            for (int i = 2; i * i <= j; i++) {
                simple = (j % i == 0);
                if (simple) {
                    break;
                }
            }
            if (!simple) {
                System.out.print(j + " ");
            }
        }
    }
}
