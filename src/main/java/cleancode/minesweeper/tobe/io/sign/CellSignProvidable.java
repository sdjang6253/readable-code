package cleancode.minesweeper.tobe.io.sign;

import cleancode.minesweeper.tobe.cell.CellSnapshot;
import cleancode.minesweeper.tobe.cell.CellSnapshotStatus;

public interface CellSignProvidable {

    boolean supports(CellSnapshot snapshot);

    String provide(CellSnapshot cellSnapshot);
}
