package com.aspose.note.examples.tables;

import java.awt.Color;
import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.OutlineElement;
import com.aspose.note.RichText;
import com.aspose.note.TableCell;
import com.aspose.note.TableRow;
import com.aspose.note.ParagraphStyle;

public class SettingCellBackgroundColor {
	public static void main(String... args) throws IOException {
		// ExStart:SettingCellBackGroundColor
		// Load the document into Aspose.Note.
		Document doc = new Document();

		// Initialize TableRow class object
		TableRow row1 = new TableRow();
		// Initialize TableCell class object and set text content
		TableCell cell11 = new TableCell();
		cell11.appendChildLast(GetOutlineElementWithText("Small text"));
		cell11.setBackgroundColor(Color.BLACK);
		row1.appendChildLast(cell11);
		// ExEnd:SettingCellBackGroundColor
	}

	// ExStart:GetOutlineElementWithText
	private static OutlineElement GetOutlineElementWithText(String string) {
		// TODO Auto-generated method stub
		OutlineElement outlineElem = new OutlineElement();
		ParagraphStyle textStyle = new ParagraphStyle()
										.setFontColor(Color.BLACK)
										.setFontName("Arial")
										.setFontSize(10);
		RichText richText = new RichText();
		richText.setText(string);
		richText.setParagraphStyle(textStyle);
		outlineElem.appendChildLast(richText);
		return outlineElem;
	}
	// ExEnd:GetOutlineElementWithText
}
