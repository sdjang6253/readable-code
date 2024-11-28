package cleancode.minesweeper.tobe.minesweaper.io.sign;

import cleancode.minesweeper.tobe.minesweaper.board.cell.CellSnapshot;
import cleancode.minesweeper.tobe.minesweaper.board.cell.CellSnapshotStatus;

public class FlagCellSignProvider implements CellSignProvidable{

    private static final String FLAG_SIGN = "⚑";

    @Override
    public boolean supports(CellSnapshot snapshot) {
        return snapshot.isSameStatus(CellSnapshotStatus.FLAG);
    }

    @Override
    public String provide(CellSnapshot cellSnapshot) {
        return FLAG_SIGN;
    }
}
