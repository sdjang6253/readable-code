package cleancode.minesweeper.tobe.minesweaper.board.cell;

public interface Cell {

    boolean isLandMine() ;

    boolean hasLandMineCount();

    CellSnapshot getSnapshot();

    void flag();

    void open();

    boolean isChecked();

    boolean isOpened();

}