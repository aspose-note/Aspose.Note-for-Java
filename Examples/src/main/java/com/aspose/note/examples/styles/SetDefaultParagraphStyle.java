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

        StringBuilder builder = new StringBuilder();
        builder.append("DefaultParagraphFontAndSize");
        builder.append(System.lineSeparator());
        builder.append("OnlyDefaultParagraphFont");
        builder.append(System.lineSeparator());
        builder.append("OnlyDefaultParagraphFontSize");

        ParagraphStyle defaultStyle = new ParagraphStyle()
                                                .setFontName("Courier New")
                                                .setFontSize(20);

        RichText text = new RichText();
        text.setText(builder.toString());
        text.setParagraphStyle(defaultStyle);

        // Font and font size are from text.ParagraphStyle
        TextStyle style = new TextStyle();
        style.setRunIndex(27);
        text.getStyles().addItem(style);

        // Only font is from text.ParagraphStyle
        style = new TextStyle().setFontSize(14);
        style.setRunIndex(53);
        text.getStyles().addItem(style);

        // Only font size is from text.ParagraphStyle
        style = new TextStyle().setFontName("Verdana");
        style.setRunIndex(text.getText().length());
        text.getStyles().addItem(style);


        outlineElem.appendChildLast(text);
        outline.appendChildLast(outlineElem);
        page.appendChildLast(outline);
        document.appendChildLast(page);

        document.save(Paths.get(dataDir, "SetDefaultParagraphStyle.one").toString());
        // ExEnd:SetDefaultParagraphStyle
    }
}
