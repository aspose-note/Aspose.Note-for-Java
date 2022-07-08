package com.aspose.note.examples.text;

import java.awt.Color;
import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.NumberFormat;
import com.aspose.note.NumberList;
import com.aspose.note.Outline;
import com.aspose.note.OutlineElement;
import com.aspose.note.Page;
import com.aspose.note.RichText;
import com.aspose.note.ParagraphStyle;
import com.aspose.note.examples.Utils;

public class CreateChineseNumberedList {
	public static void main(String... args) throws IOException {
		// ExStart:CreateChineseNumberedList
		String dataDir = Utils.getSharedDataDir(CreateChineseNumberedList.class) + "text/";

		// create an object of the Document class
		Document doc = new Document();

		// initialize Page class object
		Page page = new Page();

		// initialize Outline class object
		Outline outline = new Outline();

		// initialize TextStyle class object and set formatting properties
		ParagraphStyle defaultStyle = new ParagraphStyle()
											.setFontColor(Color.black)
											.setFontName("Arial")
											.setFontSize(10);

		// initialize OutlineElement class objects and apply numbering
		// numbers in the same outline are automatically incremented.
		OutlineElement outlineElem1 = new OutlineElement();

		outlineElem1.setNumberList(new NumberList("{0})", NumberFormat.ChineseCounting, "Arial", 10));

		RichText text1 = new RichText();
		text1.setText("First");
		text1.setParagraphStyle(defaultStyle);
		outlineElem1.appendChildLast(text1);

		OutlineElement outlineElem2 = new OutlineElement();
		outlineElem2.setNumberList(new NumberList("{0})", NumberFormat.ChineseCounting, "Arial", 10));
		RichText text2 = new RichText();
		text2.setText("Second");
		text2.setParagraphStyle(defaultStyle);
		outlineElem2.appendChildLast(text2);

		OutlineElement outlineElem3 = new OutlineElement();
		outlineElem3.setNumberList(new NumberList("{0})", NumberFormat.ChineseCounting, "Arial", 10));
		RichText text3 = new RichText();
		text3.setText("Third");
		text3.setParagraphStyle(defaultStyle);
		outlineElem3.appendChildLast(text3);

		// add outline elements
		outline.appendChildLast(outlineElem1);
		outline.appendChildLast(outlineElem2);
		outline.appendChildLast(outlineElem3);

		// add Outline node
		page.appendChildLast(outline);

		// add Page node
		doc.appendChildLast(page);

		// save the document
		doc.save(dataDir + "CreateChineseNumberedList_out.pdf");
		// ExEnd:CreateChineseNumberedList
		System.out.printf("File saved: %s\n", dataDir + "CreateChineseNumberedList_out.pdf");

	}
}
