package com.aspose.note.examples.Notebook;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.Notebook;
import com.aspose.note.NotebookOneSaveOptions;
import com.aspose.note.OneSaveOptions;
import com.aspose.note.examples.Utils;

public class WritingPasswordProtectedDoc {
	public static void main(String... args) throws IOException {
		// ExStart:WritingPasswordProtectedDoc
		// Load the document into Aspose.Note.
		String dataDir = Utils.getSharedDataDir(WritingPasswordProtectedDoc.class) + "Notebook/";
		
		Notebook notebook = new Notebook();
		
		NotebookOneSaveOptions saveOptions = new NotebookOneSaveOptions();
		saveOptions.setDeferredSaving(true);
		notebook.save(dataDir + "Open Notebook.onetoc2", saveOptions);

		Document childDocument0 = (Document) notebook.get_Item(0);
		childDocument0.save(dataDir + "Not Locked.one");

		Document childDocument1 = (Document) notebook.get_Item(1);
		OneSaveOptions documentSaveOptions1 = new OneSaveOptions();
		documentSaveOptions1.setDocumentPassword("pass1");
		childDocument1.save(dataDir + "Locked Pass1.one", documentSaveOptions1);

		Document childDocument2 = (Document) notebook.get_Item(2);
		OneSaveOptions documentSaveOptions2 = new OneSaveOptions();
		documentSaveOptions2.setDocumentPassword("pass2");
		childDocument2.save(dataDir + "Locked Pass2.one", documentSaveOptions2);
		// ExEnd:WritingPasswordProtectedDoc
	}
}
