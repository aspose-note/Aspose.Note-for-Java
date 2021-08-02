package com.aspose.note.examples.tables;

import com.aspose.note.*;
import com.aspose.note.examples.Utils;

import java.awt.Color;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;


public class ChangeTableStyle {
    private static void setRowStyle(TableRow row, Color highlightColor, boolean bold, boolean italic) {
        for (TableCell cell: row)
        {
            cell.setBackgroundColor(highlightColor);

            for (RichText node: cell.getChildNodes(RichText.class))
            {
                node.getParagraphStyle().setBold(bold);
                node.getParagraphStyle().setItalic(italic);

                for (TextStyle style: node.getStyles())
                {
                    style.setBold(bold);
                    style.setItalic(italic);
                }
            }
        }
    }

    public static void main(String... args) throws IOException {
        // ExStart:ChangeTableStyle
        String dataDir = Utils.getSharedDataDir(CreateTableWithLockedColumns.class) + "tables\\";

        // Load the document into Aspose.Note.
        Document document = new Document(dataDir + "ChangeTableStyleIn.one");

        // Get a list of table nodes
        List<Table> nodes = document.getChildNodes(Table.class);

        for (Table table: nodes)
        {
            setRowStyle(table.getFirstChild(), Color.GRAY, true, true);

            // Highlight first row after head.
            boolean flag = false;
            List<TableRow> rows = table.getChildren();
            for (int i = 1; i < rows.size(); ++i)
            {
                setRowStyle(rows.get(i), flag ? Color.lightGray : new java.awt.Color(-1, true), false, false);

                flag = !flag;
            }
        }

        document.save(Paths.get(dataDir, "ChangeTableStyleOut.one").toString());

        // ExEnd:ChangeTableStyle
        System.out.println("\nTable's style is updated successfully.\nFile saved at " + dataDir);
    }
}
