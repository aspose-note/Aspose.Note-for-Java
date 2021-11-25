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
		// ExStart:AddNewTableNodeWithTag
		String dataDir = Utils.getSharedDataDir(AddNewTableNodeWithTag.class) + "tags/";
		// create an object of the Document class
		Document doc = new Document();
		// initialize Page class object
		Page page = new Page();
		// initialize TableRow class object
		TableRow row = new TableRow();
		// initialize TableCell class object
		TableCell cell = new TableCell();
		// add cell to row node
		row.appendChildLast(cell);
		// initialize table node
		Table table = new Table();
		table.setBordersVisible(true);
		TableColumn column = new TableColumn();
		column.setWidth(70);
		table.getColumns().addItem(column);

		// insert row node in table
		table.appendChildLast(row);
		// add tag to this table node
		NoteTag noteTag = NoteTag.createQuestionMark();
		table.getTags().add(noteTag);

		Outline outline = new Outline();
		OutlineElement outlineElem = new OutlineElement();
		// add table node
		outlineElem.appendChildLast(table);
		// add outline elements
		outline.appendChildLast(outlineElem);
		page.appendChildLast(outline);
		doc.appendChildLast(page);
		// save OneNote document
		doc.save(dataDir + "AddNewTableNodeWithTag_out.pdf", SaveFormat.Pdf);
		// ExEnd:AddNewTableNodeWithTag
	}
}
