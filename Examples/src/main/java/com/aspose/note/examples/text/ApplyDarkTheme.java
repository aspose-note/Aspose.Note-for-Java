package com.aspose.note.examples.text;

import com.aspose.note.*;
import com.aspose.note.examples.Utils;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Paths;

public class ApplyDarkTheme {
    public static void main(String... args) throws IOException {
        // ExStart:ApplyDarkTheme
        // ExSummary:Shows how to apply Dark theme style to a Document.

        // The path to the documents directory.
        String dataDir = Utils.getSharedDataDir(ApplyDarkTheme.class) + "text/";

        // Load the document into Aspose.Note.
        Document doc = new Document(Paths.get(dataDir, "Aspose.one").toString());

        for (Page page: doc)
        {
            page.setBackgroundColor(Color.BLACK);
        }

        for (RichText node: doc.getChildNodes(RichText.class))
        {
            Color c = node.getParagraphStyle().getFontColor();
            if (c.getAlpha() <= 10 || Math.abs(c.getRed() - Color.BLACK.getRed()) + Math.abs(c.getGreen() - Color.BLACK.getGreen()) + Math.abs(c.getBlue() - Color.BLACK.getBlue()) <= 30)
            {
                node.getParagraphStyle().setFontColor(Color.WHITE);
            }
        }

        doc.save(Paths.get(dataDir, "AsposeDarkTheme.pdf").toString());

        // ExEnd:ApplyDarkTheme
    }
}
