package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.PdfSaveOptions;
import com.aspose.note.examples.Utils;
import com.aspose.note.fonts.DocumentFontsSubsystem;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;

public class SaveUsingSpecifiedFontsSubsystem {
    public static void main(String... args) throws IOException {
        SaveUsingDocumentFontsSubsystemWithDefaultFontName();
        SaveUsingDocumentFontsSubsystemWithDefaultFontFromFile();
        SaveUsingDocumentFontsSubsystemWithDefaultFontFromStream();

        System.out.println("\nDocument with missing font is successfully saved at " + Utils.getSharedDataDir(SaveOneNoteDocToStream.class) + "load/");
    }

    public static void SaveUsingDocumentFontsSubsystemWithDefaultFontName() throws IOException
    {
        // ExStart:SaveUsingDocumentFontsSubsystemWithDefaultFontName
        // ExSummary:Shows how to save a document in pdf format using specified default font.

        // The path to the documents directory.
        String dataDir = Utils.getSharedDataDir(SaveOneNoteDocToStream.class) + "load/";

        // Load the document into Aspose.Note.
        Document oneFile = new Document(Paths.get(dataDir, "missing-font.one").toString());

        // Save the document as PDF
        dataDir = dataDir + "SaveUsingDocumentFontsSubsystemWithDefaultFontName_out.pdf";

        PdfSaveOptions options = new PdfSaveOptions();
        options.setFontsSubsystem(DocumentFontsSubsystem.usingDefaultFont("Times New Roman"));
        oneFile.save(dataDir, options);

        // ExEnd:SaveUsingDocumentFontsSubsystemWithDefaultFontName
    }

    public static void SaveUsingDocumentFontsSubsystemWithDefaultFontFromFile() throws IOException
    {
        // ExStart:SaveUsingDocumentFontsSubsystemWithDefaultFontFromFile
        // ExSummary:Shows how to save a document in pdf format using default font from a file.

        // The path to the documents directory.
        String dataDir = Utils.getSharedDataDir(SaveOneNoteDocToStream.class) + "load/";

        String fontFile = Paths.get(dataDir, "geo_1.ttf").toString();

        // Load the document into Aspose.Note.
        Document oneFile = new Document(Paths.get(dataDir, "missing-font.one").toString());

        // Save the document as PDF
        dataDir = dataDir + "SaveUsingDocumentFontsSubsystemWithDefaultFontFromFile_out.pdf";

        PdfSaveOptions options = new PdfSaveOptions();
        options.setFontsSubsystem(DocumentFontsSubsystem.usingDefaultFontFromFile(fontFile));
        oneFile.save(dataDir, options);

        // ExEnd:SaveUsingDocumentFontsSubsystemWithDefaultFontFromFile
    }

    public static void SaveUsingDocumentFontsSubsystemWithDefaultFontFromStream() throws IOException
    {
        // ExStart:SaveUsingDocumentFontsSubsystemWithDefaultFontFromStream
        // ExSummary:Shows how to save a document in pdf format using default font from a stream.

        // The path to the documents directory.
        String dataDir = Utils.getSharedDataDir(SaveOneNoteDocToStream.class) + "load/";

        String fontFile = Paths.get(dataDir, "geo_1.ttf").toString();

        // Load the document into Aspose.Note.
        Document oneFile = new Document(Paths.get(dataDir, "missing-font.one").toString());

        // Save the document as PDF
        dataDir = dataDir + "SaveUsingDocumentFontsSubsystemWithDefaultFontFromStream_out.pdf";

        InputStream stream = new FileInputStream(fontFile);
        try
        {
            PdfSaveOptions options = new PdfSaveOptions();
            options.setFontsSubsystem(DocumentFontsSubsystem.usingDefaultFontFromStream(stream));
            oneFile.save(dataDir, options);
        }
        catch (Exception e)
        {
            stream.close();
        }

        // ExEnd:SaveUsingDocumentFontsSubsystemWithDefaultFontFromStream
    }
}
