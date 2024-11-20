package cleancode.minesweeper.tobe.io;

import cleancode.minesweeper.tobe.GameBoard;

import java.util.List;
import java.util.stream.IntStream;

public interface OutputHandler {
    void showGameStartComments() ;

    void showBoard(GameBoard board) ;

    void showGameWinningComment() ;

    void showGameLosingComment() ;

    void showCommentForSelectingCell() ;

    void showCommentForUserAction() ;

    void showExceptionMessage(Exception e) ;

    void showSimpleMessage(String string);

}
