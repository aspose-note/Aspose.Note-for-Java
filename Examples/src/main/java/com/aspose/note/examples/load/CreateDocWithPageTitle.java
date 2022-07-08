package com.aspose.note.examples.load;

import com.aspose.note.*;
import com.aspose.note.examples.Utils;

import java.awt.*;
import java.io.IOException;
import java.util.Calendar;

public class CreateDocWithPageTitle {
    public  static void main(String[] args) throws IOException {
        // ExStart:CreateDocWithPageTitle
        // The path to the documents directory.
        String dataDir = Utils.getSharedDataDir(CreateDocWithPageTitle.class);

        // Create an object of the Document class
        Document doc = new Document();

        // Initialize Page class object
        Page page = new Page();

        // Default style for all text in the document.
        ParagraphStyle textStyle = new ParagraphStyle()
                                        .setFontColor(Color.BLACK)
                                        .setFontName("Arial")
                                        .setFontSize(10);

        // Set page title properties
        Title title = new Title();

        RichText titleText = new RichText();
        titleText.setText("Title text.");
        titleText.setParagraphStyle(textStyle);
        title.setTitleText(titleText);

        RichText titleDate = new RichText();
        Calendar cal = Calendar.getInstance();
        cal.set(2018, 04, 03);
        titleDate.setText(cal.getTime().toString());
        titleDate.setParagraphStyle(textStyle);
        title.setTitleDate(titleDate);

        RichText titleTime = new RichText();
        titleTime.setText("12:34");
        titleTime.setParagraphStyle(textStyle);
        title.setTitleText(titleTime);

        page.setTitle(title);

        // Append Page node in the document
        doc.appendChildLast(page);

        dataDir = dataDir + "load//CreateDocWithPageTitle_out.one";

        // Save OneNote document
        doc.save(dataDir);
        // ExEnd:CreateDocWithPageTitle
        
        System.out.println("Done.");
    }
}
