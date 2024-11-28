package cleancode.minesweeper.tobe.minesweaper.io;

import cleancode.minesweeper.tobe.minesweaper.board.GameBoard;

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
