package com.aspose.note.examples.tables;

import com.aspose.note.*;
import java.io.IOException;
import com.aspose.note.Document;
import com.aspose.note.Page;
import com.aspose.note.LoadOptions;
import com.aspose.note.examples.Utils;
import java.nio.file.Path;

import java.util.*;

public class GetCellTextFromRowOfTable {
	public static void main(String... args) throws IOException {

		// ExStart:GetCellTextFromRowOfTable

		String inputFile = "Sample1.one";
		Path inputPath = Utils.getPath(ExtractTextFromTable.class, inputFile);

		// Load the document into Aspose.Note.
		Document document = new Document(inputPath.toString());

		// Get a list of table nodes
		List<Table> nodes = (List<Table>) document.getChildNodes(Table.class);

		// Set cell count
		int cellCount = 0;

		for (Table table : nodes) {
			// Iterate through table rows
			for (TableRow row : table) {
				// Get list of TableCell nodes
				List<TableCell> cellNodes = (List<TableCell>) row.getChildNodes(TableCell.class);
				// iterate through table cells
				for (TableCell cell : cellNodes) {
					// Retrieve text
					String text = cell.getText();
					// Print text on the output screen
					System.out.println(text);
				}
			}
		}

		// ExEnd:GetCellTextFromRowOfTable

	}

}
