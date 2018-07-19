package com.hack.street.ninjas.ecr.service;

import com.amazonaws.services.lambda.runtime.Context;
import com.hack.street.ninjas.ecr.entity.request.EcrImageMetaData;
import com.hack.street.ninjas.ecr.entity.response.EcrImageDataPublisherResponse;

public interface EcrImageDataPublisherService {
    EcrImageDataPublisherResponse publishEcrImageData(EcrImageMetaData imageData, Context context);
}
