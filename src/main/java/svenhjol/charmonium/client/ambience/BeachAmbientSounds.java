package svenhjol.charmonium.client.ambience;

import net.minecraft.client.sound.SoundManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.biome.Biome;
import svenhjol.charmonium.base.CharmoniumSounds;
import svenhjol.charmonium.iface.IBiomeAmbience;

import javax.annotation.Nullable;

public class BeachAmbientSounds extends BaseAmbientSounds implements IBiomeAmbience {
    public BeachAmbientSounds(PlayerEntity player, SoundManager soundHandler) {
        super(player, soundHandler);
    }

    @Nullable
    @Override
    public SoundEvent getLongSound() {
        return CharmoniumSounds.AMBIENCE_BEACH_LONG;
    }

    @Override
    public boolean validBiomeConditions(Biome.Category biomeCategory) {
        return biomeCategory == Biome.Category.BEACH && isOutside();
    }
}
