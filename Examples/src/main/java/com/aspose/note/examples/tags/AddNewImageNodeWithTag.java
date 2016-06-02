package com.aspose.note.examples.tags;

import com.aspose.note.*;
import com.aspose.note.Document;
import java.io.IOException;
import com.aspose.note.LoadOptions;
import com.aspose.note.examples.Utils;
import java.nio.file.Path;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AddNewImageNodeWithTag {
	public static void main(String... args) throws IOException {

		// ExStart:AddNewImageNodeWithTag

		String inputFile = "Input.jpg";
		Path inputPath = Utils.getPath(AddNewImageNodeWithTag.class, inputFile);

		String outputFile = "Output.pdf";
		Path outputPath = Utils.getPath(AddNewImageNodeWithTag.class, outputFile);

		// create an object of the Document class
		Document doc = new Document();
		// initialize Page class object
		Page page = new Page(doc);
		// initialize Outline class object
		Outline outline = new Outline(doc);
		// initialize OutlineElement class object
		OutlineElement outlineElem = new OutlineElement(doc);
		// load an image
		Image image = new Image(doc, inputPath.toString());
		// insert image in the document node
		outlineElem.appendChild(image);
		NoteTag noteTag = new NoteTag();
		noteTag.setIcon(TagIcon.YellowStar);
		image.getTags().add(noteTag);

		// add outline element node
		outline.appendChild(outlineElem);
		// add outline node
		page.appendChild(outline);
		// add page node
		doc.appendChild(page);
		// save OneNote document
		doc.save(outputPath.toString(), SaveFormat.Pdf);

		// ExEnd:AddNewImageNodeWithTag
	}

}
