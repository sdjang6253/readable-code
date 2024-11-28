package cleancode.minesweeper.tobe.minesweaper.io.sign;

import cleancode.minesweeper.tobe.minesweaper.board.cell.CellSnapshot;
import cleancode.minesweeper.tobe.minesweaper.board.cell.CellSnapshotStatus;

public class UncheckedCellSignProvider implements CellSignProvidable{

    private static final String UNCHECKED_SIGN = "□";

    @Override
    public boolean supports(CellSnapshot snapshot) {
        return snapshot.isSameStatus(CellSnapshotStatus.UNCHECKED);
    }

    @Override
    public String provide(CellSnapshot cellSnapshot) {
        return UNCHECKED_SIGN;
    }
}
