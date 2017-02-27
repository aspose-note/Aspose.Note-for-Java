package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.examples.Utils;

public class LoadOneNote {
    public static void main(String[] args)
    {
        String dataDir = Utils.getSharedDataDir(LoadOneNote.class) + "load\\";

        // ExStart:LoadOneNote
        // Load the document into Aspose.Note.
        Document oneFile = new Document(dataDir + "Aspose.one");
        // ExEnd:LoadOneNote
    }
}
