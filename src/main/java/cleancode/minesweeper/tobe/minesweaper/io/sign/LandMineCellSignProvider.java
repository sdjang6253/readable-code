package cleancode.minesweeper.tobe.minesweaper.io.sign;

import cleancode.minesweeper.tobe.minesweaper.board.cell.CellSnapshot;
import cleancode.minesweeper.tobe.minesweaper.board.cell.CellSnapshotStatus;

public class LandMineCellSignProvider implements CellSignProvidable{

    private static final String LANDMINE_SIGN = "☼";

    @Override
    public boolean supports(CellSnapshot snapshot) {
        return snapshot.isSameStatus(CellSnapshotStatus.LANDMINE);
    }

    @Override
    public String provide(CellSnapshot cellSnapshot) {
        return LANDMINE_SIGN;
    }
}
