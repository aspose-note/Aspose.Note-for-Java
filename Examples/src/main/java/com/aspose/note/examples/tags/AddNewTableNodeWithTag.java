package com.aspose.note.examples.tags;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.NoteTag;
import com.aspose.note.Outline;
import com.aspose.note.OutlineElement;
import com.aspose.note.Page;
import com.aspose.note.SaveFormat;
import com.aspose.note.Table;
import com.aspose.note.TableCell;
import com.aspose.note.TableColumn;
import com.aspose.note.TableRow;
import com.aspose.note.TagIcon;
import com.aspose.note.examples.Utils;

public class AddNewTableNodeWithTag {
	public static void main(String... args) throws IOException {
		String dataDir = Utils.getSharedDataDir(AddNewTableNodeWithTag.class) + "tags/";
		// create an object of the Document class
		Document doc = new Document();
		// initialize Page class object
		Page page = new Page(doc);
		// initialize TableRow class object
		TableRow row = new TableRow(doc);
		// initialize TableCell class object
		TableCell cell = new TableCell(doc);
		// add cell to row node
		row.appendChild(cell);
		// initialize table node
		Table table = new Table(doc);
		table.setBordersVisible(true);
		TableColumn column = new TableColumn();
		column.setWidth(70);
		table.getColumns().addItem(column);

		// insert row node in table
		table.appendChild(row);
		// add tag to this table node
		NoteTag noteTag = new NoteTag();
		noteTag.setIcon(TagIcon.QuestionMark);
		table.getTags().add(noteTag);

		Outline outline = new Outline(doc);
		OutlineElement outlineElem = new OutlineElement(doc);
		// add table node
		outlineElem.appendChild(table);
		// add outline elements
		outline.appendChild(outlineElem);
		page.appendChild(outline);
		doc.appendChild(page);
		// save OneNote document
		doc.save("AddNewTableNodeWithTag_out.pdf", SaveFormat.Pdf);
	}
}
