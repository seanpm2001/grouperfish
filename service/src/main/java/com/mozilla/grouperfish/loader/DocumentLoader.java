package com.mozilla.grouperfish.loader;

import com.mozilla.grouperfish.json.Converters;
import com.mozilla.grouperfish.model.Document;


public class DocumentLoader extends Loader<Document> {

    public DocumentLoader(final String baseUrl, final String namespace) {
        super(baseUrl + "/documents/" + namespace, Converters.forDocuments());
    }

}
