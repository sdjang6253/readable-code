package cleancode.minesweeper.tobe.minesweaper.io.sign;

import cleancode.minesweeper.tobe.minesweaper.board.cell.CellSnapshot;

public interface CellSignProvidable {

    boolean supports(CellSnapshot snapshot);

    String provide(CellSnapshot cellSnapshot);
}
