public class TaskFiveArray {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задание 2");
        int[] num = new int[3];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        // Задача 2
        double[] num2 = new double[]{1.57, 7.654, 9.986};
        String[] name = new String[]{"Катя", "Леша", "Света", "Игорь", "Роберт"};
        System.out.print("Массив №1: ");
        int i;
        for (i = 0; i < num.length && i != num.length - 1; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.print(+num[num.length - 1]);
        System.out.println(" ");
        System.out.print("Массив №2: ");
        for (i = 0; i < num2.length && i != num2.length - 1; i++) {
            System.out.print(num2[i] + ", ");
        }
        System.out.print(+num2[num2.length - 1]);
        System.out.println(" ");
        System.out.print("Массив №3: ");
        for (i = 0; i < name.length && i != name.length - 1; i++) {
            System.out.print(name[i] + ", ");
        }
        System.out.print(name[name.length - 1]);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Задание 3");
        // Задание 3
        System.out.print("Массив №1: ");
        for (i = 2; i <= num.length && i != 0; i--) {
            System.out.print(num[i] + ", ");
        }
        System.out.print(+num[0]);
        System.out.println(" ");
        System.out.print("Массив №2: ");
        for (i = 2; i <= num2.length && i != 0; i--) {
            System.out.print(num2[i] + ", ");
        }
        System.out.print(+num2[0]);
        System.out.println(" ");

        System.out.print("Массив №3: ");
        for (i = 4; i <= name.length && i != 0; i--) {
            System.out.print(name[i] + ", ");
        }
        System.out.print(name[0]);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Задание 4");
        System.out.print("Массив №1 измененный, нечетные увеличены на еденицу: ");
        // Задание 4
        for (i = 0; i < num.length; i++) {
            if (num[i] % 2 == 1) {
                num[i] = num[i] + 1;
            }
            System.out.print(num[i] + ", ");
        }
    }
}



