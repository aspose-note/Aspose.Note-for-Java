package com.aspose.note.examples.images;

import com.aspose.note.*;
import com.aspose.note.Document;
import java.io.IOException;
import com.aspose.note.LoadOptions;
import com.aspose.note.examples.Utils;
import java.nio.file.Path;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BuildOneNoteDocumentfromtheScratchandInsertanImageusinganImageStream {
	public static void main(String... args) throws IOException {
		// ExStart:BuildOneNoteDocumentfromtheScratchandInsertanImageusinganImageStream

		String inputFile = "image.jpg";
		Path inputPath = Utils.getPath(BuildOneNoteDocumentfromtheScratchandInsertanImageusinganImageStream.class,
				inputFile);

		String inputFile1 = "image1.jpg";
		Path inputPath1 = Utils.getPath(BuildOneNoteDocumentfromtheScratchandInsertanImageusinganImageStream.class,
				inputFile1);

		String outputFile = "Output.bmp";
		Path outputPath = Utils.getPath(BuildOneNoteDocumentfromtheScratchandInsertanImageusinganImageStream.class,
				outputFile);

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
			fs = new FileInputStream(inputPath.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// Load the second image using the image name, extension and stream.
		Image image1 = new Image(doc, "Penguins", "jpg", fs);

		// Load the second image using the image name, extension and stream.
		Image image = new Image(doc, inputPath1.toString());
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
			doc.save(outputPath.toString(), SaveFormat.Bmp);// NOT WORKING
			// doc.save("D://Aspose_JavaProjects//OneNote//out3.png",SaveFormat.Png);//NOT
			// WORKING
			// doc.save("D://Aspose_JavaProjects//OneNote//out3.tif",SaveFormat.Tiff);//NOT
			// WORKING

		} catch (IOException e) {
			e.printStackTrace();
		}

		// ExEnd:BuildOneNoteDocumentfromtheScratchandInsertanImageusinganImageStream
	}

}
