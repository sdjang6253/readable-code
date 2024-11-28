package cleancode.minesweeper.tobe.minesweaper.board.cell;

public enum CellSnapshotStatus {

    EMPTY("빈 셀"),
    FLAG("깃발"),
    LANDMINE("지뢰"),
    NUMBER("숫자"),
    UNCHECKED("미확인")
    ;


    private final String description;

    CellSnapshotStatus(String description) {
        this.description = description;
    }
}
