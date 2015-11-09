package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.ImageSaveOptions;
import com.aspose.note.PdfSaveOptions;
import com.aspose.note.SaveFormat;
import com.aspose.note.examples.Utils;

import java.io.IOException;
import java.nio.file.Path;

public class ConvertToImage {
    public static void main(String... args)
            throws IOException {

        String inputFile = "Sample1.one";
        Path inputPath = Utils.getPath(ConvertToImage.class, inputFile);
        String outputFile = "Output.png";
        Path outputPath = Utils.getPath(ConvertToImage.class, outputFile);

        // Load the document into Aspose.Note
        Document oneFile = new Document(inputPath.toString());

        // Initialize PdfSaveOptions object
        ImageSaveOptions options = new ImageSaveOptions(SaveFormat.Png);

        // Save the document as PNG
        oneFile.save(outputPath.toString(), options);

        System.out.println("File saved: " + outputPath);
    }
}

