package com.checkmarx.flow.service;

import com.checkmarx.flow.dto.ScanRequest;
import com.checkmarx.flow.dto.Sources;
import com.checkmarx.sdk.dto.CxConfig;
import com.checkmarx.sdk.exception.CheckmarxException;
import com.checkmarx.sdk.utils.ScanUtils;

public abstract class RepoService {

    public abstract Sources getRepoContent(ScanRequest request);

    public CxConfig getCxConfigOverride(ScanRequest request) {
        return null;
    }
    
}
