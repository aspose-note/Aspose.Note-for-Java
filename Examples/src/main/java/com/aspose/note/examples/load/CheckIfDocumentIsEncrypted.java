package com.aspose.note.examples.load;

import com.aspose.note.Document;
import com.aspose.note.LoadOptions;
import com.aspose.note.examples.Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;

public class CheckIfDocumentIsEncrypted {
    public static void main(String... args) throws IOException
    {
        CheckIfDocumentFromStreamIsEncrypted();
        CheckIfDocumentFromFileIsEncrypted();
    }

    public static void CheckIfDocumentFromStreamIsEncrypted() throws IOException
    {
        // ExStart:CheckIfDocumentFromStreamIsEncrypted
        String dataDir = Paths.get(Utils.getSharedDataDir(LoadPasswordProtectedOneNoteDoc.class), "load").toString();

        LoadOptions loadOptions = new LoadOptions();
        loadOptions.setDocumentPassword("password");

        FileInputStream stream = new FileInputStream(Paths.get(dataDir, "Sample1.one").toString());

        try {
            Document ref[] = { null };
            if (!Document.isEncrypted(stream, loadOptions, ref))
            {
                System.out.println("The document is loaded and ready to be processed.");
            }
            else
            {
                System.out.println("The document is encrypted. Provide a password.");
            }
        }
        finally {
            stream.close();
        }

        // ExEnd:CheckIfDocumentFromStreamIsEncrypted
    }

    public static void CheckIfDocumentFromFileIsEncrypted() throws IOException
    {
        // ExStart:CheckIfDocumentFromFileIsEncrypted
        String dataDir = Paths.get(Utils.getSharedDataDir(LoadPasswordProtectedOneNoteDoc.class), "load").toString();

        Document ref[] = { null };
        if (!Document.isEncrypted(Paths.get(dataDir, "Sample1.one").toString(), "VerySecretPassword", ref))
        {
            if (ref[0] != null)
            {
                System.out.println("The document is decrypted. It is loaded and ready to be processed.");
            }
            else
            {
                System.out.println("The document is encrypted. Invalid password was provided.");
            }
        }
        else
        {
            System.out.println("The document is NOT encrypted. It is loaded and ready to be processed.");
        }

        // ExEnd:CheckIfDocumentFromFileIsEncrypted
    }
}
