package cleancode.minesweeper.tobe.minesweaper.io;

import cleancode.minesweeper.tobe.minesweaper.board.position.CellPosition;
import cleancode.minesweeper.tobe.minesweaper.user.UserAction;

public interface InputHandler {

    UserAction getUserActionFromUser();

    CellPosition getCellPositionFromUser();
}
