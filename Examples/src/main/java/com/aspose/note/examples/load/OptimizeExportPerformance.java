package com.aspose.note.examples.load;

import com.aspose.note.*;
import com.aspose.note.examples.Utils;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Path;

public class OptimizeExportPerformance {
    public static void main(String... args)
            throws IOException {

        // initialize the new Document
        Document doc = new Document();

        // Disable detection of layout changes
        doc.setAutomaticLayoutChangesDetectionEnabled(false);

        // Create a new Page
        Page page = new Page(doc);

        // Style for all text in the document.
        TextStyle textStyle = new TextStyle();
        textStyle.setFontColor(Color.BLACK);
        textStyle.setFontName("Arial");
        textStyle.setFontSize(10);

        // Create title text
        RichText titleText = new RichText(doc);
        titleText.setText("Title text.");
        titleText.setDefaultStyle(textStyle);

        // Create title date
        RichText titleDate = new RichText(doc);
        titleDate.setText("2011,11,11");
        titleDate.setDefaultStyle(textStyle);

        // Create title time
        RichText titleTime = new RichText(doc);
        titleTime.setText("12:34");
        titleTime.setDefaultStyle(textStyle);

        // Add title to page
        Title title = new Title(doc);
        title.setTitleText(titleText);
        title.setTitleDate(titleDate);
        title.setTitleTime(titleTime);
        page.setTitle(title);

        // Add page to document
        doc.appendChild(page);

        // save OneNote document in the PDF format
        Path outputPdf = Utils.getPath(OptimizeExportPerformance.class, "Output.pdf");
        doc.save(outputPdf.toString());

        // Save document in the TIFF format
        Path outputTiff = Utils.getPath(OptimizeExportPerformance.class, "Output.tiff");
        doc.save(outputTiff.toString());

        // save OneNote document in the JPG format
        Path outputJpg = Utils.getPath(OptimizeExportPerformance.class, "Output.jpg");
        doc.save(outputJpg.toString());

        // set text font size
        textStyle.setFontSize(24);

        // Manually trigger layout detection
        doc.detectLayoutChanges();

        // save OneNote document in the BMP format
        Path outputBmp = Utils.getPath(OptimizeExportPerformance.class, "Output.bmp");
        doc.save(outputBmp.toString());
    }
}

