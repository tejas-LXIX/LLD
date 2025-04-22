package lldquestions.atm.model;

public class Notes {

    private NoteType noteType;
    private int numberOfNotes;

    public Notes(NoteType noteType, int numberOfNotes) {
        this.noteType = noteType;
        this.numberOfNotes = numberOfNotes;
    }

    public NoteType getNoteType() {
        return noteType;
    }

    public void setNoteType(NoteType noteType) {
        this.noteType = noteType;
    }

    public int getNumberOfNotes() {
        return numberOfNotes;
    }

    public void setNumberOfNotes(int numberOfNotes) {
        this.numberOfNotes = numberOfNotes;
    }
}
