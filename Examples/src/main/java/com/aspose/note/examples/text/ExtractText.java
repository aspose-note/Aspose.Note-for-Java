package com.aspose.note.examples.text;

import com.aspose.note.Document;
import com.aspose.note.Page;
import com.aspose.note.examples.Utils;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class ExtractText {
	public static void main(String... args) throws IOException {
		// ExStart:ExtractText

		String inputFile = "Sample1.one";
		Path inputPath = Utils.getPath(ExtractText.class, inputFile);

		// Load the document into Aspose.Note
		Document doc = new Document(inputPath.toString());

		// Get list of page nodes
		List<Page> pages = doc.getChildNodes(Page.class);

		for (Page p : pages) {
			System.out.println(p.getText());
		}
		// ExEnd:ExtractText
	}
}
