package com.aspose.note.examples.Notebook;

import java.io.IOException;
import java.nio.file.Path;

import com.aspose.note.INotebookChildNode;
import com.aspose.note.Notebook;
import com.aspose.note.examples.Utils;
import com.aspose.note.system.collections.Generic.List;

public class RemoveChildNodeFromOneNoteNotebook {
	public static void main(String... args) throws IOException {
		
		Path dataDirPath = Utils.getPath(RemoveChildNodeFromOneNoteNotebook.class,"");
		
		String dataDir = dataDirPath.toString() + '/';
		
		// Load a OneNote Notebook
		Notebook notebook = new Notebook(dataDir + "test.onetoc2");

		// Traverse through its child nodes for searching the desired child item
		for (INotebookChildNode child : new List<>(notebook))
		{
		    if (child.getDisplayName() == "Remove Me")
		    {
		        // Remove the Child Item from the Notebook
		        notebook.removeChild(child);
		    }
		}

		dataDir = dataDir + "RemoveChildNode_out_.onetoc2";

		// Save the Notebook
		notebook.save(dataDir);
	}

}
