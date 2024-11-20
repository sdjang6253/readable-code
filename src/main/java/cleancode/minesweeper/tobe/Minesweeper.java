package cleancode.minesweeper.tobe;

import cleancode.minesweeper.tobe.GameLevel.GameLevel;
import cleancode.minesweeper.tobe.game.GameInitializable;
import cleancode.minesweeper.tobe.game.GameRunnable;
import cleancode.minesweeper.tobe.io.ConsoleInputHandler;
import cleancode.minesweeper.tobe.io.ConsoleOutputHandler;
import cleancode.minesweeper.tobe.io.InputHandler;
import cleancode.minesweeper.tobe.io.OutputHandler;

public class Minesweeper implements GameInitializable, GameRunnable {


    private int gameStatus = 0; // 0: 게임 중, 1: 승리, -1: 패배

    private final GameBoard gameBoard;
    private final BoardIndexConverter boardIndexConverter = new BoardIndexConverter();
    private final InputHandler inputHandler;
    private final OutputHandler outputHandler;

    public Minesweeper(GameLevel gameLevel , InputHandler inputHandler , OutputHandler outputHandler) {
        gameBoard = new GameBoard(gameLevel);
        this.inputHandler = inputHandler;
        this.outputHandler = outputHandler;
    }

    @Override
    public void initialize() {
        gameBoard.initializeGame();
    }

    public void run() {
        outputHandler.showGameStartComments();
        gameBoard.initializeGame();

        while (true) {
            try{
                outputHandler.showBoard(gameBoard);

                if (doesUserWinTheGame()) {
                    outputHandler.printGameWinningComment();
                    break;
                }
                if (doesUserLoseTheGame()) {
                    outputHandler.printGameLosingComment();
                    break;
                }

                String cellInput = getCleeInputFromUser();
                String userActionInput = getUserActionInputFromUser();
                actOnCell(cellInput, userActionInput);
            }catch(GameException e){
                outputHandler.printExceptionMessage(e);
            } catch(Exception e){
                outputHandler.printSimpleMessage("프로그램에 문제가 생겼습니다.");
            }
        }
    }

    private void actOnCell(String cellInput, String userActionInput) {
        int selectedColIndex = boardIndexConverter.getSelectedColIndex(cellInput , gameBoard.getColSize());
        int selectedRowIndex = boardIndexConverter.getSelectedRowIndex(cellInput , gameBoard.getRowSize());

        if (doesUserChooseToPlantFlag(userActionInput)) {
            gameBoard.flag(selectedRowIndex, selectedColIndex);
            checkIfGameIsOver();
            return;
        }

        if (doesUserChooseToOpenCell(userActionInput)) {
            if (gameBoard.isLandMineCell(selectedRowIndex, selectedColIndex)) {
                gameBoard.open(selectedRowIndex,selectedColIndex);
                changeGameStatusToLose();
                return;
            }

            gameBoard.openSurroundedCells(selectedRowIndex, selectedColIndex);
            checkIfGameIsOver();
            return;
        }
        throw new GameException("잘못된 번호를 선택하셨습니다.");
    }

    private void changeGameStatusToLose() {
        gameStatus = -1;
    }

    private boolean doesUserChooseToOpenCell(String userActionInput) {
        return userActionInput.equals("1");
    }

    private boolean doesUserChooseToPlantFlag(String userActionInput) {
        return userActionInput.equals("2");
    }

    private String getUserActionInputFromUser() {
        outputHandler.printCommentForUserAction();
        return inputHandler.getUserInput();
    }

    private String getCleeInputFromUser() {
        outputHandler.printCommentForSelectingCell();
        return inputHandler.getUserInput();
    }

    private boolean doesUserLoseTheGame() {
        return gameStatus == -1;
    }

    private boolean doesUserWinTheGame() {
        return gameStatus == 1;
    }

    private void checkIfGameIsOver() {
        if (gameBoard.isAllCellChecked()) {
            changeGameStatusToWin();
        }
    }

    private void changeGameStatusToWin() {
        gameStatus = 1;
    }

}
