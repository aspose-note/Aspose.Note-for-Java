package com.aspose.note.examples.Notebook;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.INotebookChildNode;
import com.aspose.note.Notebook;
import com.aspose.note.NotebookLoadOptions;
import com.aspose.note.examples.Utils;

public class LoadingNotebookInstantly {
	public static void main(String... args) throws IOException {
		// ExStart:LoadingNotebookInstantly
		// By default children loading is "lazy".
		// Therefore for instant loading has took place,
		// it is necessary to set the NotebookLoadOptions.InstantLoading flag.
		NotebookLoadOptions loadOptions = new NotebookLoadOptions();
		loadOptions.setInstantLoading(true);
		String dataDir = Utils.getSharedDataDir(LoadingNotebookInstantly.class) + "Notebook/";
		Notebook notebook = new Notebook(dataDir + "test.onetoc2", loadOptions);

		// All child documents are already loaded.
		for (INotebookChildNode notebookChildNode : notebook) {
			if (notebookChildNode instanceof Document) {
				// Do something with child document
			}
		}
		// ExEnd:LoadingNotebookInstantly
	}
}
