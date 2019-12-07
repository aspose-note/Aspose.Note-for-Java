package com.aspose.note.examples.pages;

import java.io.IOException;

import com.aspose.note.Document;
import com.aspose.note.Page;
import com.aspose.note.examples.Utils;

public class GetPageCount {
	public static void main(String... args) throws IOException {
		// ExStart: GetPageCount
		String dataDir = Utils.getSharedDataDir(GetPageCount.class) + "pages/";
		// Load the document into Aspose.Note
		Document doc = new Document(dataDir + "Sample1.one");

		// Get number of pages
		int count = doc.getChildNodes(Page.class).size();

		// Print page count
		System.out.printf("Total Pages: %s", count);
		// ExEnd: GetPageCount
	}
}
