package com.aspose.note.examples.images;

import com.aspose.note.*;
import com.aspose.note.Document;
import java.io.IOException;
import com.aspose.note.LoadOptions;
import com.aspose.note.examples.Utils;
import java.nio.file.Path;

public class InsertanImage {
	public static void main(String... args) throws IOException {

		// ExStart:InsertanImage

		// load document from the stream.
		LoadOptions options = new LoadOptions();

		String oneInputFile = "Sample1.one";
		Path oneInputPath = Utils.getPath(InsertanImage.class, oneInputFile);
		String inputFile = "Input.jpg";
		Path inputPath = Utils.getPath(InsertanImage.class, inputFile);
		String outputFile = "Output.pdf";
		Path outputPath = Utils.getPath(InsertanImage.class, outputFile);

		Document oneFile = new Document(oneInputPath.toString(), options);

		// get the first page of the document.
		Page page = oneFile.getFirstChild();

		// load an image from the file.
		Image image = new Image(oneFile, inputPath.toString());
		// change the image's size according to your needs (optional).
		image.setWidth(100);
		image.setHeight(100);
		// set the image's location in the page (optional).
		image.setVerticalOffset(400);
		image.setHorizontalOffset(100);
		// set image alignment
		image.setAlignment(HorizontalAlignment.Right);
		// add the image to the page.
		page.appendChild(image);

		// save the document in the *.one format.
		try {
			// oneFile.save("D://Aspose_JavaProjects//OneNote//out.one");//NOT
			// working
			oneFile.save(outputPath.toString(), SaveFormat.Pdf);// WORKING
		} catch (IOException e) {
			e.printStackTrace();
		}

		// ExEnd:InsertanImage

	}
}
