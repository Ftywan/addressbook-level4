package seedu.address.logic.parser.admin;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.address.logic.commands.admin.AddAdminCommand;
import seedu.address.logic.parser.Parser;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.admin.Password;
import seedu.address.model.admin.Username;

/**
 * Parses input arguments and creates a new AddAdminCommand object
 */
public class AddAdminCommandParser implements Parser<AddAdminCommand> {
    /**
     * Parses the given {@code String} of arguments in the context of the AddAdminCommand
     * and returns an AddAdminCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public AddAdminCommand parse(String args) throws ParseException {
        String trimmedArgs = args.trim();
        if (trimmedArgs.isEmpty()) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, AddAdminCommand.MESSAGE_USAGE));
        }

        String [] temp = trimmedArgs.split(" ");

        if (temp.length != 3) {
            throw new ParseException(String.format(MESSAGE_INVALID_COMMAND_FORMAT, AddAdminCommand.MESSAGE_USAGE));
        }

        Username username = new Username(temp[0]);
        Password password = new Password(temp[1]);
        Password passwordVerify = new Password(temp[2]);

        return new AddAdminCommand(username, password, passwordVerify);
    }

}
