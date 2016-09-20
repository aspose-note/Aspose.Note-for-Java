package com.aspose.note.examples.load;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.PdfSaveOptions;
import com.aspose.note.examples.Utils;

public class LoadDocIntoAsposeNoteUsingPdfsaveoptions {
	public static void main(String... args) throws IOException {
		// Load the document into Aspose.Note.
		String dataDir = Utils.getSharedDataDir(LoadDocIntoAsposeNoteUsingPdfsaveoptions.class) + "load/";
		Document oneFile = new Document(dataDir + "Sample1.one");
		// Save the document as PDF
		oneFile.save(dataDir + "LoadDocIntoAsposeNoteUsingPdfsaveoptions_out.pdf", new PdfSaveOptions());
	}
}
