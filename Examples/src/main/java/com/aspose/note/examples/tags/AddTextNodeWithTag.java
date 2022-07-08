package com.aspose.note.examples.tags;

import java.awt.Color;
import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.NoteTag;
import com.aspose.note.Outline;
import com.aspose.note.OutlineElement;
import com.aspose.note.Page;
import com.aspose.note.RichText;
import com.aspose.note.TagIcon;
import com.aspose.note.ParagraphStyle;
import com.aspose.note.examples.Utils;

public class AddTextNodeWithTag {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// ExStart:AddTextNodeWithTag
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(AddTextNodeWithTag.class) + "tags/";

		// Create an object of the Document class
		Document doc = new Document();
		// Initialize Page class object
		Page page = new Page();
		// Initialize Outline class object
		Outline outline = new Outline();
		// Initialize OutlineElement class object
		OutlineElement outlineElem = new OutlineElement();

		ParagraphStyle textStyle = new ParagraphStyle()
											.setFontColor(Color.BLACK)
											.setFontName("Arial")
											.setFontSize(10);

		RichText text = new RichText();
		text.setText("OneNote text.");
		text.setParagraphStyle(textStyle);

		NoteTag noteTag = NoteTag.createYellowStar();
		text.getTags().add(noteTag);

		// Add text node
		outlineElem.appendChildLast(text);
		// Add outline element node
		outline.appendChildLast(outlineElem);
		// Add outline node
		page.appendChildLast(outline);
		// Add page node
		doc.appendChildLast(page);

		dataDir = dataDir + "AddTextNodeWithTag_out.one";
		// Save OneNote document
		doc.save(dataDir);
		// ExEnd:AddTextNodeWithTag
	}
}
