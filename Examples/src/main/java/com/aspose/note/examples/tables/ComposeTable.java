package com.aspose.note.examples.tables;

import com.aspose.note.*;
import com.aspose.note.examples.Utils;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.stream.StreamSupport;

public class ComposeTable {
    public static void main(String... args) throws IOException {
        // ExStart:ComposeTable
        String dataDir = Paths.get(Utils.getSharedDataDir(CreateTableWithLockedColumns.class), "tables").toString();


        RichText headerText = new RichText().append("Super contest for suppliers.");
        headerText.setParagraphStyle(new ParagraphStyle().setFontSize(18).setBold(true));
        headerText.setAlignment(HorizontalAlignment.Center);


        Page page = new Page();
        Outline outline = page.appendChildLast(new Outline());
        outline.setHorizontalOffset(50);
        outline.appendChildLast(new OutlineElement()).appendChildLast(headerText);

        // Summary text before table
        RichText bodyTextHeader = outline.appendChildLast(new OutlineElement()).appendChildLast(new RichText());
        bodyTextHeader.setParagraphStyle(ParagraphStyle.getDefault());
        bodyTextHeader.append("This is the final ranking of proposals got from our suppliers.");

        Table ranking = outline.appendChildLast(new OutlineElement()).appendChildLast(new Table());
        TableRow headerRow = ranking.appendChildFirst(new TableRow());

        ParagraphStyle headerStyle = ParagraphStyle.getDefault().setBold(true);

        // Let's add a set of columns and a header row.
        Color backGroundColor = Color.lightGray;
        for (String header : new String[] { "Supplier", "Contacts", "Score A", "Score B", "Score C", "Final score", "Attached materials", "Comments" })
        {
            ranking.getColumns().addItem(new TableColumn());

            TableCell cell = new TableCell();
            cell.setBackgroundColor(backGroundColor);
            RichText richText = headerRow.appendChildLast(cell)
                                         .appendChildLast(new OutlineElement())
                                         .appendChildLast(new RichText()).append(header);
            richText.setParagraphStyle(headerStyle);
        }

        // Let's 5 empty rows. Rows have interchanging background color.
        Boolean backgroundColorFlag = true;
        for (int i = 0; i < 5; i++)
        {
            backgroundColorFlag = !backgroundColorFlag;

            TableRow row = ranking.appendChildLast(new TableRow());
            for (int j = 0; j < ranking.getColumns().size(); j++)
            {
                TableCell cell = new TableCell();

                if (backgroundColorFlag)
                {
                    cell.setBackgroundColor(backGroundColor);
                }

                row.appendChildLast(cell)
                   .appendChildLast(new OutlineElement())
                   .appendChildLast(new RichText()).setParagraphStyle(ParagraphStyle.getDefault());
            }
        }

        // Let's add some template for content in 'Contacts' column.
        StreamSupport.stream(ranking.spliterator(), false).skip(1).forEach(
                row ->
                {
                    // Take second element of the row.
                    TableCell contactsCell = StreamSupport.stream(row.spliterator(), false).skip(1).findFirst().get();

                    contactsCell.appendChildLast(new OutlineElement())
                            .appendChildLast(new RichText())
                            .append("Web: ").append("link", new TextStyle().setHyperlinkAddress("www.link.com")).setParagraphStyle(ParagraphStyle.getDefault());
                    contactsCell.appendChildLast(new OutlineElement())
                            .appendChildLast(new RichText())
                            .append("E-mail: ").append("mail", new TextStyle().setHyperlinkAddress("mailto:hi@link.com")).setParagraphStyle(ParagraphStyle.getDefault());
                });

        Document d = new Document();
        d.appendChildLast(page);
        d.save(Paths.get(dataDir, "ComposeTable_out.one").toString());

        // ExEnd:ComposeTable
        System.out.println("\nThe document is composed successfully.");
    }
}
