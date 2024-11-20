package cleancode.minesweeper.tobe.cell;

public abstract class Cell {

    protected boolean isFlagged;
    protected boolean isOpened;

    protected static final String FLAG_SIGN = "⚑";
    protected static final String UNCHECKED_SIGN = "□";

    //Cell 이 가진 속성 : 근처 지뢰 숫자 , 지뢰 여부
    //Cell 의 상태 : 깃말 유무 , 열렷다/닫혔다 , 사용자가 확인함.

    public abstract boolean isLandMine() ;

    public abstract boolean hasLandMineCount();

    public abstract String getSign();

    public void flag() {
        this.isFlagged = true;
    }

    public void open() {
        this.isOpened = true;
    }

    public boolean isChecked() {
        return isFlagged || isOpened;
    }

    public boolean isOpened() {
        return isOpened;
    }


}
