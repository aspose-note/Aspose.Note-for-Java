package com.aspose.note.examples.hyperlinks;

import com.aspose.note.*;
import com.aspose.note.examples.Utils;

import java.io.IOException;
import java.nio.file.Path;

public class AddHyperlink {
    public static void main(String... args)
            throws IOException {

        String outputFile = "Output.pdf";
        Path outputPath = Utils.getPath(AddHyperlink.class, outputFile);

        // create an object of the Document class
        Document doc = new Document();

        // initialize Page class object
        Page page = new Page(doc);

        // initialize Title class object
        Title title = new Title(doc);

        // initialize default text style
        TextStyle defaultTextStyle = new TextStyle();
        defaultTextStyle.setFontName("Arial");
        defaultTextStyle.setFontSize(10);
        defaultTextStyle.setFontColor(java.awt.Color.GRAY);

        RichText titleText = new RichText(doc);
        titleText.setText("Title");
        titleText.setDefaultStyle(defaultTextStyle);

        Outline outline = new Outline(doc);
        outline.setMaxWidth(200);
        outline.setMaxHeight(200);
        outline.setVerticalOffset(100);
        outline.setHorizontalOffset(100);

        OutlineElement outlineElem = new OutlineElement(doc);

        TextStyle textStyleRed = new TextStyle();
        textStyleRed.setFontName("Arial");
        textStyleRed.setFontSize(10);
        textStyleRed.setFontColor(java.awt.Color.red);
        textStyleRed.setRunIndex(8);

        TextStyle textStyleHyperlink = new TextStyle();
        textStyleHyperlink.setRunIndex(17);
        textStyleHyperlink.setHyperlink(true);
        textStyleHyperlink.setHyperlinkAddress("www.google.com");

        RichText text = new RichText(doc);
        text.setText("This is hyperlink. This text is not a hyperlink.");
        text.setDefaultStyle(defaultTextStyle);
        text.getStyles().addItem(textStyleRed);
        text.getStyles().addItem(textStyleHyperlink);

        title.setTitleText(titleText);
        page.setTitle(title);
        outlineElem.appendChild(text);

        // add outline elements
        outline.appendChild(outlineElem);

        // add Outline node
        page.appendChild(outline);

        // add Page node
        doc.appendChild(page);

        doc.save(outputPath.toString());

        System.out.printf("File saved: %s\n", outputPath);
    }
}

