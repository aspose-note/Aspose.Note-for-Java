package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.ImageSaveOptions;
import com.aspose.note.SaveFormat;
import java.io.IOException;

public class SetOutputImageResolution {
    public static void main(String... args) throws IOException {
        //ExStart:SetOutputImageResolution
        Document doc = new Document("input.one");

        ImageSaveOptions imageSaveOptions = new ImageSaveOptions(SaveFormat.Jpeg);

        imageSaveOptions.setResolution(120);

        doc.save("out.jpg", imageSaveOptions);
        //ExEnd:SetOutputImageResolution
    }    
}
