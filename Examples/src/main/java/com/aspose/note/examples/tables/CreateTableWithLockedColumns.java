package com.aspose.note.examples.tables;

import com.aspose.note.*;
import com.aspose.note.examples.Utils;

import java.io.IOException;

public class CreateTableWithLockedColumns {
    public static void main(String[] args) throws IOException {
        // ExStart:CreateTableWithLockedColumns

        String dataDir = Utils.getSharedDataDir(CreateTableWithLockedColumns.class) + "tables\\";

        // Create an object of the Document class
        Document doc = new Document();

        // Initialize Page class object
        Page page = new Page();

        // Initialize TableRow class object
        TableRow row1 = new TableRow();

        // Initialize TableCell class object and set text content
        TableCell cell11 = new TableCell();
        cell11.appendChildLast(InsertTable.GetOutlineElementWithText("Small text"));
        row1.appendChildLast(cell11);

        // Initialize TableRow class object
        TableRow row2 = new TableRow();

        // Initialize TableCell class object and set text content
        TableCell cell21 = new TableCell();
        cell21.appendChildLast(InsertTable.GetOutlineElementWithText("Long   text    with    several   words and    spaces."));
        row2.appendChildLast(cell21);

        // Initialize Table class object
        Table table = new Table();
        table.setBordersVisible(true);

        TableColumn col = new TableColumn();
        col.setWidth(200);
        col.setLockedWidth(true);

        table.getColumns().addItem(col);

        // Add rows
        table.appendChildLast(row1);
        table.appendChildLast(row2);

        Outline outline = new Outline();
        OutlineElement outlineElem = new OutlineElement();

        // Add table node
        outlineElem.appendChildLast(table);

        // Add outline element node
        outline.appendChildLast(outlineElem);

        // Add outline node
        page.appendChildLast(outline);

        // Add page node
        doc.appendChildLast(page);
        dataDir = dataDir + "CreateTableWithLockedColumns_out.one";
        doc.save(dataDir);
        // ExEnd:CreateTableWithLockedColumns
    }
}
