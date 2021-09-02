public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2,2020));


    }
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }

            }
        }
        return false;
    }
    public static int getDaysInMonth(int month,int year) {
        int numberOfDays=0;
        if ((month >= 1 && month <= 12) && (year >= 1 && year <= 9999)) {
            switch (month) {
                case 1:
                    System.out.println("31");
                    numberOfDays=31;
                    break;
                case 2:
                    System.out.println();
                    if (isLeapYear(year)) {
                        numberOfDays= 29;
                    } else {
                        numberOfDays= 28;
                    }
                    break;
                case 3:
                    System.out.println("31");
                    numberOfDays= 31;
                    break;
                case 4:
                    System.out.println("30");
                    numberOfDays= 30;
                    break;
                case 5:
                    System.out.println("31");
                    numberOfDays= 31;
                    break;
                case 6:
                    System.out.println("30");
                    numberOfDays= 30;
                    break;
                case 7:
                    System.out.println("31");
                    numberOfDays= 31;
                    break;
                case 8:
                    System.out.println("31");
                    numberOfDays= 31;
                    break;
                case 9:
                    System.out.println("30");
                    numberOfDays= 30;
                    break;
                case 10:
                    System.out.println("31");
                    numberOfDays= 31;
                    break;
                case 11:
                    System.out.println("30");
                    numberOfDays= 30;
                    break;
                case 12:
                    System.out.println("31");
                    numberOfDays= 31;
                    break;
                default:
                    System.out.println("Invalid Vaue");
            }

        } else {
            return -1;
        }
        return numberOfDays;
    }
}
