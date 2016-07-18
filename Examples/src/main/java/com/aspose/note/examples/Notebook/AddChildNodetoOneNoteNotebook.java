package com.aspose.note.examples.Notebook;

import java.io.IOException;
import java.nio.file.Path;

import com.aspose.note.Document;
import com.aspose.note.Notebook;
import com.aspose.note.examples.Utils;


public class AddChildNodetoOneNoteNotebook {
	public static void main(String... args) throws IOException {
		
		Path dataDirPath = Utils.getPath(AddChildNodetoOneNoteNotebook.class,"");
		
		String dataDir = dataDirPath.toString() + '/';

		// Load a OneNote Notebook
		Notebook notebook = new Notebook(dataDir + "Notizbuch öffnen.onetoc2");

		// Append a new child to the Notebook
		notebook.appendChild(new Document(dataDir + "Neuer Abschnitt 1.one"));

		dataDir = dataDir + "AddChildNode_out_.onetoc2";

		// Save the Notebook
		notebook.save(dataDir);
	}

}
