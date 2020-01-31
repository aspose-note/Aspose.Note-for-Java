package com.aspose.note.examples.tables;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import com.aspose.note.Document;
import com.aspose.note.RichText;
import com.aspose.note.Table;
import com.aspose.note.TableCell;
import com.aspose.note.TableRow;
import com.aspose.note.examples.Utils;

public class GetCellTextFromRowOfTable {
	public static void main(String... args) throws IOException {
		// ExStart:GetCellTextFromRowOfTable
		String dataDir = Utils.getSharedDataDir(GetCellTextFromRowOfTable.class) + "tables/";

		// Load the document into Aspose.Note.
		Document document = new Document(dataDir + "Sample1.one");

		// Get a list of table nodes
		List<Table> nodes = (List<Table>) document.getChildNodes(Table.class);


		for (Table table : nodes) {
			// Iterate through table rows
			for (TableRow row : table) {
				// Get list of TableCell nodes
				List<TableCell> cellNodes = (List<TableCell>) row.getChildNodes(TableCell.class);
				// iterate through table cells
				for (TableCell cell : cellNodes) {
					// Retrieve text
					String text = cell.getChildNodes(RichText.class).stream()
							.map(RichText::getText)
							.collect(Collectors.joining(System.lineSeparator()));
					// Print text on the output screen
					System.out.println(text);
				}
			}
		}
		// ExEnd:GetCellTextFromRowOfTable
	}

}
