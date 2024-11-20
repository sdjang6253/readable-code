package cleancode.minesweeper.tobe;

import cleancode.minesweeper.tobe.GameLevel.Advanced;
import cleancode.minesweeper.tobe.GameLevel.Beginner;
import cleancode.minesweeper.tobe.GameLevel.GameLevel;
import cleancode.minesweeper.tobe.GameLevel.Middle;
import cleancode.minesweeper.tobe.io.ConsoleInputHandler;
import cleancode.minesweeper.tobe.io.ConsoleOutputHandler;
import cleancode.minesweeper.tobe.io.InputHandler;
import cleancode.minesweeper.tobe.io.OutputHandler;

public class GameApplication {

    public static void main(String[] args) {
        GameLevel gameLevel = new Middle();
        InputHandler inputHandler = new ConsoleInputHandler();
        OutputHandler outputHandler = new ConsoleOutputHandler();

        Minesweeper minesweeper = new Minesweeper(gameLevel, inputHandler , outputHandler);
        minesweeper.initialize();
        minesweeper.run();
    }

    /**
     * DIP ( Dependency Inversion Principle) 의존성 역전
     *
     * DI ( Dependency Injection) 의존성 주입 - "3"
     *
     * IoC ( Inversion of Control) 제어의 역전
     *
     */
}
