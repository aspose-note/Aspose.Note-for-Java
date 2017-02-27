package com.aspose.note.examples.Notebook;

import java.io.IOException;
import java.util.List;

import com.aspose.note.Document;
import com.aspose.note.Notebook;
import com.aspose.note.examples.Utils;
import com.aspose.note.system.collections.Generic.IGenericList;

public class RetrieveDocumentsfromOneNoteNotebook {
	public static void main(String... args) throws IOException {
 
		String dataDir = Utils.getSharedDataDir(RetrieveDocumentsfromOneNoteNotebook.class) + "Notebook/";
		Notebook rootNotebook = new Notebook(dataDir + "test.onetoc2");

		List<Document> allDocuments = rootNotebook.getChildNodes(Document.class);
		for (Document document : allDocuments) {
			System.out.println(document.getDisplayName());
		}
	}

}
