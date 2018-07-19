package com.hack.street.ninjas.ecr.dependency.management;

import com.google.inject.AbstractModule;
import com.hack.street.ninjas.ecr.service.EcrImageDataPublisherService;
import com.hack.street.ninjas.ecr.service.impl.EcrImageDataPublisherServiceImpl;

public class LambdaModule extends AbstractModule {
    @Override
    protected void configure() {
        // Get EcrImageDataPublisherServiceImpl
        bind(EcrImageDataPublisherService.class).to(EcrImageDataPublisherServiceImpl.class);
    }
}
