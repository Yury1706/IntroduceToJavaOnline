package BasicsOfOOP;

import BasicsOfOOP.Calendar.Calendar;
import BasicsOfOOP.Payment.Payment;

public class App {

    public static void main(String[] args) {

//        Directory directory = new Directory("My Documents");
//        TextFile textFile = new TextFile("My TextFile", "Это пробный текст");
//        directory.createNewFile(textFile);
//        directory.printDataOfFile("My TextFile");
//        directory.renameFile("My TextFile", "My New TextFile");
//        directory.addData("My New TextFile", " для нового текста");
//        directory.printDataOfFile("My New TextFile");
//        directory.showAllFilesInDirectory();
//        System.out.println("***************************");
//        File file = new File("Another SimpleFile", "Это обычный файл");
//        directory.createNewFile(file);
//        directory.showAllFilesInDirectory();
//        System.out.println("***************************");
//        directory.deleteFile("My New TextFile");
//        directory.showAllFilesInDirectory();

//        Payment payment = new Payment();
//        Payment.Product book = payment.new Product("Book", 2, 15.6);
//        Payment.Product pen = payment.new Product("Pen", 10, 1.5);
//        Payment.Product calculator = payment.new Product("Calculator", 1, 13.8);
//        payment.showCheck();
//        payment.pay();

        Calendar calendar = new Calendar();
        Calendar.Holiday holiday1 = calendar.new Holiday("Happy New Year", 01, 01);
        Calendar.Holiday holiday2 = calendar.new Holiday("Saint Valentine Day", 14, 02);
        Calendar.Holiday holiday3 = calendar.new Holiday("9th of May", 9, 05);
        calendar.showHolidays();
    }
}
