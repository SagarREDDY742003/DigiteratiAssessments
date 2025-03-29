package com.myTraining.core.listeners;

import org.apache.sling.event.jobs.consumer.JobConsumer;
import org.osgi.service.component.annotations.Component;
import org.apache.sling.api.resource.observation.ResourceChangeListener;
import org.apache.sling.api.resource.observation.ResourceChange;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import static org.apache.sling.api.resource.observation.ResourceChangeListener.CHANGES;

@Component(
        service = ResourceChangeListener.class,
        property = {
                CHANGES + "=ADDED",
                "resource.paths=/content/project"
        }
)
public class PageCreationEventHandler implements ResourceChangeListener {

    private static final Logger LOG = LoggerFactory.getLogger(PageCreationEventHandler.class);

    @Reference
    private ResourceResolverFactory resourceResolverFactory;

    @Override
    public void onChange(List<ResourceChange> changes) {
        try (ResourceResolver resourceResolver = resourceResolverFactory.getServiceResourceResolver(null)) {
            for (ResourceChange change : changes) {
                Resource resource = resourceResolver.getResource(change.getPath());
                if (resource != null) {
                    LOG.info("New page created: {}", resource.getName());
                }
            }
        } catch (Exception e) {
            LOG.error("Error handling page creation event", e);
        }
    }
}
