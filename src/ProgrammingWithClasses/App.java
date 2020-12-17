package ProgrammingWithClasses;

import ProgrammingWithClasses.Car.Car;
import ProgrammingWithClasses.airline.Airline;
import ProgrammingWithClasses.airline.AirlineUtil;
import ProgrammingWithClasses.anotherClasses.*;
import ProgrammingWithClasses.books.Book;
import ProgrammingWithClasses.books.BookUtil;
import ProgrammingWithClasses.count.Client;
import ProgrammingWithClasses.count.Count;
import ProgrammingWithClasses.customer.Customer;
import ProgrammingWithClasses.customer.CustomerUtil;
import ProgrammingWithClasses.nation.City;
import ProgrammingWithClasses.nation.CountryArea;
import ProgrammingWithClasses.nation.Nation;
import ProgrammingWithClasses.nation.Region;
import ProgrammingWithClasses.text.Sentence;
import ProgrammingWithClasses.text.Text;
import ProgrammingWithClasses.text.Word;
import ProgrammingWithClasses.voucher.ClientForVoucher;
import ProgrammingWithClasses.voucher.Voucher;

import static ProgrammingWithClasses.anotherClasses.Student.findStudentsWithHighRating;
import static ProgrammingWithClasses.anotherClasses.Train.*;
import static ProgrammingWithClasses.anotherClasses.Triangle.findCoordinateOfMedian;
import static ProgrammingWithClasses.anotherClasses.Triangle.findPerimeterAndSquareOfTriangleBySides;

public class App {

    public static void main(String[] args) {

        Student[] students = new Student[10];
        students[0] = new Student("Ivanov A.A.", 17, new int[]{5, 6, 7, 8, 4});
        students[1] = new Student("Sidorov L.V.", 11, new int[]{9, 10, 9, 9, 10});
        students[2] = new Student("Sobolev E.D.", 1, new int[]{5, 6, 10, 8, 9});
        students[3] = new Student("Smith I.O.", 21, new int[]{8, 6, 9, 8, 4});
        students[4] = new Student("Petrov A.A.", 20, new int[]{9, 9, 9, 9, 9});
        students[5] = new Student("James D.I.", 17, new int[]{5, 6, 7, 8, 3});
        students[6] = new Student("Pointov I.I.", 20, new int[]{5, 5, 9, 7, 4});
        students[7] = new Student("Leonov V.V.", 1, new int[]{10, 10, 10, 10, 10});
        students[8] = new Student("Vasin T.T.", 21, new int[]{5, 8, 7, 8, 9});
        students[9] = new Student("Borgov O.V.", 11, new int[]{9, 9, 9, 10, 10});
        findStudentsWithHighRating(students);

        Train[] trains = new Train[5];
        trains[0] = new Train("Brest", 1458, "10:00");
        trains[1] = new Train("Grodno", 1500, "18:00");
        trains[2] = new Train("Gomel", 1694, "09:00");
        trains[3] = new Train("Mogilev", 1351, "20:00");
        trains[4] = new Train("Brest", 1299, "09:00");
        sortTrainsByNumberOfTrain(trains);
        showInfoOfTrain(trains);
        sortTrainsByDestinationAndTime(trains);

        Counter counter1 = new Counter();
        Counter counter2 = new Counter(5);
        for (int i = 0; i < 10; i++) {
            System.out.println("Значение первого счеткика равно: " + counter1.getValue()
                    + ". Значение второго счеткика равно: " + counter2.getValue());
            counter1.plus();
            counter2.minus();
        }

        Time time = new Time(12, 02, 59);
        System.out.println(time);
        time.setHour(11);
        time.setMinute(11);
        time.setSeconds(11);
        System.out.println(time);

        Triangle triangle = new Triangle();
        triangle.setPointA(2, 4);
        triangle.setPointB(5, 5);
        triangle.setPointC(8, 3);
        findCoordinateOfMedian(triangle);
        System.out.println();
        findPerimeterAndSquareOfTriangleBySides(triangle);

        Customer[] customers = new Customer[5];
        customers[0] = new Customer(1, "Ivanov", "Ivan", "Ivanovich",
                "Grodno, Kremko str. 25", 150084, 1900002526);
        customers[1] = new Customer(2, "Sidorov", "Sergei", "Petrovich",
                "Grodno, Ozheshko str. 21", 150192, 1900003295);
        customers[2] = new Customer(3, "Petrov", "Ilya", "Nikolaevich",
                "Grodno, K.Marksa str. 5", 160064, 1900009126);
        customers[3] = new Customer(4, "Potapov", "Vladimir", "Aleksandrovich",
                "Grodno, Mira str. 1", 150012, 1900000016);
        customers[4] = new Customer(5, "Leonov", "Yury", "Anatolievich",
                "Grodno, Zaharova str. 35", 150001, 1900002526);
        CustomerUtil util = new CustomerUtil(customers);
        util.sortCustomersBySurname();
        util.sortCustomerByNumberOfCreditCard();

        Book[] book = new Book[8];
        book[0] = new Book(1, "Цветы для Элджернона", "Киз", "Эксмо",
                2016, 382, 7.5, "Суперобложка");
        book[1] = new Book(2, "Метро 2033", "Глуховский", "АСТ",
                2019, 384, 10, "Твердый переплет");
        book[2] = new Book(3, "Просто делай! Делай просто!", "Хартман", "Эксмо",
                2019, 336, 21, "Твердый переплет");
        book[3] = new Book(4, "Снеговик", "Несбе", "Азбука",
                2017, 480, 9.2, "Твердый переплет");
        book[4] = new Book(5, "Текст", "Глуховский", "АСТ",
                2020, 320, 11, "Твердый переплет");
        book[5] = new Book(6, "Нож", "Несбе", "Азбука",
                2019, 576, 7.9, "Твердый переплет");
        book[6] = new Book(7, "Алхимик", "Коэльо", "АСТ",
                2020, 224, 4.6, "Мягкая обложка");
        book[7] = new Book(8, "Кладбище домашних животных", "Кинг", "АСТ",
                2016, 480, 5.2, "Твердый переплет");
        BookUtil bookUtil = new BookUtil(book);
        bookUtil.searchBooksByAuthor("Несбе");
        bookUtil.searchBooksByPublisher("АСТ");
        bookUtil.searchBooksByYear(2018);

        Airline[] airline = new Airline[10];
        airline[0] = new Airline("London", 1500, "Boeing-737", "10:00", 2);
        airline[1] = new Airline("Barcelona", 1162, "Airbus A330", "07:20", 6);
        airline[2] = new Airline("Paris", 1718, "Boeing-777", "20:00", 3);
        airline[3] = new Airline("London", 1211, "Boeing-767", "16:00", 1);
        airline[4] = new Airline("Moscow", 2015, "Boeing-747", "05:30", 6);
        airline[5] = new Airline("Barcelona", 9988, "Airbus A310", "03:00", 4);
        airline[6] = new Airline("Madrid", 0001, "Airbus A320", "12:10", 6);
        airline[7] = new Airline("Warsaw", 1055, "Boeing-767", "07:30", 2);
        airline[8] = new Airline("London", 1610, "Boeing-777", "11:00", 1);
        airline[9] = new Airline("Barcelona", 2121, "Airbus A310", "21:00", 6);
        AirlineUtil airlineUtil = new AirlineUtil();
        airlineUtil.setAirlines(airline);
        airlineUtil.searchFlightsByDestination("Barcelona");
        airlineUtil.searchFlightsByDayOfWeek(2);
        airlineUtil.searchFlightsByDayAndTime(6, "09:00");

        Word heading = new Word("Агрегация");
        Sentence sentence = new Sentence("Агрегация – это когда экземпляр двигателя" +
                " создается где-то в другом месте кода, и передается в конструктор " +
                "автомобиля в качестве параметра.");
        Text text = new Text(heading, sentence);
        text.showText();
        Sentence sentence1 = new Sentence("Композиция – это когда двигатель не существует " +
                "отдельно от автомобиля. Он создается при создании автомобиля и полностью" +
                " управляется автомобилем. В типичном примере, экземпляр двигателя будет " +
                "создаваться в конструкторе автомобиля.");
        text.addText(sentence1);
        text.showHeading();
        text.showText();

        Car car = new Car("BMW", 180, 20, true);
        car.ride();
        car.showModel();
        Car car1 = new Car("Renault", 130, 5, false);
        car1.ride();
        car1.showModel();

//        Реализация на уровне двух областей и двух районов для примера...
        City[] citiesOfGrodnoRegion = new City[4];
        citiesOfGrodnoRegion[0] = new City("Гродно");
        citiesOfGrodnoRegion[1] = new City("Озеры");
        citiesOfGrodnoRegion[2] = new City("Коптевка");
        citiesOfGrodnoRegion[3] = new City("Скидель");

        City[] citiesOfMinskRegion = new City[4];
        citiesOfMinskRegion[0] = new City("Минск");
        citiesOfMinskRegion[1] = new City("Боровляны");
        citiesOfMinskRegion[2] = new City("Ждановичи");
        citiesOfMinskRegion[3] = new City("Сеница");

        Region[] regionsOfGrodnoArea = new Region[1];
        regionsOfGrodnoArea[0] = new Region("Гродненский", citiesOfGrodnoRegion[0], citiesOfGrodnoRegion);

        Region[] regionsOfMinskArea = new Region[1];
        regionsOfMinskArea[0] = new Region("Минский", citiesOfMinskRegion[0], citiesOfMinskRegion);

        CountryArea[] countryAreas = new CountryArea[2];
        countryAreas[0] = new CountryArea("Гродненская", 25_127, citiesOfGrodnoRegion[0], regionsOfGrodnoArea);
        countryAreas[1] = new CountryArea("Минская", 39_912, citiesOfMinskRegion[0], regionsOfMinskArea);

        Nation nation = new Nation("Беларусь", citiesOfMinskRegion[0], countryAreas);
        nation.showCapitalInfo();
        nation.showNumberOfCountryAreas();
        nation.areaOfEachCountryArea();
        nation.showTotalArea();
        nation.showAreasCenters();

//        Реализация класса Банковский счет и Клиент
        Count[] counts = new Count[3];
        counts[0] = new Count("Беларусбанк", "4933 8888 4568 4152", 20000.5, true);
        counts[1] = new Count("Беларусбанк", "4933 8888 4568 6512", -1000, true);
        counts[2] = new Count("Альфа-Банк", "4933 8568 4568 8989", 5000, true);
        Client client = new Client(1, "Юрий", counts);
        client.showAllCounts();
        System.out.println("*************************");
        client.searchCount("4933 8568 4568 8989");
        System.out.println("*************************");
        client.getTotalValueOfCounts();
        System.out.println("*************************");
        client.getTotalValueOfPositiveCounts();
        System.out.println("*************************");
        client.getTotalValueOfNegativeCounts();
        System.out.println("*************************");
        client.unblockCount("4933 8888 4568 4152");
        client.showAllCounts();
        System.out.println("*************************");
        client.blockCount("4933 8888 4568 4152");
        client.sortAndShowCounts();
        System.out.println("*************************\nНовый клиент");
        Client client1 = new Client();
        Count count1 = new Count("Приорбанк", "5694 8945 6542 1324", 6000, false);
        Count count2 = new Count("Белинвестбанк", "5694 8945 6542 5962", 10000, true);
        client1.setId(2);
        client1.setNameOfClient("Вася");
        client1.addCount(count1);
        client1.showAllCounts();
        System.out.println(client1);
        client1.addCount(count2);
        System.out.println(client1);

        //Реализация класса Путевки и Клиент
        Voucher[] vouchers = new Voucher[5];
        vouchers[0] = new Voucher("Экскурсия", "Испания", "Барселона", "Самолет", "Завтрак/обед", 5, 550);
        vouchers[1] = new Voucher("Круиз", "Италия", "Торино", "Пароход", "Завтрак/обед/ужин", 7, 770);
        vouchers[2] = new Voucher("Шопинг", "Италия", "Милан", "Самолет", "Завтрак/ужин", 10, 850);
        vouchers[3] = new Voucher("Отдых", "Испания", "Аликанте", "Самолет", "Завтрак/обед", 14, 1100);
        vouchers[4] = new Voucher("Экскурсия", "Чехия", "Прага", "Автобус", "Завтрак/ужин", 10, 500);

        ClientForVoucher clientForVoucher = new ClientForVoucher(vouchers);
        clientForVoucher.showAllVouchers(vouchers);
        System.out.println("*************************");
        Voucher[] sortVouchersByCosts = clientForVoucher.sortVouchersByCosts(vouchers);
        clientForVoucher.showAllVouchers(sortVouchersByCosts);
        System.out.println("*************************");
        Voucher[] sortedVouchersByType = clientForVoucher.searchVouchersByType(vouchers, "Отдых");
        clientForVoucher.showAllVouchers(sortedVouchersByType);
        System.out.println("*************************");
        Voucher[] sortedVouchersByLength = clientForVoucher.searchVouchersByLength(vouchers, 10);
        clientForVoucher.showAllVouchers(sortedVouchersByLength);
        System.out.println("*************************");
        Voucher[] sortedVouchersByFood = clientForVoucher.searchVouchersByFood(sortedVouchersByLength, "Завтрак/ужин");
        clientForVoucher.showAllVouchers(sortedVouchersByFood);
    }
}
