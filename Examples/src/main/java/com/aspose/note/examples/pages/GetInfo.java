package com.aspose.note.examples.pages;

import java.io.IOException;
import java.util.List;

import com.aspose.note.Document;
import com.aspose.note.LoadOptions;
import com.aspose.note.Page;
import com.aspose.note.examples.Utils;

public class GetInfo {
	public static void main(String... args) throws IOException {

		String dataDir = Utils.getSharedDataDir(GetInfo.class) + "pages/";
		// Load the document into Aspose.Note
		LoadOptions options = new LoadOptions();
		Document doc = new Document(dataDir + "Sample1.one", options);

		// Get page revisions
		List<Page> pages = doc.getChildNodes(Page.class);

		// Traverse list of pages
		for (Page pageRevision : pages) {
			System.out.println("LastModifiedTime: " + pageRevision.getLastModifiedTime());
			System.out.println("CreationTime: " + pageRevision.getCreationTime());
			System.out.println("Title: " + pageRevision.getTitle());
			System.out.println("Level: " + pageRevision.getLevel());
			System.out.println("Author: " + pageRevision.getAuthor());
		}
	}
}
