package labs;
import java.util.Arrays;
import java.util.Scanner;

public class lab4 {
 public static void main(String[] args) {
        System.out.println("Часть 1");
        System.out.println("===================");
        System.out.println("Задание 1");
        System.out.println("Нечетные числа от 1 до 99:");
        nechet t1 = new nechet();
        System.out.println((Arrays.toString(t1.inf())));
        System.out.println("===================");
        System.out.println("Задание 2");
        divide3515 t2 = new divide3515();
        System.out.println("Делятся на 3: " + Arrays.toString(t2.divide3()));
        System.out.println("Делятся на 5: " + Arrays.toString(t2.divide5()));
        System.out.println("Делятся на 15: " + Arrays.toString(t2.divide15()));
        System.out.println("===================");
        System.out.println("Задание 3");
        xandyequalsz t3 = new xandyequalsz();
        System.out.println("Сумма второго и первого числа равна третьему число?: " + t3.inf());
        System.out.println("===================");
        System.out.println("Задание 4");
        xlessylessz t4 = new xlessylessz();
        System.out.println("Второе число больше первого числа, а третье число больше второго числа?: " + t4.inf());
        System.out.println("===================");
        System.out.println("Задание 5");
        hasmassive1or3on1orlast t5 = new hasmassive1or3on1orlast();
        System.out.println("Присутствует на первом или последнем элементе массива 1 или 3?: " + t5.inf());
        System.out.println("===================");
        System.out.println("Задание 6");
        hasmassive1or3 t6 = new hasmassive1or3();
        System.out.println("Присутствует ли в массиве 1 или 3?: " + t6.inf());
        System.out.println("===================");
        System.out.println("===================");
        System.out.println("Часть 2");
        System.out.println("===================");
        System.out.println("Задание 1");
        sortmassiv t7 = new sortmassiv();
        t7.inf();
        System.out.println("===================");
        System.out.println("Задание 2");
        entermassiv t8 = new entermassiv();
        System.out.println("Result: " + Arrays.toString(t8.inf()));
        System.out.println("===================");
        System.out.println("Задание 3");
        firstchangetolast t9 = new firstchangetolast();
        System.out.println("Преобразованный массив");
        System.out.println("Array2: " + Arrays.toString(t9.inf()));
        System.out.println("===================");
        System.out.println("Задание 4");
        uniquenum t10 = new uniquenum();
        System.out.println("Уникальное число: " + t10.inf());
    }

    public static class nechet {
        public int[] inf() {
            int[] ints = new int[100];
            int[] ints1 = new int[50];
            int j = 0;
            for (int i = 0; i < (ints.length - 1); i++) {
                ints[i] = i + 1;
                if (ints[i] % 2 == 1) {
                    ints1[j]=ints[i];
                    j=j+1;
                }
            }
            return ints1;
        }
    }

    public static class divide3515 {
        public int[] divide3() {
            int[] ints = new int[100];
            int j = 0;
            int[] mod3 = new int[ints.length / 3];
            for (int i = 0; i < ints.length; i++) {
                ints[i] = i + 1;
                if (ints[i] % 3 == 0) {
                    mod3[j++] = ints[i];
                }
            }
            return mod3;
        }
        public int[] divide5() {
        int[] ints = new int[100];
        int j = 0;
        int[] mod5 = new int[ints.length / 5];
            for (int i = 0; i < ints.length; i++) {
            ints[i] = i + 1;
            if (ints[i] % 5 == 0) {
                mod5[j++] = ints[i];
            }
        }
            return mod5;
        }
        public int[] divide15() {
            int[] ints = new int[100];
            int z = 0;
            int[] mod15 = new int[ints.length / 15];
            for (int i = 0; i < ints.length; i++) {
                ints[i] = i + 1;
                if (ints[i] % 15 == 0) {
                    mod15[z++] = ints[i];
                }
            }
            return mod15;
        }
    }

    public static class xandyequalsz {
        private int x;
        private int y;
        private int z;
        public boolean inf() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число ");
            x = scanner.nextInt();
            System.out.print("Введите второе число ");
            y = scanner.nextInt();
            System.out.print("Введите третье число ");
            z = scanner.nextInt();
            boolean res = true;
            if (x + y != z) {
                res=false;
            }
            return res;
        }
    }

    public static class xlessylessz {
        private int x;
        private int y;
        private int z;
        public boolean inf() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число ");
            x = scanner.nextInt();
            System.out.print("Введите второе число ");
            y = scanner.nextInt();
            System.out.print("Введите третье число ");
            z = scanner.nextInt();
            boolean res = false;
            if (x < y && y < z) {
                res=true;
            }
            return res;
        }
    }

    public static class hasmassive1or3on1orlast {
        private int[] array;
        public boolean inf() {
            massiv array1 = new massiv();
            array = array1.in();
            boolean res = true;
            if (array.length >= 2) {
                if (array[0] == 3 || array[array.length - 1] == 3) {
                } else {
                    res = false;
                }
            } else {
                System.out.println("Длина массива должна быть больше или равна двум");
            }
            return res;
        }
    }

    public static class hasmassive1or3 {
        private int[] array;
        public boolean inf() {
            massiv array1 = new massiv();
            array = array1.in();
            int j = 0;
            boolean res = true;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 3 || array[i] == 1) {
                    j = 1;
                }
            }
            if (j == 0) {
                res=false;
            }
            return res;
        }
    }

    public static class sortmassiv {
        private int[] array;
        public void inf() {
            massiv array1 = new massiv();
            array = array1.in();
            int j = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] <= array[i + 1]) {
                } else {
                    j = j + 1;
                }
            }
            System.out.println("Массив отсортирован по возрастанию?");
            if (j == 0) {
                System.out.println("Результат: ok");
            } else {
                System.out.println("Результат:please try again (массив не отсортирован)");
            }
        }
    }

    public static class entermassiv {
        public int[] inf() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Array length ");
            int x = scanner.nextInt();
            int[] ints = new int[x];
            System.out.println("Numbers of array: ");
            for (int i = 0; i < x; i++) {
                ints[i] = scanner.nextInt();
            }
            return ints;
        }
    }

    public static class firstchangetolast {
        private int[] array;
        public int[] inf() {
            massiv array1 = new massiv();
            array = array1.in();
            int j = 0;
            System.out.println("Исходный массив");
            System.out.println("array1=" + Arrays.toString(array));
            j = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = j;
            return array;
        }
    }

    public static class uniquenum {
        private int[] array;
        public int inf() {
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
            } else {
                System.out.println("В массиве нет уникального числа");
            }
            return k;
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
