package com.aspose.note.examples.styles;

import com.aspose.note.*;
import com.aspose.note.examples.Utils;
import com.aspose.note.examples.load.LoadPasswordProtectedOneNoteDoc;

import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class SetDefaultParagraphStyle {
    public static void main(String... args) throws IOException {
        // ExStart:SetDefaultParagraphStyle
        // ExSummary:Manipulate by text format using paragraph style.
        String dataDir = Paths.get(Utils.getSharedDataDir(LoadPasswordProtectedOneNoteDoc.class), "styles").toString();

        Document document = new Document();
        Page page = new Page();
        Outline outline = new Outline();
        OutlineElement outlineElem = new OutlineElement();

        ParagraphStyle defaultStyle = new ParagraphStyle()
                                                .setFontName("Courier New")
                                                .setFontSize(20);

        RichText text = new RichText()
                            .append("DefaultParagraphFontAndSize")
                            .append(System.lineSeparator())
                            .append("OnlyDefaultParagraphFont", new TextStyle().setFontSize(14))
                            .append(System.lineSeparator())
                            .append("OnlyDefaultParagraphFontSize", new TextStyle().setFontName("Verdana"));
        text.setParagraphStyle(defaultStyle);

        outlineElem.appendChildLast(text);
        outline.appendChildLast(outlineElem);
        page.appendChildLast(outline);
        document.appendChildLast(page);

        document.save(Paths.get(dataDir, "SetDefaultParagraphStyle.one").toString());
        // ExEnd:SetDefaultParagraphStyle
    }
}
