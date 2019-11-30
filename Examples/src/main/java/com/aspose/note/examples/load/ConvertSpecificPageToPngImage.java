package com.aspose.note.examples.load;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.ImageSaveOptions;
import com.aspose.note.LoadOptions;
import com.aspose.note.SaveFormat;
import com.aspose.note.examples.Utils;

public class ConvertSpecificPageToPngImage {
	public static void main(String... args) throws IOException {
		// ExStart:ConvertSpecificPageToPng
		// Load the document into Aspose.Note.
		String dataDir = Utils.getSharedDataDir(ConvertSpecificPageToPngImage.class) + "load/";
		Document oneFile = new Document(dataDir + "Sample1.one", new LoadOptions());

		// Initialize ImageSaveOptions object
		ImageSaveOptions opts = new ImageSaveOptions(SaveFormat.Png);
		// set page index
		opts.setPageIndex(0);

		// Save the document as PNG.
		oneFile.save(dataDir + "ConvertSpecificPageToPngImage_out.png", opts);
		// ExEnd:ConvertSpecificPageToPng
		}
}
