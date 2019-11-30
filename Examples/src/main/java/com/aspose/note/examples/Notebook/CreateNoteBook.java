package com.aspose.note.examples.Notebook;

import java.io.IOException;

import com.aspose.note.Notebook;
import com.aspose.note.examples.Utils;

public class CreateNoteBook {
	public static void main(String... args) throws IOException {
		// ExStart:CreateNoteBook	
		String dataDir = Utils.getSharedDataDir(CreateNoteBook.class) + "Notebook/";

		Notebook notebook = new Notebook();

		// Save the Notebook
		notebook.save(dataDir + "CreatandSaveANotebook.onetoc2");
		// ExEbd:CreateNoteBook
	}

}
