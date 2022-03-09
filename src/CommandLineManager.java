import java.util.Scanner;

public class CommandLineManager {
    Scanner scanner = new Scanner(System.in);
    Journal pupils;

    public CommandLineManager(Journal pupils) {
        this.pupils = pupils;
    }

    public void printMenuAndHandleCommand() {
        while (true) {
            printMenu();
            int cmd = scanner.nextInt();
            if (cmd == 0) {
                break;
            } else if (cmd == 1) {
                addStudent();
            } else if (cmd == 2) {
                pupils.printAvgMarks();
            } else if (cmd == 3) {
                pupils.printPupilsWithExcellentMarksPercent();
            }

        }
        System.out.println("goodbye");
    }

    private void addStudent() {
        System.out.println("Add name");
        String name = scanner.next();
        System.out.println("Add grade for math");
        int mathMath = scanner.nextInt();
        System.out.println("Add grade for lang");
        int langLang = scanner.nextInt();
        System.out.println("Add grade for phis");
        int phisPhis = scanner.nextInt();


        System.out.println("student add");
        pupils.addPupil(new Pupul(name, mathMath, langLang, phisPhis));
    }

    private void printMenu() {
        System.out.println("Введите команду");
        System.out.println("1 -- add student");
        System.out.println("2 -- print avg grade");
        System.out.println("3 -- \n" +
                "display the percentage of excellent students");
        System.out.println("0 -- exit");
    }
}
