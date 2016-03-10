/*
 * The MIT License (MIT)
 *
 * Copyright (c) 1998-2016 Aspose Pty Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.aspose.utils;

/*
 * @author Adeel Ilyas <adeel.ilyas@aspose.com>
 */

import java.io.File;

public class AsposeConstants {

    public static final String API_NAME = "Aspose.Note";
    public static final String API_MAVEN_DEPENDENCY = "aspose-note";
    public static final String API_EXAMPLES_PACKAGE ="com"+File.separator+API_MAVEN_DEPENDENCY.replace("-",File.separator)+File.separator+"examples";
    public static final String SOURCE_API_EXAMPLES_LOCATION ="Examples"+File.separator+"src"+File.separator+"main"+File.separator+"java"+File.separator+API_EXAMPLES_PACKAGE;
    public static final String SOURCE_API_EXAMPLES_RESOURCES_LOCATION ="Examples"+File.separator+"src"+File.separator+"main"+File.separator+"resources"+File.separator+API_EXAMPLES_PACKAGE;
    public static final String DESTINATION_API_EXAMPLES_LOCATION="src"+File.separator+"main"+File.separator+"java"+File.separator+ API_EXAMPLES_PACKAGE;
    public static final String DESTINATION_API_EXAMPLES_RESOURCES_LOCATION="src"+File.separator+"main"+File.separator+"resources"+File.separator+ API_EXAMPLES_PACKAGE;

    public static final String REPOSITORY_UTIL=SOURCE_API_EXAMPLES_LOCATION+File.separator+"Utils.java";
    public static final String API_DEPENDENCY_NOT_FOUND = "Dependency not found!";

    public static final String MAVEN_POM_XML = "pom.xml";

    public static final String WIZARD_NAME = "Aspose.Note Maven Project";
    public static final String ASPOSE_SELECT_EXAMPLE = "Please just select one examples category";

    public static final String INTERNET_CONNNECTIVITY_PING_URL = "java.sun.com";

    // Messages UI text

    public static final String MAVEN_INTERNET_CONNECTION_REQUIRED_MESSAGE = "Internet connectivity is not available!\nInternet connectivity is required to retrieve latest Aspose.Note Maven Artifact";

    public static final String EXAMPLES_INTERNET_CONNECTION_REQUIRED_MESSAGE = "Internet connectivity is required to download examples";
    public static final String MAVEN_ARTIFACTS_RETRIEVE_FAIL = "Unknown Error!\nCould not retrieve latest Aspose.Note Maven Artifact!";

    public static final String EXAMPLES_DOWNLOAD_FAIL = "Unknown Error!\nCould not download Aspose.Note for Java API example Source codes!";
    public static final String EXAMPLES_NOT_AVAILABLE_MESSAGE = "This component does not have examples yet, We will add examples soon";
    public static final String EXAMPLES_NOT_AVAILABLE_TITLE="Examples not available";

    public static final String EXAMPLES_PREPARING_REFRESH = "Preparing to refresh examples";
    public static final String EXAMPLES_SELECT_JAVA_API = "Select Java API";
    public static final String EXAMPLES_PLEASE_WAIT_PREPARING_REFRESH = "Please wait. Preparing to refresh examples";
    public static final String EXAMPLES_FOR_JAVA_API_AND_EXAMPLES = " for Java API and Examples";
    public static final String EXAMPLES_ADD_MAVEN_DEPENDENCY = "Please first add maven dependency of ";
    public static final String EXAMPLES_FOR_JAVA_API = " for java API";
    public static final String WIZARD_FAILED_TO_CREATE_A_MAVEN_PROJECT = "Failed to create a Maven project";
    public static final String WIZARD_SPECIFY_GROUP_ID = "Please, specify groupId";
    public static final String WIZARD_SPECIFY_ARTIFACT_ID = "Please, specify artifactId";
    public static final String WIZARD_SPECIFY_VERSION = "Please, specify version";

    public static boolean printing_allowed = false;

    public static final void println(String message) {
        if (printing_allowed) {
            System.out.println(message);
        }
    }
}
