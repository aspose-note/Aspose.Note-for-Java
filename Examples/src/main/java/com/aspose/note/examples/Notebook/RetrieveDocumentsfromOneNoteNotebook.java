package com.aspose.note.examples.Notebook;

import java.io.IOException;
import java.nio.file.Path;

import com.aspose.note.Document;
import com.aspose.note.Notebook;
import com.aspose.note.examples.Utils;
import com.aspose.note.system.collections.Generic.IGenericList;

public class RetrieveDocumentsfromOneNoteNotebook {
	public static void main(String... args) throws IOException {
		
		String inputFile = "Open Notebook.onetoc2";
		Path inputPath = Utils.getPath(RetrieveDocumentsfromOneNoteNotebook.class, inputFile);
		Notebook rootNotebook = new Notebook(inputPath.toString());

		IGenericList<Document> allDocuments = rootNotebook.getChildNodes(Document.class);
		for (Document document : allDocuments) {
			System.out.println(document.getDisplayName());
		}
		
	}

}
