package com.aspose.note.examples.introduction;

import java.awt.Color;
import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.Outline;
import com.aspose.note.OutlineElement;
import com.aspose.note.Page;
import com.aspose.note.RichText;
import com.aspose.note.SaveFormat;
import com.aspose.note.ParagraphStyle;
import com.aspose.note.examples.Utils;

public class CreateOneNoteDocumentWithSimpleRichText {

	public static void main(String... args) throws IOException {
		// ExStart:CreateDocWithSimpleRichText
		String dataDir = Utils.getSharedDataDir(CreateOneNoteDocumentWithSimpleRichText.class) + "introduction/";

		// For complete examples and data files, please go to
		// https://github.com/aspose-note/Aspose.Note-for-Java
		// create an object of the Document class
		Document doc = new Document();
		// initialize Page class object
		Page page = new Page();
		// initialize Outline class object
		Outline outline = new Outline();
		// initialize OutlineElement class object
		OutlineElement outlineElem = new OutlineElement();

		// initialize ParagraphStyle class object and set formatting properties
		ParagraphStyle textStyle = new ParagraphStyle()
											.setFontColor(Color.black)
											.setFontName("Arial")
											.setFontSize(10);

		// initialize RichText class object and apply text style
		RichText text = new RichText().append("Hello OneNote text!");
		text.setParagraphStyle(textStyle);

		// add RichText node
		outlineElem.appendChildLast(text);
		// add OutlineElement node
		outline.appendChildLast(outlineElem);
		// add Outline node
		page.appendChildLast(outline);
		// add Page node
		doc.appendChildLast(page);
		// save OneNote document
		doc.save(dataDir + "CreateOneNoteDocumentWithSimpleRichText_out.pdf", SaveFormat.Pdf);
		// ExEnd:CreateDocWithSimpleRichText
	}
}
