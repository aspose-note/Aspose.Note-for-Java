package com.aspose.note.examples.load;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.ImageSaveOptions;
import com.aspose.note.SaveFormat;
import com.aspose.note.examples.Utils;

public class ConvertSpecificPageToImage {
	public static void main(String... args) throws IOException {
		// ExStart:ConvertSpecificPageToImage
		String dataDir = Utils.getSharedDataDir(ConvertSpecificPageToImage.class) + "load/";

		// Load the document into Aspose.Note
		Document oneFile = new Document(dataDir + "Sample1.one");

		// Initialize PdfSaveOptions object
		ImageSaveOptions options = new ImageSaveOptions(SaveFormat.Jpeg);

		// Specify second page for conversion
		options.setPageIndex(1);

		// Save the document
		oneFile.save(dataDir + "ConvertSpecificPageToImage_out.jpg", options);

		System.out.println("File saved: " + dataDir + "ConvertSpecificPageToImage_out.jpg");
		// ExEnd:ConvertSpecificPageToImage
	}
}
