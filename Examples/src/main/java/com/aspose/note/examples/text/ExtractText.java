package com.aspose.note.examples.text;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import com.aspose.note.Document;
import com.aspose.note.Page;
import com.aspose.note.RichText;
import com.aspose.note.examples.Utils;

public class ExtractText {
	public static void main(String... args) throws IOException {
		// ExStart:ExtractText
		String dataDir = Utils.getSharedDataDir(ExtractText.class) + "text/";

		// Load the document into Aspose.Note
		Document doc = new Document(dataDir + "Sample1.one");

		// Get list of page nodes
		List<Page> pages = doc.getChildNodes(Page.class);

		for (Page p : pages) {
			String text = p.getChildNodes(RichText.class).stream()
					.map(RichText::getText)
					.collect(Collectors.joining(System.lineSeparator()));
			
			System.out.println(text);
		}
		// ExEnd:ExtractText
	}
}
