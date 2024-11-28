package cleancode.minesweeper.tobe;

import cleancode.minesweeper.tobe.minesweaper.Minesweeper;
import cleancode.minesweeper.tobe.minesweaper.config.GameConfig;
import cleancode.minesweeper.tobe.minesweaper.gameLevel.Advanced;
import cleancode.minesweeper.tobe.minesweaper.io.ConsoleInputHandler;
import cleancode.minesweeper.tobe.minesweaper.io.ConsoleOutputHandler;

public class GameApplication {

    public static void main(String[] args) {
        GameConfig gameConfig = GameConfig.of(new Advanced(), new ConsoleInputHandler(), new ConsoleOutputHandler());


        Minesweeper minesweeper = new Minesweeper(gameConfig);
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

