package com.aspose.note.examples.Notebook;

import java.io.IOException;
import java.nio.file.Path;

import com.aspose.note.Document;
import com.aspose.note.INotebookChildNode;
import com.aspose.note.Notebook;
import com.aspose.note.examples.Utils;

public class LoadingNotebookFilewithLoadOptions {
	public static void main(String... args) throws IOException {
		// ExStart:LoadingNotebookFilewithLoadOptions
		String inputFile = "Open Notebook.onetoc2";
		Path inputPath = Utils.getPath(LoadingNotebookFilewithLoadOptions.class, inputFile);

		// By default children loading is "lazy".
		Notebook notebook = new Notebook(inputPath.toString());

		for (INotebookChildNode notebookChildNode : notebook) {
			// Actual loading of the child document happens only here.
			if (notebookChildNode instanceof Document) {
				// Do something with child document
			}
		}
		// ExEnd:LoadingNotebookFilewithLoadOptions
	}

}
