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

        RichText text = new RichText()
                                .append("United States", new TextStyle().setLanguage(Locale.forLanguageTag("en-US")))
                                .append(" Germany", new TextStyle().setLanguage(Locale.forLanguageTag("de-DE")))
                                .append(" China", new TextStyle().setLanguage(Locale.forLanguageTag("zh-CN")));
        text.setParagraphStyle(ParagraphStyle.getDefault());

        outlineElem.appendChildLast(text);
        outline.appendChildLast(outlineElem);
        page.appendChildLast(outline);
        document.appendChildLast(page);

        document.save(Paths.get(dataDir, "SetProofingLanguageForText.one").toString());
        // ExEnd:SetProofingLanguageForText
    }
}
