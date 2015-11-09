package com.aspose.note.examples.tables;

import com.aspose.note.Document;
import com.aspose.note.Table;
import com.aspose.note.examples.Utils;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class ExtractTextFromTable {
    public static void main(String... args)
            throws IOException {

        String inputFile = "Sample1.one";
        Path inputPath = Utils.getPath(ExtractTextFromTable.class, inputFile);

        // Load the document into Aspose.Note
        Document document = new Document(inputPath.toString());

        // Get a list of table nodes
        List<Table> nodes = document.getChildNodes(Table.class);

        // Set table count
        int tblCount = 0;

        for (int i = 0; i< nodes.size(); i++) {
            Table table = nodes.get(i);
            System.out.println("Table # " + i);

            // Retrieve text
            String text = table.getText();

            // Print text on the output screen
            System.out.println(text);
        }
    }
}

