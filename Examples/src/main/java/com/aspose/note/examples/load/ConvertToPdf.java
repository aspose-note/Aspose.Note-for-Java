package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.PdfSaveOptions;
import com.aspose.note.examples.Utils;

import java.io.IOException;
import java.nio.file.Path;

public class ConvertToPdf {
	public static void main(String... args) throws IOException {

		// ExStart:ConvertToPdf

		String inputFile = "Sample1.one";
		Path inputPath = Utils.getPath(ConvertToPdf.class, inputFile);
		String outputFile = "Output.pdf";
		Path outputPath = Utils.getPath(ConvertToPdf.class, outputFile);

		// Load the document into Aspose.Note
		Document oneFile = new Document(inputPath.toString());

		// Initialize PdfSaveOptions object
		PdfSaveOptions options = new PdfSaveOptions();

		// Set page index. Uncomment to skip first two pages
		// options.setPageIndex(2);

		// Set page count. Uncomment to convert only 3 pages, starting from
		// options.getPageIndex().
		// options.setPageCount(3);

		// Save the document as PDF
		oneFile.save(outputPath.toString(), options);

		System.out.println("File saved: " + outputPath);

		// ExEnd:ConvertToPdf
	}
}
