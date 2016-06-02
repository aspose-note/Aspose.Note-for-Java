package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.PdfSaveOptions;
import java.io.IOException;

import java.nio.file.Path;
import com.aspose.note.examples.Utils;

public class ConvertSpecificPageRangeToPdf {
	public static void main(String... args) throws IOException {

		// ExStart:ConvertSpecificPageRangeToPdf
		// Load the document into Aspose.Note.

		String inputFile = "Sample1.one";
		Path inputPath = Utils.getPath(ConvertSpecificPageRangeToPdf.class, inputFile);
		String outputFile = "Output.pdf";
		Path outputPath = Utils.getPath(ConvertSpecificPageRangeToPdf.class, outputFile);

		Document oneFile = new Document(inputPath.toString());

		// Initialize PdfSaveOptions object
		PdfSaveOptions opts = new PdfSaveOptions();
		// Set page index
		opts.setPageIndex(2);
		// Set page count
		opts.setPageCount(3);

		// Save the document as PDF
		oneFile.save(outputPath.toString(), opts);
		System.out.println("File saved: " + outputPath);
		// ExEnd:ConvertSpecificPageRangeToPdf
	}
}
