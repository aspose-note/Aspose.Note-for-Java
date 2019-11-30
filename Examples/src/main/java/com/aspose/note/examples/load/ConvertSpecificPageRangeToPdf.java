package com.aspose.note.examples.load;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.PdfSaveOptions;
import com.aspose.note.examples.Utils;

public class ConvertSpecificPageRangeToPdf {
	public static void main(String... args) throws IOException {
		// ExStart:SaveRangeOfPagesAsPDF
		// Load the document into Aspose.Note.
		String dataDir = Utils.getSharedDataDir(ConvertSpecificPageRangeToPdf.class) + "load/";
		
		Document oneFile = new Document(dataDir + "Sample1.one");

		// Initialize PdfSaveOptions object
		PdfSaveOptions opts = new PdfSaveOptions();
		// Set page index
		opts.setPageIndex(2);
		// Set page count
		opts.setPageCount(3);

		// Save the document as PDF
		oneFile.save(dataDir +"ConvertSpecificPageRangeToPdf_out.pdf", opts);
		System.out.println("File saved: " + dataDir + "ConvertSpecificPageRangeToPdf_out.pdf");
		// ExEnd:SaveRangeOfPagesAsPDF
	}
}
