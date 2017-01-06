import java.util.Scanner;

/**
 * Created by vishn on 12/22/2016.
 */
public class EnumDepartment {

    enum Department{
        SALES(10), PURCHASE(20), ADMINISTRATION(30), RESEARCH(40);

        private int value;
        Department(int value) {

            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        int x ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a department number: ");
        x = in.nextInt();

        switch(x) {
            case 10:
                System.out.println("SALES ");
                break;
            case 20:
                System.out.println("PURCHASE ");
                break;
            case 30:
                    System.out.println("ADMINISTRATION ");
                    break;
            case 40:
                    System.out.println("RESEARCH ");
                    break;
                    default:
                        System.out.println("No Department exist");
            }
        }

    }

