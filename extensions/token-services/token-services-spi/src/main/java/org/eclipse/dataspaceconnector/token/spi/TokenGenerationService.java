package org.eclipse.dataspaceconnector.token.spi;

import com.nimbusds.jwt.JWTClaimsSet;
import org.eclipse.dataspaceconnector.spi.result.Result;
import org.jetbrains.annotations.NotNull;

public interface TokenGenerationService {

    Result<String> generate(@NotNull JWTClaimsSet claims);
}