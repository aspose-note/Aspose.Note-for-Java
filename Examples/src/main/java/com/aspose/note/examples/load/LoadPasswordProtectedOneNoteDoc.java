package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.LoadOptions;

public class LoadPasswordProtectedOneNoteDoc {
    public static void main(String... args) {
        //ExStart:LoadPasswordProtectedOneNoteDoc
        LoadOptions loadOptions = new LoadOptions();

        loadOptions.setDocumentPassword("password");

        Document doc = new Document("in.one", loadOptions);
        //ExEnd:LoadPasswordProtectedOneNoteDoc
    }    
}
