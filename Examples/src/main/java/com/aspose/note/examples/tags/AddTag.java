package com.aspose.note.examples.tags;

import java.awt.Color;
import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.NoteTag;
import com.aspose.note.Outline;
import com.aspose.note.OutlineElement;
import com.aspose.note.Page;
import com.aspose.note.RichText;
import com.aspose.note.SaveFormat;
import com.aspose.note.TagIcon;
import com.aspose.note.ParagraphStyle;
import com.aspose.note.examples.Utils;

public class AddTag {
	public static void main(String... args) throws IOException {
		// ExStart:AddTag
		String dataDir = Utils.getSharedDataDir(AddTag.class) + "tags/";
		
		// create an object of the Document class
		Document doc = new Document();

		// initialize Page class object
		Page page = new Page();

		// initialize Outline class object
		Outline outline = new Outline();

		// initialize OutlineElement class object
		OutlineElement outlineElem = new OutlineElement();
		ParagraphStyle textStyle = new ParagraphStyle();
		textStyle.setFontColor(Color.black);
		textStyle.setFontName("Arial");
		textStyle.setFontSize(10);

		RichText text = new RichText();
		text.setText("OneNote text.");
		text.setParagraphStyle(textStyle);

		NoteTag noteTag = NoteTag.createYellowStar();
		text.getTags().add(noteTag);

		// add text node
		outlineElem.appendChildLast(text);
		// add outline element node
		outline.appendChildLast(outlineElem);
		// add outline node
		page.appendChildLast(outline);
		// add page node
		doc.appendChildLast(page);

		doc.save(dataDir + "AddTag_out.pdf", SaveFormat.Pdf);
		System.out.printf("File Saved: %s\n", dataDir + "AddTag_out.pdf");
		// ExEnd:AddTag
	}
}
