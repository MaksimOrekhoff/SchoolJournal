import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Journal pupils = new Journal();
        CommandLineManager commandLineManager = new CommandLineManager(pupils);
        commandLineManager.printMenuAndHandleCommand();

    }
}
