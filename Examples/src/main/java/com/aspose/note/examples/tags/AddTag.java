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
import com.aspose.note.TextStyle;
import com.aspose.note.examples.Utils;

public class AddTag {
	public static void main(String... args) throws IOException {

		String dataDir = Utils.getSharedDataDir(AddTag.class) + "tags/";
		
		// create an object of the Document class
		Document doc = new Document();

		// initialize Page class object
		Page page = new Page(doc);

		// initialize Outline class object
		Outline outline = new Outline(doc);

		// initialize OutlineElement class object
		OutlineElement outlineElem = new OutlineElement(doc);
		TextStyle textStyle = new TextStyle();
		textStyle.setFontColor(Color.black);
		textStyle.setFontName("Arial");
		textStyle.setFontSize(10);

		RichText text = new RichText(doc);
		text.setText("OneNote text.");
		text.setDefaultStyle(textStyle);

		NoteTag noteTag = new NoteTag();
		noteTag.setIcon(TagIcon.YellowStar);
		text.getTags().addItem(noteTag);

		// add text node
		outlineElem.appendChild(text);
		// add outline element node
		outline.appendChild(outlineElem);
		// add outline node
		page.appendChild(outline);
		// add page node
		doc.appendChild(page);

		doc.save(dataDir + "AddTag_out.pdf", SaveFormat.Pdf);
		System.out.printf("File Saved: %s\n", dataDir + "AddTag_out.pdf");

	}
}
