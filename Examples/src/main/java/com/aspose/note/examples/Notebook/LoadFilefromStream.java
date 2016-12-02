package com.aspose.note.examples.Notebook;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.aspose.note.Notebook;
import com.aspose.note.examples.Utils;

public class LoadFilefromStream {
	public static void main(String... args) throws IOException {
		// Load the document into Aspose.Note.
		String dataDir = Utils.getSharedDataDir(SupportofPasswordProtectedDocuments.class) + "Notebook/";
		InputStream inputStream = new FileInputStream(dataDir + "test.onetoc2");

		Notebook notebook = new Notebook(inputStream);

		InputStream childStream = new FileInputStream(dataDir + "Neuer Abschnitt 1.one");
	}
}
