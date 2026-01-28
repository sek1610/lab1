package labs;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class lab5 {
   public static void main(String[] args) {
        System.out.println("Задание 1");
        maxword lab51 = new maxword();
        System.out.println("Самое длинное слово: " + lab51.inf(new String()));
        System.out.println("===================");
        System.out.println("Задание 2");
        palindrom lab52 = new palindrom();
        System.out.println("Является ли слово палиндромом: " + lab52.inf(new String()));
        System.out.println("===================");
        System.out.println("Задание 3");
        censore lab53 = new censore();
        System.out.println("Преобразованный текст: " +lab53.inf(new String()));
        System.out.println("===================");
        System.out.println("Задание 4");
        repeatings lab54 = new repeatings();
        System.out.println("Количество вхождений: " + lab54.inf(new String(), new String()));
        System.out.println("===================");
        System.out.println("Задание 5");
        reverse lab55 = new reverse();
        System.out.println("Преобразованный текст: " + lab55.inf(new String()));
        System.out.println("===================");

    }

    public static class maxword {
        public String inf(String text) {
            text1 text1 = new text1();
            text=text1.in();
            int tl = text.length();
            int l = 0;
            int j = 0;
            int maxl = 1;
            char[] textchar= text.toCharArray();
            char[] word= new char[' '];
            char[] maxword1= new char[' '];
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
                    maxword1=word;
                    maxl = l;
                }
            }
            String str = String.valueOf(maxword1);
            return str.replaceAll("\\p{Cntrl}", "");
        }
    }

    public static class palindrom {
        public boolean inf(String text) {
            word1 text1 = new word1();
            text=text1.in();
            text=text.toLowerCase();
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
            return res;
        }
    }

    public static class censore {
        public String inf(String text) {
            text1 text1 = new text1();
            text=text1.in();
            String cens ="[вырезано цензурой]";
            int tl = text.length();
            int l = 0;
            char[] textchar = text.toCharArray();
            while (l < tl-1)  {
                if (textchar[l] =='б' && (textchar[l + 2] == 'к') && (textchar[l + 1] == 'я') && (textchar[l + 3] == 'а')) {;
                    StringBuilder a1 = new StringBuilder(text);
                    text = String.valueOf(a1.replace(l, l + 4, cens));
                }
                l=l+1;
            }
            return text;
        }
    }

    public static class repeatings {
        public int inf(String text1, String text2) {
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
                    for (int j = 0; j < tl2; j++) {
                        if (textchar1[i+k] == textchar2[j]) {
                            l = (l + 1);
                            k = k + 1;
                        }else {
                            l=0;
                            k=0;
                        }
                    }
                    if (tl2 > 1) {
                        res = l / (tl2 - 1) + res;
                    } else {
                        res = l / (tl2) + res;
                    }
                }else {
                    l=0;
                    k=0;
                }
            }
            return res;
        }
    }

    public static class reverse {
        public String inf(String text) {
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
            String str = String.valueOf(textchar1);
            return str.replaceAll("\\p{Cntrl}", "");
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
