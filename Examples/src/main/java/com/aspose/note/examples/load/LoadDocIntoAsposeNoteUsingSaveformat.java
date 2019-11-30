package com.aspose.note.examples.load;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.SaveFormat;
import com.aspose.note.examples.Utils;

public class LoadDocIntoAsposeNoteUsingSaveformat {
	public static void main(String... args) throws IOException {
		// ExStart:SaveDocToOneNoteFormatUsingSaveFormat
		// Load the document into Aspose.Note.
		String dataDir = Utils.getSharedDataDir(LoadDocIntoAsposeNoteUsingSaveformat.class) + "load/";
		Document oneFile = new Document(dataDir + "Sample1.one");

		// Save the document as PDF
		oneFile.save(dataDir + "LoadDocIntoAsposeNoteUsingSaveformat_out.pdf", SaveFormat.Pdf);
		// ExEnd:SaveDocToOneNoteFormatUsingSaveFormat
	}
}
