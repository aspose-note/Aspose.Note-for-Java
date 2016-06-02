package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.ImageSaveOptions;
import com.aspose.note.LoadOptions;
import com.aspose.note.SaveFormat;
import com.aspose.note.examples.Utils;
import java.io.IOException;
import java.nio.file.Path;

public class ConvertSpecificPageToPngImage {
	public static void main(String... args) throws IOException {
		// ExStart:ConvertSpecificPageToPngImage
		// Load the document into Aspose.Note.

		String inputFile = "Sample1.one";
		Path inputPath = Utils.getPath(ConvertSpecificPageToPngImage.class, inputFile);
		String outputFile = "ConvertSpecificPageToPngImage.png";
		Path outputPath = Utils.getPath(ConvertSpecificPageToPngImage.class, outputFile);

		Document oneFile = new Document(inputPath.toString(), new LoadOptions());

		// Initialize ImageSaveOptions object
		ImageSaveOptions opts = new ImageSaveOptions(SaveFormat.Png);
		// set page index
		opts.setPageIndex(0);

		// Save the document as PNG.
		oneFile.save(outputPath.toString(), opts);
		// ExEnd:ConvertSpecificPageToPngImage
	}
}
