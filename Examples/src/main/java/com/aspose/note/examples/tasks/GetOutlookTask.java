package com.aspose.note.examples.tasks;

import com.aspose.note.Document;
import com.aspose.note.NoteTagCore;
import com.aspose.note.NoteTask;
import com.aspose.note.RichText;
import com.aspose.note.examples.Utils;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class GetOutlookTask {
	public static void main(String... args) throws IOException {

		String inputFile = "Sample1.one";
		Path inputPath = Utils.getPath(GetOutlookTask.class, inputFile);

		// Load the document into Aspose.Note
		Document doc = new Document(inputPath.toString());

		// Get all RichText nodes
		List<RichText> nodes = (List<RichText>) doc.getChildNodes(RichText.class);

		// Iterate through each node
		for (RichText richText : nodes) {
			for (NoteTagCore tag : richText.getTags()) {
				if (tag.getClass() == NoteTask.class) {
					NoteTask noteTask = (NoteTask) tag;
					// Retrieve properties
					System.out.println("Completed Time: " + noteTask.getCompletedTime());
					System.out.println("Create Time: " + noteTask.getCreationTime());
					System.out.println("Due Date: " + noteTask.getDueDate());
					System.out.println("Status: " + noteTask.getStatus());
					System.out.println("Task Type: " + noteTask.getTaskType());
					System.out.println("Icon: " + noteTask.getIcon());
				}
			}
		}


	}
}
