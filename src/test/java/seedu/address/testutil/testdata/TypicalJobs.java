package seedu.address.testutil.testdata;

import seedu.address.model.job.Job;
import seedu.address.model.job.Priority;
import seedu.address.model.job.Status;
import seedu.address.model.machine.MachineStatus;
import seedu.address.testutil.builders.JobBuilder;
import seedu.address.testutil.builders.MachineBuilder;
import seedu.address.testutil.builders.PersonBuilder;

/**
 * A utility class containing a list of {@code Job} objects to be used in tests.
 */
public class TypicalJobs {

    public static final Job IDCP = new JobBuilder()
            .withName("IDCP")
            .withMachine(new MachineBuilder()
                    .withMachineName("JJPrinter")
                    .withMachineStatus(MachineStatus.ENABLED).build().getName())
            .withJobNote("This is jj jobnote")
            .withDuration(2)
            .withPriority(Priority.HIGH)
            .withOwner(new PersonBuilder()
                    .withName("Jun jie")
                    .build())
            .withStatus(Status.QUEUED)
            .build();

    public static final Job NEWPROJECT = new JobBuilder()
            .withName("newProject")
            .withMachine(new MachineBuilder()
                    .withMachineName("TyPrinter")
                    .withMachineStatus(MachineStatus.ENABLED).build().getName())
            .withJobNote("This is newproject jobnote")
            .withDuration(2)
            .withPriority(Priority.HIGH)
            .withOwner(new PersonBuilder()
                    .withName("TianYuan")
                    .build())
            .withStatus(Status.FINISHED)
            .build();

    public static final Job BUMBERBEE = new JobBuilder()
            .withName("bumblebee")
            .withMachine(new MachineBuilder()
                    .withMachineName("BumberbeePrinter")
                    .withMachineStatus(MachineStatus.ENABLED).build().getName())
            .withJobNote("This is bumberbee jobnote")
            .withDuration(1)
            .withPriority(Priority.HIGH)
            .withOwner(new PersonBuilder()
                    .withName("Bumble bee")
                    .build())
            .withStatus(Status.CANCELLED)
            .build();
}
