package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.FileFormat;
import com.aspose.note.UnsupportedFileFormatException;
import com.aspose.note.examples.Utils;

public class LoadOneNote2007 {
    public static void main(String[] args)
    {
        String dataDir = Utils.getSharedDataDir(LoadOneNote.class) + "load\\";

        // ExStart:LoadOneNote2007
        // Load the document into Aspose.Note.
        try {
            new Document(dataDir + "OneNote2007.one");
        }
        catch (UnsupportedFileFormatException e)
        {
            if (e.getFileFormat() == FileFormat.OneNote2007)
            {
                System.out.println("It looks like the provided file is in OneNote 2007 format that is not supported.");
            }
            else
                throw e;
        }

        // ExEnd:LoadOneNote2007
    }
}
