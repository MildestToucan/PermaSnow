package io.github.mildesttoucan.permasnow.config;

import folk.sisby.kaleido.api.WrappedConfig;
import folk.sisby.kaleido.lib.quiltconfig.api.annotations.Comment;

public class PermaSnowConfig extends WrappedConfig {

    @Comment("Whether snow should melt from light sources. Off by default.")
    public boolean shouldSnowMelt = false;

    @Comment("If melting is allowed, then this setting can be used to change the required light level. 11 is the Vanilla default.")
    public int meltingLightLevel = 11;


}
