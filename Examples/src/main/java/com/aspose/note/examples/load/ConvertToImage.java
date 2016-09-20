package com.aspose.note.examples.load;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.ImageSaveOptions;
import com.aspose.note.SaveFormat;
import com.aspose.note.examples.Utils;

public class ConvertToImage {
	public static void main(String... args) throws IOException {
		String dataDir = Utils.getSharedDataDir(ConvertToImage.class) + "load/";

		// Load the document into Aspose.Note
		Document oneFile = new Document(dataDir + "Sample1.one");

		// Initialize PdfSaveOptions object
		ImageSaveOptions options = new ImageSaveOptions(SaveFormat.Png);

		// Save the document as PNG
		oneFile.save(dataDir + "ConvertToImage_out.png", options);

		System.out.println("File saved: " + dataDir + "ConvertToImage_out.png");

	}
}
