package com.aspose.note.examples.styles;

import com.aspose.note.Document;
import com.aspose.note.RichText;
import com.aspose.note.TextStyle;
import com.aspose.note.examples.Utils;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class ChangeTextStyle {
    public static void main(String... args)
            throws IOException {
        String inputFile = "Sample1.one";
        Path inputPath = Utils.getPath(ChangeTextStyle.class, inputFile);
        String outputFile = "Output.pdf";
        Path outputPath = Utils.getPath(ChangeTextStyle.class, outputFile);

        // Load the document into Aspose.Note
        Document document = new Document(inputPath.toString());

        // Get a particular RichText node
        List<RichText> richTextNodes = document.getChildNodes(RichText.class);
        RichText richText = richTextNodes.get(0);

        for (TextStyle style : richText.getStyles()) {
            // Set font color
            style.setFontColor(Color.yellow);
            // Set highlight color
            style.setHighlight(Color.blue);
            // Set font size
            style.setFontSize(20);
        }

        document.save(outputPath.toString());
        System.out.printf("File saved: %s\n", outputPath);
    }
}

