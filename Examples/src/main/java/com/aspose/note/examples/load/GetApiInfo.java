package com.aspose.note.examples.load;

import com.aspose.note.AssemblyConstants;

public class GetApiInfo {

    public static void main(String... args) {
        //ExStart:CheckVersionNumber
        System.out.println("Family: " + AssemblyConstants.getFamily());

        System.out.println("Platform: " + AssemblyConstants.getPlatform());

        System.out.println("Product: " + AssemblyConstants.getProduct());

        System.out.println("Release date: " + AssemblyConstants.getReleaseDate());
        //ExEnd:CheckVersionNumber
    }
}
