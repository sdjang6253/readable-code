package cleancode.minesweeper.tobe.io.sign;

import cleancode.minesweeper.tobe.cell.CellSnapshot;

import java.util.List;

public class CellSignFinder {
    private static final List<CellSignProvidable> cellSignProviders = List.of(
            new EmptyCellSignProvider(),
            new FlagCellSignProvider(),
            new UncheckedCellSignProvider(),
            new LandMineCellSignProvider(),
            new NumberCellSignProvider()
    );

    public String findCellSignFrom(CellSnapshot cellSnapshot){

        return cellSignProviders.stream()
                .filter(provider -> provider.supports(cellSnapshot))
                .findFirst()
                .map(provider->provider.provide(cellSnapshot))
                .orElseThrow(() -> new IllegalArgumentException("확인할 수 없는 셀입니다"));

    }

}
