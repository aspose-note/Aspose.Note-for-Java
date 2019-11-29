package com.aspose.note.examples.tags;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.Image;
import com.aspose.note.NoteTag;
import com.aspose.note.Outline;
import com.aspose.note.OutlineElement;
import com.aspose.note.Page;
import com.aspose.note.SaveFormat;
import com.aspose.note.TagIcon;
import com.aspose.note.examples.Utils;

public class AddNewImageNodeWithTag {
	public static void main(String... args) throws IOException {

		String dataDir = Utils.getSharedDataDir(AddNewImageNodeWithTag.class) + "tags/";

		// create an object of the Document class
		Document doc = new Document();
		// initialize Page class object
		Page page = new Page(doc);
		// initialize Outline class object
		Outline outline = new Outline(doc);
		// initialize OutlineElement class object
		OutlineElement outlineElem = new OutlineElement(doc);
		// load an image
		Image image = new Image(doc, dataDir + "Input.jpg");
		// insert image in the document node
		outlineElem.appendChildLast(image);
		NoteTag noteTag = new NoteTag();
		noteTag.setIcon(TagIcon.YellowStar);
		image.getTags().add(noteTag);

		// add outline element node
		outline.appendChildLast(outlineElem);
		// add outline node
		page.appendChildLast(outline);
		// add page node
		doc.appendChildLast(page);
		// save OneNote document
		doc.save(dataDir + "AddNewImageNodeWithTag_out.pdf", SaveFormat.Pdf);

	}

}
