package com.myTraining.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AuthorModel {

    private static final Logger LOG = LoggerFactory.getLogger(AuthorModel.class);

    @ChildResource(name = "authorQuotes")
    private List<Resource> authorQuotes;

    public List<String> getQuotes() {
        List<String> quotesList = new ArrayList<>();

        if (authorQuotes != null) {
            LOG.info("Author Quotes found: {}", authorQuotes.size()); // Debug Log
            for (Resource quote : authorQuotes) {
                String text = quote.getValueMap().get("authorQuotes", String.class);
                LOG.info("Fetched Quote: {}", text); // Debug Log
                if (text != null) {
                    quotesList.add(text);
                }
            }
        } else {
            LOG.warn("No Author Quotes found in the model!"); // Warning Log
        }

        return quotesList;
    }
}

