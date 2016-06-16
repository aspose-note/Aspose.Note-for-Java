package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.PdfSaveOptions;
import com.aspose.note.examples.Utils;
import java.io.IOException;
import java.nio.file.Path;

public class LoadDocIntoAsposeNoteUsingPdfsaveoptions {
	public static void main(String... args) throws IOException {
		// Load the document into Aspose.Note.

		String inputFile = "Sample1.one";
		Path inputPath = Utils.getPath(LoadDocIntoAsposeNoteUsingPdfsaveoptions.class, inputFile);
		String outputFile = "LoadDocIntoAsposeNoteUsingPdfsaveoptions.pdf";
		Path outputPath = Utils.getPath(LoadDocIntoAsposeNoteUsingPdfsaveoptions.class, outputFile);

		Document oneFile = new Document(inputPath.toString());

		// Save the document as PDF
		oneFile.save(outputPath.toString(), new PdfSaveOptions());
	}
}
