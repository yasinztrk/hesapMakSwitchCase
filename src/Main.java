import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number1, number2;
        int selection;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk Sayıyı Giriniz : ");
        number1 = input.nextDouble();
        System.out.print("İkinci Sayıyı Giriniz : ");
        number2 = input.nextDouble();

        System.out.println("Seçiminizi Yapınız :");
        System.out.println("1.Toplama\n2.Çıkarma\n3.Bölme\n4.Çarpma");
        selection = input.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Toplama Sonucunuz :" + (number1 + number2));
                break;
            case 2:
                System.out.println("Çıkarma Sonucuz :" + (number1 - number2));
                break;
            case 3:
                if (number2 == 0) {
                    System.out.print("Sayı 0'a bölünemez !");
                } else {
                    System.out.println("Bölme Sonucunuz :" + (number1 / number2));
                }
                break;
            case 4:
                System.out.println("Çarpma Sonucuz :" + (number1 * number2));
                break;
            default:
                System.out.println("YANLIŞ SEÇİM YAPTINIZ !");
        }


    }
}