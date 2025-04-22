package lldquestions.atm.model;

public enum NoteType {

    TWO_THOUSAND(2000),
    FIVE_HUNDRED(500),
    ONE_HUNDRED(100);

    private int value;

    NoteType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
