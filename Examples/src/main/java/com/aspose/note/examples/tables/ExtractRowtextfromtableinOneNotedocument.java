/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.note.examples.tables;

import com.aspose.note.*;
import java.io.IOException;
import com.aspose.note.Document;
import com.aspose.note.Page;
import com.aspose.note.LoadOptions;
import com.aspose.note.examples.Utils;
import java.nio.file.Path;

import java.util.*;

/**
 *
 * @author GOL-NHP04
 */
public class ExtractRowtextfromtableinOneNotedocument {
	public static void main(String... args) throws IOException {

		// ExStart:ExtractRowtextfromtableinOneNotedocument

		String inputFile = "Sample1.one";
		Path inputPath = Utils.getPath(ExtractTextFromTable.class, inputFile);

		// Load the document into Aspose.Note.
		Document document = new Document(inputPath.toString(), new LoadOptions());

		// Get a list of table nodes
		List<Table> nodes = (List<Table>) document.getChildNodes(Table.class);

		// Set row count
		int rowCount = 0;

		for (Table table : nodes) {
			// Iterate through table rows
			for (TableRow row : table) {
				rowCount++;
				// Retrieve text
				String text = row.getText();
				// Print text on the output screen
				System.out.println(text);
			}
		}

		// ExEnd:ExtractRowtextfromtableinOneNotedocument

	}

}
