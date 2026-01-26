package labs;
import java.util.Arrays;
import java.util.Scanner;

public class lab4 {
 public static void main(String[] args) {
        System.out.println("Часть 1");
        System.out.println("===================");
        System.out.println("Задание 1");
        t1 t1 = new t1();
        t1.inf();
        System.out.println("===================");
        System.out.println("Задание 2");
        t2 t2 = new t2();
        t2.inf();
        System.out.println("===================");
        System.out.println("Задание 3");
        t3 t3 = new t3();
        t3.inf();
        System.out.println("===================");
        System.out.println("Задание 4");
        t4 t4 = new t4();
        t4.inf();
        System.out.println("===================");
        System.out.println("Задание 5");
        t5 t5 = new t5();
        t5.inf();
        System.out.println("===================");
        System.out.println("Задание 6");
        t6 t6 = new t6();
        t6.inf();
        System.out.println("===================");
        System.out.println("===================");
        System.out.println("Часть 2");
        System.out.println("===================");
        System.out.println("Задание 1");
        t7 t7 = new t7();
        t7.inf();
        System.out.println("===================");
        System.out.println("Задание 2");
        t8 t8 = new t8();
        t8.inf();
        System.out.println("===================");
        System.out.println("Задание 3");
        t9 t9 = new t9();
        t9.inf();
        System.out.println("===================");
        System.out.println("Задание 4");
        t10 t10 = new t10();
        t10.inf();
    }

    public static class t1 {
        public void inf() {
            System.out.println("Нечетные числа от 1 до 99:");
            int[] ints = new int[100];
            for (int i = 0; i < (ints.length - 1); i++) {
                ints[i] = i + 1;
                if (ints[i] % 2 == 1) {
                    System.out.println(ints[i]);
                }
            }
        }
    }

    public static class t2 {
        public void inf() {
            int[] ints = new int[100];
            System.out.println("Числа от 1 до 100");
            int j = 0;
            int k = 0;
            int z = 0;
            int[] mod3 = new int[ints.length / 3];
            ;
            int[] mod5 = new int[ints.length / 5];
            int[] mod15 = new int[ints.length / 15];
            for (int i = 0; i < ints.length; i++) {
                ints[i] = i + 1;
                if (ints[i] % 3 == 0) {
                    mod3[j++] = ints[i];
                }
                if (ints[i] % 5 == 0) {
                    mod5[k++] = ints[i];
                }
                if (ints[i] % 15 == 0) {
                    mod15[z++] = ints[i];
                }
            }
            System.out.println("Делятся на 3:" + Arrays.toString(mod3));
            System.out.println("Делятся на 5:" + Arrays.toString(mod5));
            System.out.println("Делятся на 15:" + Arrays.toString(mod15));
        }
    }

    public static class t3 {
        public void inf() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число ");
            int x = scanner.nextInt();
            System.out.print("Введите второе число ");
            int y = scanner.nextInt();
            System.out.print("Введите третье число ");
            int z = scanner.nextInt();
            System.out.println("Сумма второго и первого числа равно третьему число?");
            boolean res = true;
            if (x + y == z) {
                System.out.println("Результат:" + res);
            } else {
                res=false;
                System.out.println("Результат:" + res);
            }
        }
    }

    public static class t4 {
        public void inf() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число ");
            int x = scanner.nextInt();
            System.out.print("Введите второе число ");
            int y = scanner.nextInt();
            System.out.print("Введите третье число ");
            int z = scanner.nextInt();
            System.out.println("Второе число больше первого числа, а третье число больше второго числа?");
            boolean res = true;
            if (x < y && y < z) {
                System.out.println("Результат:" + res);
            } else {
                res=false;
                System.out.println("Результат:" + res);
            }
        }
    }

    public static class t5 {
        public void inf() {
            int[] array;
            massiv array1 = new massiv();
            array = array1.in();
            boolean res = true;
            System.out.println("Присутствует на первом или последнем элементе массива 1 или 3?");
            if (array.length >= 2) {
                if (array[0] == 3 || array[array.length - 1] == 3) {
                    System.out.println("Результат:" + res);
                } else {
                    res = false;
                    System.out.println("Результат:" + res);
                }
            } else {
                System.out.println("Длина массива должна быть больше или равна двум");
            }

        }
    }

    public static class t6 {
        public void inf() {
            int[] array;
            massiv array1 = new massiv();
            array = array1.in();
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 3 || array[i] == 1) {
                    j = 1;
                }
            }
            if (j == 0) {
                System.out.println("Результат: в массиве нет 1 и 3");
            } else {
                System.out.println("Результат: в массиве есть 1 или 3");
            }
        }
    }

    public static class t7 {
        public void inf() {
            int[] array;
            massiv array1 = new massiv();
            array = array1.in();
            int j = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] <= array[i + 1]) {
                } else {
                    j = j + 1;
                }
            }
            if (j == 0) {
                System.out.println("Результат: массив отсортирован");
            } else {
                System.out.println("Результат:please try again (массив не отсортирован)");
            }
        }
    }

    public static class t8 {
        public void inf() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Array length ");
            int x = scanner.nextInt();
            int[] ints = new int[x];
            System.out.println("Numbers of array: ");
            for (int i = 0; i < x; i++) {
                ints[i] = scanner.nextInt();
            }
            System.out.println("Результат: " + Arrays.toString(ints));
        }
    }

    public static class t9 {
        public void inf() {
            int[] array;
            massiv array1 = new massiv();
            array = array1.in();
            int j = 0;
            System.out.println("Исходный массив");
            System.out.println("array1=" + Arrays.toString(array));
            j = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = j;
            System.out.println("Преобразованный массив");
            System.out.println("array2=" + Arrays.toString(array));
        }
    }

    public static class t10 {
        public void inf() {
            int[] array;
            massiv array1 = new massiv();
            array = array1.in();
            Integer res = null, k = null;
            int z = 0;
            for (int i = 0; i < (array.length); i++) {
                if (z != 1) {
                    z = 0;
                    for (int j = 0; j < (array.length); j++) {
                        if (array[j] == array[i]) {
                            z = z + 1;
                        } else {
                            res = array[i];
                        }
                        k = res;
                    }
                }
            }
            if (z == 1) {
                System.out.println("Уникальное число: " + k);
            } else {
                System.out.println("В массиве нет уникального числа");
            }
        }
    }

    public static class massiv {
        public int[] in() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите длину массива: ");
            int length = scanner.nextInt();
            int[] array = new int[length];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < length; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println("Массив: " + Arrays.toString(array));
            return array;
        }
    }
}
