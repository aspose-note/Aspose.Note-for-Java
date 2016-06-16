package com.aspose.note.examples.pages;

import com.aspose.note.Document;
import com.aspose.note.Page;
import com.aspose.note.examples.Utils;

import java.io.IOException;
import java.nio.file.Path;

public class GetPageCount {
	public static void main(String... args) throws IOException {

		String inputFile = "Sample1.one";
		Path inputPath = Utils.getPath(GetPageCount.class, inputFile);
		// Load the document into Aspose.Note
		Document doc = new Document(inputPath.toString());

		// Get number of pages
		int count = doc.getChildNodes(Page.class).size();

		// Print page count
		System.out.printf("Total Pages: %s", count);
	}
}
