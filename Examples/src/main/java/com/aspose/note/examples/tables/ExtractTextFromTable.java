package com.aspose.note.examples.tables;

import java.io.IOException;
import java.util.List;

import com.aspose.note.Document;
import com.aspose.note.Table;
import com.aspose.note.examples.Utils;

public class ExtractTextFromTable {
	public static void main(String... args) throws IOException {
		// ExStart:ExtractTextFromTable
		String dataDir = Utils.getSharedDataDir(ExtractTextFromTable.class) + "tables/";

		// Load the document into Aspose.Note
		Document document = new Document(dataDir + "Sample1.one");

		// Get a list of table nodes
		List<Table> nodes = document.getChildNodes(Table.class);

		for (int i = 0; i < nodes.size(); i++) {
			Table table = nodes.get(i);
			System.out.println("Table # " + i);

			// Retrieve text
			String text = table.getText();

			// Print text on the output screen
			System.out.println(text);
		}
		// ExEnd:ExtractTextFromTable
	}
}
