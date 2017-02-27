package com.aspose.note.examples.tables;

import com.aspose.note.*;
import com.aspose.note.examples.Utils;
import sun.security.tools.keytool.Resources_it;

import java.awt.*;
import java.io.IOException;

public class InsertTable {
    public static void main(String[] args) throws IOException {
        // ExStart:InsertTable
        // The path to th documents directory.
        String dataDir = Utils.getSharedDataDir(InsertTable.class) + "tables\\";

        Document doc = new Document();

        // Initialize Page class object
        Page page = new Page(doc);

        // Initialize TableRow class object
        TableRow row1 = new TableRow(doc);

        // Initialize TableCell class objects
        TableCell cell11 = new TableCell(doc);
        TableCell cell12 = new TableCell(doc);
        TableCell cell13 = new TableCell(doc);

        // Append outline elements in the table cell
        cell11.appendChild(GetOutlineElementWithText(doc, "cell_1.1"));
        cell12.appendChild(GetOutlineElementWithText(doc, "cell_1.2"));
        cell13.appendChild(GetOutlineElementWithText(doc, "cell_1.3"));

        // Table cells to rows
        row1.appendChild(cell11);
        row1.appendChild(cell12);
        row1.appendChild(cell13);

        // Initialize TableRow class object
        TableRow row2 = new TableRow(doc);

        // initialize TableCell class objects
        TableCell cell21 = new TableCell(doc);
        TableCell cell22 = new TableCell(doc);
        TableCell cell23 = new TableCell(doc);

        // Append outline elements in the table cell
        cell21.appendChild(GetOutlineElementWithText(doc, "cell_2.1"));
        cell22.appendChild(GetOutlineElementWithText(doc, "cell_2.2"));
        cell23.appendChild(GetOutlineElementWithText(doc, "cell_2.3"));

        // Append table cells to rows
        row2.appendChild(cell21);
        row2.appendChild(cell22);
        row2.appendChild(cell23);

        // Initialize Table class object and set column widths
        Table table = new Table(doc);
        table.setBordersVisible(true);
        TableColumn col = new TableColumn();
        col.setWidth(200);

        table.getColumns().addItem(col);
        table.getColumns().addItem(col);
        table.getColumns().addItem(col);

        // Append table rows to table
        table.appendChild(row1);
        table.appendChild(row2);

        // Initialize Outline object
        Outline outline = new Outline(doc);

        // Initialize OutlineElement object
        OutlineElement outlineElem = new OutlineElement(doc);

        // Add table to outline element node
        outlineElem.appendChild(table);

        // Add outline element to outline
        outline.appendChild(outlineElem);

        // Add outline to page node
        page.appendChild(outline);

        // Add page to document node
        doc.appendChild(page);
        dataDir = dataDir + "InsertTable_out.one";
        doc.save(dataDir);
        // ExEnd:InsertTable
    }

    // ExStart:GetOutlineElementWithText
    public static OutlineElement GetOutlineElementWithText(Document doc, String text)
    {
        OutlineElement outlineElem = new OutlineElement(doc);
        TextStyle textStyle = new TextStyle();
        textStyle.setFontColor(Color.BLACK);
        textStyle.setFontName("Arial");
        textStyle.setFontSize(10);;

        RichText richText = new RichText(doc);
        richText.setText(text);
        richText.setDefaultStyle(textStyle);

        outlineElem.appendChild(richText);
        return outlineElem;
    }
    // ExEnd:GetOutlineElementWithText
}
