package com.aspose.note.examples.Notebook;

import java.io.IOException;
import java.nio.file.Path;

import com.aspose.note.INotebookChildNode;
import com.aspose.note.Notebook;
import com.aspose.note.NotebookLoadOptions;
import com.aspose.note.examples.Utils;
import com.aspose.note.Document;

public class LoadingNotebookInstantly {
	public static void main(String... args) throws IOException {
		// By default children loading is "lazy".
		// Therefore for instant loading has took place,
		// it is necessary to set the NotebookLoadOptions.InstantLoading flag.
		NotebookLoadOptions loadOptions = new NotebookLoadOptions();
		loadOptions.setInstantLoading(true);
		String inputFile = "Open Notebook.onetoc2";
		Path inputPath = Utils.getPath(LoadingNotebookInstantly.class, inputFile);
		Notebook notebook = new Notebook(inputPath.toString(), loadOptions);

		// All child documents are already loaded.
		for (INotebookChildNode notebookChildNode : notebook) {
			if (notebookChildNode instanceof Document) {
				// Do something with child document
			}
		}
		
	}
}
