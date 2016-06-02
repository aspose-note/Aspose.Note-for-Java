package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.ImageSaveOptions;
import com.aspose.note.SaveFormat;
import com.aspose.note.examples.Utils;

import java.io.IOException;
import java.nio.file.Path;

public class ConvertSpecificPageToImage {
	public static void main(String... args) throws IOException {

		// ExStart:ConvertSpecificPageToImage

		String inputFile = "Sample1.one";
		Path inputPath = Utils.getPath(ConvertSpecificPageToImage.class, inputFile);
		String outputFile = "Output.jpg";
		Path outputPath = Utils.getPath(ConvertSpecificPageToImage.class, outputFile);

		// Load the document into Aspose.Note
		Document oneFile = new Document(inputPath.toString());

		// Initialize PdfSaveOptions object
		ImageSaveOptions options = new ImageSaveOptions(SaveFormat.Jpeg);

		// Specify second page for conversion
		options.setPageIndex(1);

		// Save the document as PNG
		oneFile.save(outputPath.toString(), options);

		System.out.println("File saved: " + outputPath);
		// ExEnd:ConvertSpecificPageToImage
	}
}
