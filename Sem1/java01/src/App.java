import java.time.LocalTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        task1();
        task2();
        Depends("Go");
    }

    private static void task1() {

        System.out.println("Hello, World!");

        // Написать программу, которая запросит пользователя ввести <Имя> в консоли.
        // Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
        Scanner iScanner = new Scanner(System.in);

        System.out.printf("Enter your name: ");

        String name = iScanner.nextLine();

        // System.out.printf("Hello, %s!\n", name);
        Depends(name);
        // System.out.println("Hello, " + name);

    }

    public static void Depends(String name) {
        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        if (lt.getHour() >= 18 && lt.getHour() < 23) {
            System.out.printf("Good evening, %s!\n", name);
        } else if (lt.getHour() >= 23 || lt.getHour() < 5) {
            System.out.printf("Good night, %s!\n", name);
        } else if (lt.getHour() >= 5 || lt.getHour() < 12) {
            System.out.printf("Good morning, %s!\n", name);
        } else if (lt.getHour() >= 12 || lt.getHour() < 18) {
            System.out.printf("Good afternoon, %s!\n", name);
        }
    }

    private static void task2() {
        // Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
        // максимальное количество подряд идущих 1.

        int[] arr = { 1, 1, 0, 1, 1, 1 };
        int cnt = 0;
        int max_cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                cnt++;
            else
                cnt = 0;
            if (cnt > max_cnt)
                max_cnt = cnt;
        }
        System.out.println(max_cnt);

    }
}

// public static MoveElementsInEnd {
//     public static void main(String[] args) {
//         int[] arr = new int[] { 3, 2, 2, 3 };
//         moveElementsInEnd(arr, 3);
//         System.out.println(Arrays.toString(arr));
//     }

//     public static void moveElementsInEnd(int[] arr, int val) {
//         int endIndex = arr.length - 1;
//         for (int i = arr.length - 1; i >= 0; i--) {
//             if (arr[i] == val)
//                 endIndex--;
//             else
//                 break;
//         }
//         for (int i = 0; i <= endIndex; i++) {
//             if (arr[i] == val) {
//                 int temp = arr[endIndex];
//                 arr[endIndex] = arr[i];
//                 arr[i] = temp;
//                 endIndex--;
//             }
//         }
//     }
// }
// public static int findPrefix(String[] strs){
//     String[] lStrs = Arrays.stream(strs).map(s->s.toLowerCase()).toArray(String[]::new);
//     String first = lStrs[0];
//     boolean found = false;
//     int result = 0;
//     for(int prefixLength = 1;  prefixLength < first.length(); prefixLength++){
//         String prefix = first.substring(0, prefixLength + 1);
//         boolean match = true;
//         for(int i = 1; i < lStrs.length; i++){
//             String checkingStr = lStrs[i];
//             if(!checkingStr.startsWith(prefix)){
//                 match = false;
//                 break;
//             }
//         }
//         if(match){
//             result = prefixLength;
//         }
//         else break;
//     }
//     return result;
// }