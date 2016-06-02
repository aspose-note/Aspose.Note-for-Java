package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.SaveFormat;
import com.aspose.note.examples.Utils;
import java.io.IOException;
import java.nio.file.Path;

public class LoadDocIntoAsposeNoteUsingSaveformat {
	public static void main(String... args) throws IOException {
		// ExStart:LoadDocIntoAsposeNoteUsingSaveFormat
		// Load the document into Aspose.Note.

		String inputFile = "Sample1.one";
		Path inputPath = Utils.getPath(LoadDocIntoAsposeNoteUsingSaveformat.class, inputFile);
		String outputFile = "LoadDocIntoAsposeNoteUsingSaveformat.pdf";
		Path outputPath = Utils.getPath(LoadDocIntoAsposeNoteUsingSaveformat.class, outputFile);

		Document oneFile = new Document(inputPath.toString());

		// Save the document as PDF
		oneFile.save(outputPath.toString(), SaveFormat.Pdf);
		// ExEnd:LoadDocIntoAsposeNoteUsingSaveFormat
	}
}
