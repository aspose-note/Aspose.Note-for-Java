package com.aspose.note.examples.load;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.OneSaveOptions;
import com.aspose.note.examples.Utils;

public class CreatePasswordProtectedOneNoteDocuments {
	public static void main(String... args) throws IOException {
		// ExStart:CreatePasswordProtectedOneNoteDocuments
		// Load the document into Aspose.Note.
		String dataDir = Utils.getSharedDataDir(CreatePasswordProtectedOneNoteDocuments.class) + "load/";

		Document document = new Document(dataDir + "Sample1.one");

		OneSaveOptions saveOptions = new OneSaveOptions();

		saveOptions.setDocumentPassword("pass");

		document.save(dataDir + "CreatePasswordProtected_out.one", saveOptions);
		// ExEnd:CreatePasswordProtectedOneNoteDocuments
	}

}
