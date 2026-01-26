package labs;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class lab5 {
 public static void main(String[] args) {
        System.out.println("Задание 1");
        lab51 lab51 = new lab51();
        lab51.inf();
        System.out.println("===================");
        System.out.println("Задание 2");
        lab52 lab52 = new lab52();
        lab52.inf();
        System.out.println("===================");
        System.out.println("Задание 3");
        lab53 lab53 = new lab53();
        lab53.inf();
        System.out.println("===================");
        System.out.println("Задание 4");
        lab54 lab54 = new lab54();
        lab54.inf();
        System.out.println("===================");
        System.out.println("Задание 5");
        lab55 lab55 = new lab55();
        lab55.inf();
        System.out.println("===================");
    }

    public static class lab51 {
        private String text;
        public void inf() {
            text1 text1 = new text1();
            text=text1.in();
            int tl = text.length();
            int l = 0;
            int j = 0;
            int maxl = 1;
            char[] textchar= text.toCharArray();
            char[] word= new char[' '];
            char[] maxword= new char[' '];
            for (int i = 0; i < tl-1; i++) {
                if (textchar[i] == ',' || textchar[i] == '.' || textchar[i] == ':' || textchar[i] == ';' || textchar[i] == '-' || textchar[i] == ' ') {
                    l=0;
                    j=0;
                    word= new char[' '];
                } else {
                    word[j]=textchar[i];
                    l = l + 1;
                    j=j+1;
                }
                if (maxl < l) {
                    maxword=word;
                    maxl = l;
                }
            }
            System.out.println("Самое длинное слово:");
            String str = String.valueOf(maxword);
            String out = str.replaceAll("\\p{Cntrl}", "");
            System.out.println(out);
        }
    }

    public static class lab52 {
        private String text;
        public void inf() {
            word1 text1 = new word1();
            text=text1.in();
            boolean res = true;
            int tl = text.length();
            int l = 0;
            char[] textchar= text.toCharArray();
            for (int i = 0; i < tl; i++) {
                if (textchar[i] == textchar[tl-1-i]) {
                } else {
                    l = l + 1;
                }
            }
            if (l != 0) {
                res=false;
            } else {
                res=true;
            }
            System.out.println("Является ли слово палиндромом:");
            System.out.println(res);
        }
    }

    public static class lab53 {
        private String text;
        public void inf() {
            text1 text1 = new text1();
            text=text1.in();
            int tl = text.length();
            int l = 0;
            int a = 0;
            char[] textchar = text.toCharArray();
            System.out.println("Преобразованный текст:");
            while (l < tl+a)  {
                if (textchar[l] =='б' && (textchar[l + 2] == 'к') && (textchar[l + 1] == 'я') && (textchar[l + 3] == 'а')) {
                    System.out.print("[вырезано цензурой]");
                    l=l+3;
                    a=16;
                } else {
                    String out = String.valueOf(textchar[l]);
                    System.out.print(out);
                    a=0;
                }
                l=l+1;
            }
            System.out.println("");
        }
    }

    public static class lab54 {
        private String text1;
        private String text2;
        public void inf() {
            text1 text = new text1();
            text1=text.in();
            int tl1 = text1.length();
            text1 text22 = new text1();
            text2=text22.in();
            int tl2 = text2.length();
            int l = 0;
            int k = 0;
            int res = 0;
            char[] textchar1= text1.toCharArray();
            char[] textchar2= text2.toCharArray();
            for (int i = 0; i < tl1-1; i++) {
                if (textchar1[i] == textchar2[0]) {
                    for (int j = 0; j < tl2-1; j++) {
                        if (textchar1[i+k] == textchar2[j]) {
                            l = (l + 1);
                            k = k + 1;
                        }else {
                            l=0;
                            k=0;
                        }
                    }
                    res=l/tl2+res;
                }else {
                    l=0;
                    k=0;
                }
            }
            System.out.println("Количество вхождений:");
            System.out.println(res);
        }
    }

    public static class lab55 {
        private String text;
        public void inf() {
            text1 text1 = new text1();
            text=text1.in();
            int tl= text.length();
            int l = 0;
            int k = 0;
            int i = 0;
            char[] textchar = text.toCharArray();
            char[] textchar1 = new char[tl];
            while (i < tl) {
                if ((textchar[i] == ' ') || (textchar[i] == ',') || (textchar[i] == '.') || (textchar[i] == ':') || (textchar[i] == ';') || (textchar[i] == '-')) {
                    k=i+1;
                    textchar1[i] = textchar[i];
                } else {
                    int j = i;
                    while(j < tl) {
                        if ( (textchar[j] == ' ') || (textchar[j] == ',') || (textchar[j] == '.') || (textchar[j] == ':') || (textchar[j] == ';') || (textchar[j] == '-')) {
                            j=tl;
                        } else {
                            l = l+1;
                            j=j+1;
                        }
                    }
                    textchar1[i] = textchar[l+k-1];
                    l=0;
                }
                i=i+1;
            }
            System.out.println("The string reversed word by word is:");
            String str = String.valueOf(textchar1);
            String out = str.replaceAll("\\p{Cntrl}", "");
            System.out.println(out);
        }
    }

    public static class text1 {
        public String in() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите текст:");
            String text;
            text=scanner.nextLine();
            return text;
        }
    }

    public static class word1 {
        public String in() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите слово:");
            String word;
            word=scanner.next();
            return word;
        }
    }
}
