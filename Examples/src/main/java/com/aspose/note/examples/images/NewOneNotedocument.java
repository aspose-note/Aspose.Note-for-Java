package com.aspose.note.examples.images;

import com.aspose.note.*;
import com.aspose.note.Document;
import java.io.IOException;
import com.aspose.note.LoadOptions;
import com.aspose.note.examples.Utils;
import java.nio.file.Path;

public class NewOneNotedocument {
	public static void main(String... args) throws IOException {

		String inputFile = "Input.jpg";
		Path inputPath = Utils.getPath(NewOneNotedocument.class, inputFile);

		String outputFile = "Output.pdf";
		Path outputPath = Utils.getPath(NewOneNotedocument.class, outputFile);

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
		Image image = new Image(doc, inputPath.toString());
		// set image alignment
		image.setAlignment(HorizontalAlignment.Right);
		// add image
		outlineElem.appendChild(image);
		// add outline elements
		outline.appendChild(outlineElem);
		// add Outline node
		page.appendChild(outline);
		// add Page node
		doc.appendChild(page);
		// save OneNote document
		// save the document in the *.one format.
		try {
			// oneFile.save("D://Aspose_JavaProjects//OneNote//out.one");//NOT
			// working
			doc.save(outputPath.toString(), SaveFormat.Pdf);// WORKING
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
