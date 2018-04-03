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
        Page page = new Page(doc);

        // Default style for all text in the document.
        TextStyle textStyle = new TextStyle();
        textStyle.setFontColor(Color.BLACK);
        textStyle.setFontName("Arial");
        textStyle.setFontSize(10);

        // Set page title properties
        Title title = new Title(doc);

        RichText titleText = new RichText(doc);
        titleText.setText("Title text.");
        titleText.setDefaultStyle(textStyle);
        title.setTitleText(titleText);

        RichText titleDate = new RichText(doc);
        Calendar cal = Calendar.getInstance();
        cal.set(2018, 04, 03);
        titleDate.setText(cal.getTime().toString());
        titleDate.setDefaultStyle(textStyle);
        title.setTitleDate(titleDate);

        RichText titleTime = new RichText(doc);
        titleTime.setText("12:34");
        titleTime.setDefaultStyle(textStyle);
        title.setTitleText(titleTime);

        page.setTitle(title);

        // Append Page node in the document
        doc.appendChild(page);

        dataDir = dataDir + "load//CreateDocWithPageTitle_out.one";

        // Save OneNote document
        doc.save(dataDir);
        // ExEnd:CreateDocWithPageTitle
        
        System.out.println("Done..");
    }
}
