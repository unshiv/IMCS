package demo;

/**
 * Created by Manohar on 12/21/2016.
 */

enum Day {
    SUNDAY, MONDAY;
}


enum Status {
    ERROR(400), SUCCESS(200);

    int code;
    Status(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static Status resolveStatusByCode(int code) {
        for(Status status : Status.values()) {
            if(code == status.getCode()) {
                return status;
            }
        }

        return null;
    }
}

public class EnumTest {


    public static void main(String[] args) {
        Day day = Day.MONDAY;
        Status status = Status.ERROR;
        display(day);
        statusDisplay(status);
        System.out.println(Status.resolveStatusByCode(400));
    }

    private static void statusDisplay(Status status) {
        System.out.println(status.getCode());
    }

    private static void display(Day day) {
        switch(day) {
            case SUNDAY:
                System.out.println("It is Sunday");
                break;
            case MONDAY:
                System.out.println("It is Monday");
                break;
        }
    }
}
