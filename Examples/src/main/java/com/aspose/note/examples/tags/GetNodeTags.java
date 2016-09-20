package com.aspose.note.examples.tags;

import java.io.IOException;
import java.util.List;

import com.aspose.note.Document;
import com.aspose.note.NoteTag;
import com.aspose.note.NoteTagCore;
import com.aspose.note.RichText;
import com.aspose.note.examples.Utils;

public class GetNodeTags {
	public static void main(String... args) throws IOException {

		String dataDir = Utils.getSharedDataDir(GetNodeTags.class) + "tags/";

		// Load the document into Aspose.Note
		Document doc = new Document(dataDir + "Sample1.one");

		// Get all RichText nodes
		List<RichText> nodes = doc.getChildNodes(RichText.class);

		// Iterate through each node
		for (RichText richText : nodes) {
			for (NoteTagCore tag : richText.getTags()) {
				if (tag.getClass() == NoteTag.class) {
					NoteTag noteTag = (NoteTag) tag;
					// Retrieve properties
					System.out.println("Completed Time: " + noteTag.getCompletedTime());
					System.out.println("Create Time: " + noteTag.getCreationTime());
					System.out.println("Font Color: " + noteTag.getFontColor());
					System.out.println("Status: " + noteTag.getStatus());
					System.out.println("Label: " + noteTag.getLabel());
					System.out.println("Icon: " + noteTag.getIcon());
					System.out.println("High Light: " + noteTag.getHighlight());
				}
			}
		}

	}
}
