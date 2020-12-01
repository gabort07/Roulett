package Roulett;

public enum Splitting {
    GREEN(35), RED(1), BLACK(1), EVEN(1),
    ODD(1), FIRST_18(1), SECOND_18(1),
    ORPHANS(1), BIG_SERIES(1), SMALL_SERIES(21), FIRST_12(2), SECOND_12(2),
    THIRD_12(2),
    ZERO_NEIGHBORS(0), FIRST_COLLUM(2), SECOND_COLLUM(2), THIRD_COLLUM(2);

private final double multiplier;
    Splitting(final double newMultiplier) {
        multiplier =newMultiplier;
    }

    public double getMultiplier() {
        return multiplier;
    }
}

