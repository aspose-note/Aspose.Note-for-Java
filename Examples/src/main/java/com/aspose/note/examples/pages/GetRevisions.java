package com.aspose.note.examples.pages;

import com.aspose.note.Document;
import com.aspose.note.Page;
import com.aspose.note.examples.Utils;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class GetRevisions {
    public static void main(String... args)
            throws IOException {

        String inputFile = "Sample1.one";
        Path inputPath = Utils.getPath(GetRevisions.class, inputFile);

        // Load the document into Aspose.Note
        Document doc = new Document(inputPath.toString());

        // Get first page
        Page firstPage = doc.getFirstChild();

        // Get page revisions
        List<Page> revisions = doc.getPageHistory(firstPage);

        // Traverse list of page revisions
        for (Page pageRevision : revisions) {
            System.out.println("LastModifiedTime: " + pageRevision.getLastModifiedTime());
            System.out.println("CreationTime: " + pageRevision.getCreationTime());
            System.out.println("Title: " + pageRevision.getTitle());
            System.out.println("Level: " + pageRevision.getLevel());
            System.out.println("Author: " + pageRevision.getAuthor());
            System.out.println();
        }
    }
}

