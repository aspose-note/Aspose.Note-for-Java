package com.aspose.note.examples.tags;

import com.aspose.note.*;
import com.aspose.note.examples.Utils;

import java.io.IOException;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;

public class Reporting {
    public static void main(String[] args) throws IOException {
        generateReport_IncompleteItemsFromLastWeek();
        generateReport_IncompleteOutlookTasksForThisWeek();
        generateReport_ItemsRelatedToSpecifiedProject();
    }

    public static void generateReport_IncompleteItemsFromLastWeek() throws IOException
    {
        // ExStart:GenerateReport_IncompleteItemsFromLastWeek
        // ExSummary:Shows how to generate a pdf containing pages with items marked by incomplete checkboxes and created during last week.

        // The path to the documents directory.
        String dataDir = Utils.getSharedDataDir(Reporting.class) + "tags/";

        // Load the document into Aspose.Note.
        Document oneFile = new Document(Paths.get(dataDir, "ProjectNotes.one").toString());

        Document report = new Document();
        Date sevenDaysBefore = Date.from(Instant.now().minus(7, ChronoUnit.DAYS));
        for (Page page: oneFile)
        {
            List<ITaggable> tagged = page.getChildNodes(ITaggable.class);
            if (tagged.stream().anyMatch(e -> e.getTags().stream()
                                                         .filter(x -> x instanceof CheckBox)
                                                         .map(x -> (CheckBox)x)
                                                         .anyMatch(x -> !x.getChecked() && sevenDaysBefore.before(x.getCreationTime()))))
            {
                report.appendChildLast(page.deepClone());
            }
        }

        report.save(Paths.get(dataDir, "IncompleteLastWeekReport.pdf").toString());

        // ExEnd:GenerateReport_IncompleteItemsFromLastWeek
    }

    public static void generateReport_IncompleteOutlookTasksForThisWeek() throws IOException
    {
        // ExStart:GenerateReport_IncompleteOutlookTasksForThisWeek
        // ExSummary:Shows how to generate a pdf containing pages with Outlook incomplete tasks to complete on this week.

        // The path to the documents directory.
        String dataDir = Utils.getSharedDataDir(Reporting.class) + "tags/";

        // Load the document into Aspose.Note.
        Document oneFile = new Document(Paths.get(dataDir, "TagFile.one").toString());

        Document report = new Document();

        LocalDate now = LocalDate.now();
        LocalDate endOfWeek = LocalDate.now();
        endOfWeek = endOfWeek.minusDays(now.getDayOfWeek().getValue() - 5);

        Date endOfWeekDate = Date.from(endOfWeek.atStartOfDay().toInstant(ZoneId.systemDefault().getRules().getOffset(Instant.now())));
        Date sevenDaysBefore = Date.from(Instant.now().minus(7, ChronoUnit.DAYS));
        for (Page page: oneFile)
        {
            List<ITaggable> tagged = page.getChildNodes(ITaggable.class);
            if (tagged.stream()
                      .anyMatch(e -> e.getTags().stream()
                                                .filter(x -> x instanceof NoteTask)
                                                .map(x -> (NoteTask)x)
                                                .anyMatch(x -> !x.getChecked()
                                                       && sevenDaysBefore.before(x.getCreationTime())
                                                       && !endOfWeekDate.before(x.getDueDate()))))
            {
                report.appendChildLast(page.deepClone());
            }
        }

        report.save(Paths.get(dataDir, "IncompleteTasksForThisWeekReport.pdf").toString());

        // ExEnd:GenerateReport_IncompleteOutlookTasksForThisWeek
    }

    public static void generateReport_ItemsRelatedToSpecifiedProject() throws IOException
    {
        // ExStart:GenerateReport_ItemsRelatedToSpecifiedProject
        // ExSummary:Shows how to generate a pdf containing all pages related to 'Project A'.

        // The path to the documents directory.
        String dataDir = Utils.getSharedDataDir(Reporting.class) + "tags/";

        // Load the document into Aspose.Note.
        Document oneFile = new Document(Paths.get(dataDir, "ProjectNotes.one").toString());

        Document report = new Document();
        for (Page page : oneFile)
        {
            List<ITaggable> tagged = page.getChildNodes(ITaggable.class);
            if (tagged.stream().anyMatch(e -> e.getTags().stream().anyMatch(x -> x.getLabel().contains("Project A"))))
            {
                report.appendChildLast(page.deepClone());
            }
        }

        report.save(Paths.get(dataDir, "ProjectA_Report.pdf").toString());

        // ExEnd:GenerateReport_ItemsRelatedToSpecifiedProject
    }
}
