package com.aspose.note.examples.images;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.HorizontalAlignment;
import com.aspose.note.Image;
import com.aspose.note.Outline;
import com.aspose.note.OutlineElement;
import com.aspose.note.Page;
import com.aspose.note.SaveFormat;
import com.aspose.note.examples.Utils;

public class NewOneNotedocument {
	public static void main(String... args) throws IOException {
		
		String dataDir = Utils.getSharedDataDir(NewOneNotedocument.class) + "images/";
		// create an object of the Document class
		Document doc = new Document();
		// initialize Page class object
		Page page = new Page(doc);
		// initialize Outline class object and set offset properties
		Outline outline = new Outline(doc);
		outline.setVerticalOffset(0);
		outline.setHorizontalOffset(0);
		// initialize OutlineElement class object
		OutlineElement outlineElem = new OutlineElement(doc);
		// load an image by the file path.
		Image image = new Image(doc, dataDir + "Input.jpg");
		// set image alignment
		image.setAlignment(HorizontalAlignment.Right);
		// add image
		outlineElem.appendChildLast(image);
		// add outline elements
		outline.appendChildLast(outlineElem);
		// add Outline node
		page.appendChildLast(outline);
		// add Page node
		doc.appendChildLast(page);
		// save OneNote document
		// save the document in the *.one format.
		try {
			// oneFile.save("D://Aspose_JavaProjects//OneNote//out.one");//NOT
			// working
			doc.save(dataDir + "NewOneNotedocument_out", SaveFormat.Pdf);// WORKING
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
