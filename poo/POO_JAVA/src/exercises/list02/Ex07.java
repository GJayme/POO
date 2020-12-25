package exercises.list02;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pageWidth = scanner.nextInt();
        int pageHeight = scanner.nextInt();

        int photo1Width = scanner.nextInt();
        int photo1Height = scanner.nextInt();

        int photo2Width = scanner.nextInt();
        int photo2Height = scanner.nextInt();

        fitsOnPage(pageWidth, pageHeight, photo1Width, photo1Height, photo2Width, photo2Height);
    }

    public static void fitsOnPage(int pageWidth, int pageHeight, int photo1Width, int photo1Height, int photo2Width, int photo2Height) {
        if (pageHeight >= photo1Height + photo2Height && pageWidth >= photo1Width && pageWidth >= photo2Width) {
            System.out.println("S");
        } else if (pageWidth >= photo1Width + photo2Height && pageHeight >= photo1Height && pageHeight >= photo2Height) {
            System.out.println("S");
        } else if (pageWidth >= photo1Width + photo2Height && pageHeight >= photo1Height && pageHeight >= photo2Width) {
            System.out.println("S");
        } else if (pageWidth >= photo2Width + photo1Height && pageHeight >= photo1Width && pageHeight >= photo2Height) {
            System.out.println("S");
        } else if (pageHeight >= photo1Width + photo2Height && pageWidth >= photo1Height && pageWidth >= photo2Width) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}
