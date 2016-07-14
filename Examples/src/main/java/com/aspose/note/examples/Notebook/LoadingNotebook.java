package com.aspose.note.examples.Notebook;

import java.io.IOException;
import java.nio.file.Path;

import com.aspose.note.Document;
import com.aspose.note.INotebookChildNode;
import com.aspose.note.Notebook;
import com.aspose.note.examples.Utils;

public class LoadingNotebook {
	public static void main(String... args) throws IOException {
		// ExStart:LoadingNotebook
		String inputFile = "Open_Notebook.onetoc2";
		
		Path inputPath = Utils.getPath(LoadingNotebook.class, inputFile);
		Notebook notebook = new Notebook(inputPath.toString());
        
        
		for (INotebookChildNode notebookChildNode : notebook) {
			System.out.println(notebookChildNode.getDisplayName());

			if (notebookChildNode instanceof Document) {
				// Do something with child document
			} else if (notebookChildNode instanceof Notebook) {
				// Do something with child notebook
			}
		}
		// ExEnd:LoadingNotebook
	}

}
