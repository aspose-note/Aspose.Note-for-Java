package com.aspose.note.examples.Notebook;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.Notebook;
import com.aspose.note.examples.Utils;

public class AddChildNode {
	public static void main(String... args) throws IOException {
		// ExStart:AddChildNode
		String dataDir = Utils.getSharedDataDir(AddChildNode.class) + "Notebook/";
		// Load a OneNote Notebook
		Notebook notebook = new Notebook(dataDir + "Notizbuch öffnen.onetoc2");

		// Append a new child to the Notebook
		notebook.appendChild(new Document(dataDir + "Neuer Abschnitt 1.one"));

		dataDir = dataDir + "AddChildNodetoOneNoteNotebook_out.onetoc2";

		// Save the Notebook
		notebook.save(dataDir);
		// ExEnd:AddChildNode
	}

}
