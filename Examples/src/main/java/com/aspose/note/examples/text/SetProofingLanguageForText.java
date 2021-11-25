package com.aspose.note.examples.text;

import com.aspose.note.*;
import com.aspose.note.examples.Utils;
import com.aspose.note.examples.load.LoadPasswordProtectedOneNoteDoc;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Locale;

public class SetProofingLanguageForText {
    public static void main(String... args) throws IOException {
        // ExStart:SetProofingLanguageForText
        // ExSummary:Set proofing language for a text.
        String dataDir = Paths.get(Utils.getSharedDataDir(LoadPasswordProtectedOneNoteDoc.class), "text").toString();

        Document document = new Document();
        Page page = new Page();
        Outline outline = new Outline();
        OutlineElement outlineElem = new OutlineElement();

        RichText text = new RichText();
        text.setText("United States Germany China");
        text.setParagraphStyle(ParagraphStyle.getDefault());

        // Font and font size are from text.ParagraphStyle
        TextStyle style = new TextStyle();
        style.setLanguage(Locale.forLanguageTag("en-US"));
        style.setRunIndex(13);
        text.getStyles().addItem(style);

        // Only font is from text.ParagraphStyle
        style = new TextStyle();
        style.setLanguage(Locale.forLanguageTag("de-DE"));
        style.setRunIndex(21);
        text.getStyles().addItem(style);

        // Only font size is from text.ParagraphStyle
        style = new TextStyle();
        style.setLanguage(Locale.forLanguageTag("zh-CN"));
        style.setRunIndex(text.getText().length());
        text.getStyles().addItem(style);


        outlineElem.appendChildLast(text);
        outline.appendChildLast(outlineElem);
        page.appendChildLast(outline);
        document.appendChildLast(page);

        document.save(Paths.get(dataDir, "SetProofingLanguageForText.one").toString());
        // ExEnd:SetProofingLanguageForText
    }
}
