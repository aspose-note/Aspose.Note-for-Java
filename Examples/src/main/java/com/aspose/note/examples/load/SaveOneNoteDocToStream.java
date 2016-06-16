package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.SaveFormat;
import com.aspose.note.examples.Utils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Path;

public class SaveOneNoteDocToStream {
	public static void main(String... args) throws IOException {
		// Load the document into Aspose.Note.

		String inputFile = "Sample1.one";
		Path inputPath = Utils.getPath(SaveOneNoteDocToStream.class, inputFile);

		Document doc = new Document(inputPath.toString());

		ByteArrayOutputStream dstStream = new ByteArrayOutputStream();

		doc.save(dstStream, SaveFormat.Pdf);
	}
}
