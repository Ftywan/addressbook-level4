package seedu.address.model.job;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents a Job's name in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidJobName(String)}
 */
public class JobName {

    public static final String MESSAGE_JOBNAME_CONSTRAINTS =
            "Job names should only contain alphanumeric characters and without spaces, and it should not be blank";

    /*
     * The first character of the name must not be a whitespace,
     * otherwise " " (a blank string) becomes a valid input.
     */
    public static final String JOBNAME_VALIDATION_REGEX = "[\\p{Alnum}][\\p{Alnum}]*";

    public final String fullName;

    /**
     * Constructs a {@code Name}.
     *
     * @param name A valid job name.
     */
    public JobName(String name) {
        requireNonNull(name);
        checkArgument(isValidJobName(name), MESSAGE_JOBNAME_CONSTRAINTS);
        fullName = name;
    }

    /**
     * Returns true if a given string is a valid job name.
     */
    public static boolean isValidJobName(String test) {
        return test.matches(JOBNAME_VALIDATION_REGEX);
    }


    @Override
    public String toString() {
        return fullName;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof JobName // instanceof handles nulls
                && fullName.equals(((JobName) other).fullName)); // state check
    }

    @Override
    public int hashCode() {
        return fullName.hashCode();
    }

}
