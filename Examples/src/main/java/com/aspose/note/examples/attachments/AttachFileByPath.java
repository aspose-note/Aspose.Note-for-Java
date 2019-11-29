package com.aspose.note.examples.attachments;

import com.aspose.note.*;
import com.aspose.note.examples.Utils;

import java.io.IOException;

public class AttachFileByPath {
    public static void main(String[] args) throws IOException {
        // ExStart:AttachFileByPath
        // The path to the documents directory.
        String dataDir = Utils.getSharedDataDir(AttachFileByPath.class) + "attachments\\";

        // Create an object of the Document class
        Document doc = new Document();

        // Initialize Page class object
        Page page = new Page(doc);

        // Initialize Outline class object
        Outline outline = new Outline(doc);

        // Initialize OutlineElement class object
        OutlineElement outlineElem = new OutlineElement(doc);

        // Initialize AttachedFile class object
        AttachedFile attachedFile = new AttachedFile(doc,  dataDir + "attachment.txt");

        // Add attached file
        outlineElem.appendChildLast(attachedFile);

        // Add outline element node
        outline.appendChildLast(outlineElem);

        // Add outline node
        page.appendChildLast(outline);

        // Add page node
        doc.appendChildLast(page);
        dataDir = dataDir + "AttachFileByPath_out.one";
        doc.save(dataDir);
        // ExEnd:AttachFileByPath
    }
}
