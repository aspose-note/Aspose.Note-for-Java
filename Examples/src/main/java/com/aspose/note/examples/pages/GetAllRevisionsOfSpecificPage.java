package com.aspose.note.examples.pages;

import com.aspose.note.Document;
import com.aspose.note.LoadOptions;
import com.aspose.note.Page;

public class GetAllRevisionsOfSpecificPage {

    public static void main(String... args) {
        //ExStart:GetAllRevisionsOfSpecificPage        
        LoadOptions loadOptions = new LoadOptions();
        loadOptions.setLoadHistory(true);
        // load OneNote document
        Document document = new Document("MyOneNote.one", loadOptions);
        // get first page
        Page firstPage = document.getFirstChild();
        for (Page pageRevision:document.getPageHistory(firstPage))
        {
            //Use pageRevision like a regular page.            
            System.out.println("LastModifiedTime: " + pageRevision.getLastModifiedTime());
            System.out.println("CreationTime: " + pageRevision.getCreationTime());
            System.out.println("Title: " + pageRevision.getTitle());
            System.out.println("Level: " + pageRevision.getLevel());
            System.out.println("Author: " + pageRevision.getAuthor());
            System.out.println();            
        }
        //ExEnd:GetAllRevisionsOfSpecificPage
    }
    
}
