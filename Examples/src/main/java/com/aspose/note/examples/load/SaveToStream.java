package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.PdfSaveOptions;
import com.aspose.note.SaveFormat;
import com.aspose.note.examples.Utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Path;

public class SaveToStream {
	public static void main(String... args) throws IOException {

		// ExStart:SaveToStream
		String inputFile = "Sample1.one";
		Path inputPath = Utils.getPath(SaveToStream.class, inputFile);

		// Load the document into Aspose.Note
		Document doc = new Document(inputPath.toString());

		// Create a stream object
		ByteArrayOutputStream stream = new ByteArrayOutputStream();

		// Save the document to stream as a PDF
		doc.save(stream, SaveFormat.Pdf);

		System.out.println("Stream Size: " + stream.size() + " bytes");
		// ExEnd:SaveToStream
	}
}
