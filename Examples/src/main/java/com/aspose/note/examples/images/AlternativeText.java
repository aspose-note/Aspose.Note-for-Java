
package com.aspose.note.examples.images;

import java.io.IOException;
import com.aspose.note.Document;
import com.aspose.note.Page;
import com.aspose.note.Image;
import com.aspose.note.examples.Utils;
import java.nio.file.Path;


public class AlternativeText {
    
    public static void main(String... args) throws IOException {
        
        // ExStart:AlternativeText
        String outputFile = "output.one";
        Path outputPath = Utils.getPath(AlternativeText.class, outputFile);
        
        String imageFile = "image.jpg";
        Path imageFilePath = Utils.getPath(AlternativeText.class, imageFile);
        
        Document document = new Document();

        Page page = new Page(document);

        Image image = new Image(document, imageFilePath.toString());

        image.setAlternativeText("ImageAlternativeText");

        page.appendChild(image);

        document.appendChild(page);

        document.save(outputPath.toString());
        
        // ExEnd:AlternativeText
    }
}
