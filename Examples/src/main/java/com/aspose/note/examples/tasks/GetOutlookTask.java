package com.aspose.note.examples.tasks;

import java.io.IOException;
import java.util.List;

import com.aspose.note.Document;
import com.aspose.note.NoteTagCore;
import com.aspose.note.NoteTask;
import com.aspose.note.RichText;
import com.aspose.note.examples.Utils;

public class GetOutlookTask {
	public static void main(String... args) throws IOException {

		String dataDir = Utils.getSharedDataDir(GetOutlookTask.class) + "tasks/";

		// Load the document into Aspose.Note
		Document doc = new Document(dataDir + "Sample1.one");

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
