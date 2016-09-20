package com.aspose.note.examples.load;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.SaveFormat;
import com.aspose.note.examples.Utils;

public class SaveToStream {
	public static void main(String... args) throws IOException {

		String dataDir = Utils.getSharedDataDir(SaveOneNoteDocToStream.class) + "load/";

		// Load the document into Aspose.Note
		Document doc = new Document(dataDir + "Sample1.one");

		// Create a stream object
		ByteArrayOutputStream stream = new ByteArrayOutputStream();

		// Save the document to stream as a PDF
		doc.save(stream, SaveFormat.Pdf);

		System.out.println("Stream Size: " + stream.size() + " bytes");
	}
}
