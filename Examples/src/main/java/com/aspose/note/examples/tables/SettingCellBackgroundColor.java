package com.aspose.note.examples.tables;

import java.awt.Color;
import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.OutlineElement;
import com.aspose.note.RichText;
import com.aspose.note.TableCell;
import com.aspose.note.TableRow;
import com.aspose.note.TextStyle;
import com.aspose.note.examples.Utils;

public class SettingCellBackgroundColor {
	public static void main(String... args) throws IOException {
		// Load the document into Aspose.Note.
		String dataDir = Utils.getSharedDataDir(SettingCellBackgroundColor.class) + "tables/";

		Document doc = new Document();

		// Initialize Page class object
		com.aspose.note.Page page = new com.aspose.note.Page(doc);

		// Initialize TableRow class object
		TableRow row1 = new TableRow(doc);
		// Initialize TableCell class object and set text content
		TableCell cell11 = new TableCell(doc);
		cell11.appendChild(GetOutlineElementWithText(doc, "Small text"));
		cell11.setBackgroundColor(Color.BLACK);
		row1.appendChild(cell11);
	}

	private static OutlineElement GetOutlineElementWithText(Document doc, String string) {
		// TODO Auto-generated method stub
		OutlineElement outlineElem = new OutlineElement(doc);
		TextStyle textStyle = new TextStyle();
		textStyle.setFontColor(Color.BLACK);
		textStyle.setFontName("Arial");
		textStyle.setFontSize(10);
		RichText richText = new RichText(doc);
		richText.setText(string);
		richText.setDefaultStyle(textStyle);
		outlineElem.appendChild(richText);
		return outlineElem;
	}
}
