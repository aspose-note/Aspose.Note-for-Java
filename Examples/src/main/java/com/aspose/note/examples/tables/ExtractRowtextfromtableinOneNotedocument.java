/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.note.examples.tables;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import com.aspose.note.Document;
import com.aspose.note.LoadOptions;
import com.aspose.note.RichText;
import com.aspose.note.Table;
import com.aspose.note.TableRow;
import com.aspose.note.examples.Utils;

/**
 *
 * @author GOL-NHP04
 */
public class ExtractRowtextfromtableinOneNotedocument {
	public static void main(String... args) throws IOException {
		// ExStart:ExtractRowtextfromtableinOneNotedocument
		String dataDir = Utils.getSharedDataDir(ExtractRowtextfromtableinOneNotedocument.class) + "tables/";

		// Load the document into Aspose.Note.
		Document document = new Document(dataDir + "Sample1.one", new LoadOptions());

		// Get a list of table nodes
		List<Table> nodes = (List<Table>) document.getChildNodes(Table.class);

		// Set row count
		int rowCount = 0;

		for (Table table : nodes) {
			// Iterate through table rows
			for (TableRow row : table) {
				rowCount++;
				// Retrieve text
				String text = row.getChildNodes(RichText.class).stream()
								.map(RichText::getText)
								.collect(Collectors.joining(System.lineSeparator()));
				// Print text on the output screen
				System.out.println(text);
			}
		}
		// ExEnd:ExtractRowtextfromtableinOneNotedocument
	}

}
