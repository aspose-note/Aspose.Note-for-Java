package com.aspose.note.examples.images;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import com.aspose.note.Document;
import com.aspose.note.HorizontalAlignment;
import com.aspose.note.Image;
import com.aspose.note.Outline;
import com.aspose.note.OutlineElement;
import com.aspose.note.Page;
import com.aspose.note.SaveFormat;
import com.aspose.note.examples.Utils;

public class BuildDocAndInsertImageUsingImageStream {
	public static void main(String... args) throws IOException {

		// ExStart:BuildDocAndInsertImageUsingImageStream
		String dataDir = Utils.getSharedDataDir(BuildDocAndInsertImageUsingImageStream.class) + "images/";

		// create an object of the Document class
		Document doc = new Document();
		// initialize Page class object
		Page page = new Page();

		Outline outline1 = new Outline();
		outline1.setVerticalOffset(600);
		outline1.setHorizontalOffset(0);
		OutlineElement outlineElem1 = new OutlineElement();
		InputStream fs = null;
		try {
			fs = new FileInputStream(dataDir + "image.jpg");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Load the second image using the image name, extension and stream.
		Image image = new Image(null, dataDir + "image1.jpg");
		// set image alignment
		image.setAlignment(HorizontalAlignment.Right);

		outlineElem1.appendChildLast(image);
		outline1.appendChildLast(outlineElem1);
		page.appendChildLast(outline1);

		doc.appendChildLast(page);
		// save OneNote document
		try {
			doc.save("D://Aspose_JavaProjects//OneNote//out3.pdf",SaveFormat.Pdf);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// ExEnd:BuildDocAndInsertImageUsingImageStream
	}

}
