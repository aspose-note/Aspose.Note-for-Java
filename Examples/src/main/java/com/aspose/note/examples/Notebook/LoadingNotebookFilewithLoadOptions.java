package com.aspose.note.examples.Notebook;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.INotebookChildNode;
import com.aspose.note.Notebook;
import com.aspose.note.examples.Utils;

public class LoadingNotebookFilewithLoadOptions {
	public static void main(String... args) throws IOException {

		String dataDir = Utils.getSharedDataDir(LoadingNotebookFilewithLoadOptions.class) + "Notebook/";

		// By default children loading is "lazy".
		Notebook notebook = new Notebook(dataDir + "test.onetoc2");

		for (INotebookChildNode notebookChildNode : notebook) {
			// Actual loading of the child document happens only here.
			if (notebookChildNode instanceof Document) {
				// Do something with child document
			}
		}
	}

}
