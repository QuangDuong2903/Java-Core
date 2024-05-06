package designpattern.behavioral.template;

import java.io.InputStream;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        int choice;
        DataMiner dataMiner = null;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. File doc");
            System.out.println("2. File PDF");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            if (choice == 0)
                break;
            scanner.nextLine();
            System.out.print("Nhập tên file: ");
            String name = scanner.nextLine();
            dataMiner = switch (choice) {
                case 1 -> new DocDataMiner();
                case 2 -> new PDFDataMiner();
                default -> dataMiner;
            };
            dataMiner.mine(name);
        }
    }
}
