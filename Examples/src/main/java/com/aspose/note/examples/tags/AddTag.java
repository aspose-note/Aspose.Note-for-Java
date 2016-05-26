package com.aspose.note.examples.tags;

import com.aspose.note.*;
import com.aspose.note.examples.Utils;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Path;

public class AddTag {
    public static void main(String... args)
            throws IOException {

        // create an object of the Document class
        Document doc = new Document();

        // initialize Page class object
        Page page = new Page(doc);

        // initialize Outline class object
        Outline outline = new Outline(doc);

        // initialize OutlineElement class object
        OutlineElement outlineElem = new OutlineElement(doc);
        TextStyle textStyle = new TextStyle();
        textStyle.setFontColor(Color.black);
        textStyle.setFontName("Arial");
        textStyle.setFontSize(10);

        RichText text = new RichText(doc);
        text.setText("OneNote text.");
        text.setDefaultStyle(textStyle);

        NoteTag noteTag = new NoteTag();
        noteTag.setIcon(TagIcon.YellowStar);
        text.getTags().add(noteTag);

        // add text node
        outlineElem.appendChild(text);
        // add outline element node
        outline.appendChild(outlineElem);
        // add outline node
        page.appendChild(outline);
        // add page node
        doc.appendChild(page);

        Path outputPdf = Utils.getPath(AddTag.class, "Output.pdf");
        doc.save(outputPdf.toString(), SaveFormat.Pdf);
        System.out.printf("File Saved: %s\n", outputPdf);
    }
}

