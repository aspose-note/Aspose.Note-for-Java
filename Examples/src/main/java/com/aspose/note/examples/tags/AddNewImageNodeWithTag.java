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
		// ExStart:AddNewImageNodeWithTag
		String dataDir = Utils.getSharedDataDir(AddNewImageNodeWithTag.class) + "tags/";

		// create an object of the Document class
		Document doc = new Document();
		// initialize Page class object
		Page page = new Page();
		// initialize Outline class object
		Outline outline = new Outline();
		// initialize OutlineElement class object
		OutlineElement outlineElem = new OutlineElement();
		// load an image
		Image image = new Image(null, dataDir + "Input.jpg");
		// insert image in the document node
		outlineElem.appendChildLast(image);
		NoteTag noteTag = NoteTag.createYellowStar();
		image.getTags().add(noteTag);

		// add outline element node
		outline.appendChildLast(outlineElem);
		// add outline node
		page.appendChildLast(outline);
		// add page node
		doc.appendChildLast(page);
		// save OneNote document
		doc.save(dataDir + "AddNewImageNodeWithTag_out.pdf", SaveFormat.Pdf);
		// ExEnd:AddNewImageNodeWithTag
	}

}
