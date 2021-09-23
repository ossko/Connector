package org.eclipse.dataspaceconnector.spi.types.domain.contract;

import org.eclipse.dataspaceconnector.policy.model.Policy;
import org.eclipse.dataspaceconnector.spi.types.domain.asset.Asset;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * The providing connector may offer assets to other connectors. The relationship between these assets and
 * their corresponding rules is described in the {@link OfferedAsset} object.
 */
public class OfferedAsset {
    private Policy policy;
    private Asset asset;

    @NotNull
    public Policy getPolicy() {
        return policy;
    }

    @NotNull
    public Asset getAsset() {
        return asset;
    }

    public static final class Builder {
        private Policy policy;
        private Asset asset;

        private Builder() {
        }

        public static Builder newInstance() {
            return new Builder();
        }

        public Builder policy(final Policy policy) {
            this.policy = policy;
            return this;
        }

        public Builder asset(final Asset asset) {
            this.asset = asset;
            return this;
        }

        public OfferedAsset build() {
            final OfferedAsset offeredAsset = new OfferedAsset();
            offeredAsset.asset = Objects.requireNonNull(this.asset);
            offeredAsset.policy = Objects.requireNonNull(this.policy);
            return offeredAsset;
        }
    }
}