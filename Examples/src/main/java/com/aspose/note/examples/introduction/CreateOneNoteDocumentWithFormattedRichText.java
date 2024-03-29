package com.aspose.note.examples.introduction;

import java.awt.Color;
import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.Outline;
import com.aspose.note.OutlineElement;
import com.aspose.note.Page;
import com.aspose.note.RichText;
import com.aspose.note.SaveFormat;
import com.aspose.note.TextStyle;
import com.aspose.note.ParagraphStyle;
import com.aspose.note.Title;
import com.aspose.note.examples.Utils;

public class CreateOneNoteDocumentWithFormattedRichText {
	public static void main(String... args) throws IOException {
		// ExStart:CreateDocWithFormattedRichText
		String dataDir = Utils.getSharedDataDir(CreateOneNoteDocumentWithFormattedRichText.class) + "introduction/";

		// For complete examples and data files, please go to
		// https://github.com/aspose-note/Aspose.Note-for-Java
		// create an object of the Document class
		Document doc = new Document();
		// initialize Page class object
		Page page = new Page();
		// initialize Title class object
		Title title = new Title();
		// initialize TextStyle class object and set formatting properties
		ParagraphStyle defaultTextStyle = new ParagraphStyle()
												.setFontColor(Color.black)
												.setFontName("Arial")
												.setFontSize(10);

		RichText titleText = new RichText().append("Title!");
		titleText.setParagraphStyle(defaultTextStyle);

		// titleText.setTitleText(true);
		// IsTitleText = true

		Outline outline = new Outline();
		outline.setVerticalOffset(100);
		outline.setHorizontalOffset(100);

		OutlineElement outlineElem = new OutlineElement();

		TextStyle textStyleForHelloWord = new TextStyle()
												.setFontColor(Color.red)
												.setFontName("Arial")
												.setFontSize(10);

		TextStyle textStyleForOneNoteWord = new TextStyle()
												.setFontColor(Color.green)
												.setFontName("Calibri")
												.setFontSize(10)
												.setItalic(true);

		TextStyle textStyleForTextWord = new TextStyle()
												.setFontColor(Color.blue)
												.setFontName("Arial")
												.setFontSize(15)
												.setBold(true)
												.setItalic(true);

		RichText text = new RichText()
				.append("Hello", textStyleForHelloWord)
				.append(" OneNote", textStyleForOneNoteWord)
				.append(" text", textStyleForTextWord)
				.append("!", TextStyle.getDefault());
		text.setParagraphStyle(defaultTextStyle);

		title.setTitleText(titleText);
		// set page title
		page.setTitle(title);
		// add RichText node
		outlineElem.appendChildLast(text);
		// add OutlineElement node
		outline.appendChildLast(outlineElem);
		// add Outline node
		page.appendChildLast(outline);
		// add Page node
		doc.appendChildLast(page);
		// save OneNote document
		doc.save(dataDir + "CreateOneNoteDocument_out.pdf", SaveFormat.Pdf);
		// ExEnd:CreateDocWithFormattedRichText
	}
}
