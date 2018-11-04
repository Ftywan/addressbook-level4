package seedu.address.model.job;

/**
 * Represents a Note Object for Job.
 */
public class JobNote {

    public static final String MESSAGE_NOTE_CONSTRAINTS =
            "Job notes should only contain alphanumeric characters and spaces, "
                    + "and it should not be blank";

    /*
     * The first character of the note must not be a whitespace,
     * otherwise " " (a blank string) becomes a valid input.
     */
    public static final String JOBNOTE_VALIDATION_REGEX = "[\\p{Alnum}][\\p{Alnum} ]*";

    private String note;

    public JobNote(String note) {
        this.note = note;
    }

    public static boolean isValidJobNote(String test) {
        return test.matches(JOBNOTE_VALIDATION_REGEX);
    }

    public String toString() {
        return note;
    }

    public void changeNote(String newNote) {
        this.note = newNote;
    }

    /**
     * Adding to existing note
     * @param addition
     */
    public void addNote(String addition) {
        String newNote = this.note + "; \n" + addition;
        changeNote(newNote);
    }

}
