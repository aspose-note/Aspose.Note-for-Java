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

public class BuildOneNoteDocumentfromtheScratchandInsertanImageusinganImageStream {
	public static void main(String... args) throws IOException {

		String dataDir = Utils.getSharedDataDir(BuildOneNoteDocumentfromtheScratchandInsertanImageusinganImageStream.class) + "images/";

		// create an object of the Document class
		Document doc = new Document();
		// initialize Page class object
		Page page = new Page(doc);

		Outline outline1 = new Outline(doc);
		outline1.setVerticalOffset(600);
		outline1.setHorizontalOffset(0);
		OutlineElement outlineElem1 = new OutlineElement(doc);
		InputStream fs = null;
		try {
			fs = new FileInputStream(dataDir + "image.jpg");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Load the second image using the image name, extension and stream.
		Image image = new Image(doc, dataDir + "image1.jpg");
		// set image alignment
		image.setAlignment(HorizontalAlignment.Right);

		outlineElem1.appendChild(image);
		outline1.appendChild(outlineElem1);
		page.appendChild(outline1);

		doc.appendChild(page);
		// save OneNote document
		try {
			// doc.save("D://Aspose_JavaProjects//OneNote//out.one");//NOT
			// working
			// doc.save("D://Aspose_JavaProjects//OneNote//out3.pdf",SaveFormat.Pdf);//WORKING
			doc.save(dataDir + "BuildOneNoteDocument_out.bmp", SaveFormat.Bmp);// NOT WORKING
			// doc.save("D://Aspose_JavaProjects//OneNote//out3.png",SaveFormat.Png);//NOT
			// WORKING
			// doc.save("D://Aspose_JavaProjects//OneNote//out3.tif",SaveFormat.Tiff);//NOT
			// WORKING

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
