import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        printAssues(2022);
        printAssues(2021);
        clientDeviceYear(0, 2000);
        clientDeviceYear(1, 2023);
        showCalsCarVersion( 10);
        showCalsCarVersion(100);
    }

    public static void printAssues(int whishYear) {
        System.out.println("Задача1");
        if (whishYear % 4 == 0 && whishYear % 100 != 0 || whishYear % 400 == 0) {
            System.out.println(whishYear + " год высокосный ");
        } else {
            System.out.println(whishYear + " год не высокосный ");
        }

    }

    public static void clientDeviceYear(int clientOs, int mobiVers) {
        System.out.println("Задача2");
        String mobiName;
        int weeYear = LocalDate.now().getYear();
        switch (clientOs) {
            case 0:
                mobiName = "IOS";
                break;
            case 1:
                mobiName = "Android";
                break;
            default:
                mobiName = "unknown OS";

        }
        if (mobiVers != weeYear) {
            System.out.println("Для ОС " + mobiName + " установите облегченную версию");
        } else {
            System.out.println("Дя ОС" + mobiName + " установите стандартную версию");
        }


    }

    public static void showCalsCarVersion(int distanse) {
        int delivery = calsCarVersion(distanse);

        if (delivery > 0) {
            System.out.println(" требуется дней " + delivery);
        } else {
            System.out.println("доствака не осуществляется");
        }
}

    public static int calsCarVersion(int distanse){
            int delivery;
            if (distanse <= 20) {
                delivery = 1;
            } else if (distanse <= 60) {
                delivery = 2;
            } else if (distanse <= 100) {
                delivery = 3;
            } else {
                delivery = -1;

            }
            return delivery;


    }
}

