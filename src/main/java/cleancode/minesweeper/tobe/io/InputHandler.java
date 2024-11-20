package cleancode.minesweeper.tobe.io;

import java.util.Scanner;

public interface InputHandler {
    public static final Scanner SCANNER = new Scanner(System.in);

    public String getUserInput();
}
