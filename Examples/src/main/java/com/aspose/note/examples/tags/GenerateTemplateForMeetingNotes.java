package com.aspose.note.examples.tags;

import com.aspose.note.*;
import com.aspose.note.examples.Utils;

import java.io.IOException;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;

public class GenerateTemplateForMeetingNotes {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        // ExStart:GenerateTemplateForMeetingNotes
        // The path to the documents directory.
        String dataDir = Utils.getSharedDataDir(GenerateTemplateForMeetingNotes.class) + "tags/";

        // Create an object of the Document class
        ParagraphStyle headerStyle = new ParagraphStyle();
        headerStyle.setFontName("Calibri");
        headerStyle.setFontSize(16);
        ParagraphStyle bodyStyle = new ParagraphStyle();
        bodyStyle.setFontName("Calibri");
        bodyStyle.setFontSize(12);

        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);

        Document d = new Document();
        boolean restartFlag = true;

        RichText titleText = new RichText();
        titleText.setText(String.format("Weekly meeting %s", dateFormat.format(Date.from(Instant.now()))));
        titleText.setParagraphStyle(ParagraphStyle.getDefault());

        Title title = new Title();
        title.setTitleText(titleText);

        Page page = new Page();
        page.setTitle(title);
        d.appendChildLast(page);

        Outline outline = page.appendChildLast(new Outline());
        outline.setVerticalOffset(30);
        outline.setHorizontalOffset(30);

        RichText richText = outline.appendChildLast(new OutlineElement()).appendChildLast(new RichText());
        richText.setText("Important");
        richText.setParagraphStyle(headerStyle);
        for (String e: new String[] { "First", "Second", "Third" })
        {
            OutlineElement outlineElement = outline.appendChildLast(new OutlineElement());
            outlineElement.setNumberList(createListNumberingStyle(bodyStyle, restartFlag));

            richText = outlineElement.appendChildLast(new RichText());
            richText.setText(e);
            richText.setParagraphStyle(bodyStyle);

            restartFlag = false;
        }


        richText = outline.appendChildLast(new OutlineElement()).appendChildLast(new RichText());
        richText.setText("TO DO");
        richText.setParagraphStyle(headerStyle);
        richText.setSpaceBefore(15);
        restartFlag = true;
        for (String e: new String[] { "First", "Second", "Third" })
        {
            OutlineElement outlineElement = outline.appendChildLast(new OutlineElement());
            outlineElement.setNumberList(createListNumberingStyle(bodyStyle, restartFlag));

            richText = outlineElement.appendChildLast(new RichText());
            richText.setText(e);
            richText.setParagraphStyle(bodyStyle);
            richText.getTags().add(NoteCheckBox.createBlueCheckBox());

            restartFlag = false;
        }

        // Save OneNote document
        d.save(Paths.get(dataDir, "meetingNotes.one").toString());

        // ExEnd:GenerateTemplateForMeetingNotes
    }

    private static NumberList createListNumberingStyle(ParagraphStyle bodyStyle, boolean restart)
    {
        NumberList r = new NumberList("{0}.", NumberFormat.DecimalNumbers, bodyStyle.getFontName(), bodyStyle.getFontSize());
        r.setRestart(restart ? 1 : 0);
        return r;
    }
}
