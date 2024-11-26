package cleancode.minesweeper.tobe.io;

import cleancode.minesweeper.tobe.position.CellPosition;
import cleancode.minesweeper.tobe.user.UserAction;

import java.util.Scanner;

public interface InputHandler {

    UserAction getUserActionFromUser();

    CellPosition getCellPositionFromUser();
}
