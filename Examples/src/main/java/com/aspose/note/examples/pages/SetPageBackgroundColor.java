package com.aspose.note.examples.pages;

import com.aspose.note.Document;
import com.aspose.note.Page;
import com.aspose.note.examples.Utils;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SetPageBackgroundColor {
    public static void main(String[] args) throws IOException {
        // ExStart:SetPageBackgroundColor
        // The path to the documents directory.
        Path dataDir = Paths.get(Utils.getSharedDataDir(WorkingWithPageRevisions.class), "pages");

        // Load OneNote document and get first child
        Document document = new Document(dataDir.resolve("Sample1.one").toString());

        for (Page page: document)
        {
            page.setBackgroundColor(Color.MAGENTA);
        }

        document.save(dataDir.resolve("SetPageBackgroundColor.one").toString());
        // ExEnd:SetPageBackgroundColor
    }
}
