package de.bergwerklabs.framework.commons.spigot.npc;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;

/**
 * Created by Yannic Rieger on 20.07.2017.
 * <p>  </p>
 *
 * @author Yannic Rieger
 */
public class PlayerSkin {

    private String value;
    private String signature;

    public PlayerSkin(String value, String signature) {
        this.value = value;
        this.signature = signature;
    }

    public String getValue() {
        return value;
    }

    public String getSignature() {
        return signature;
    }

    public void inject(GameProfile gameProfile) {
        gameProfile.getProperties().removeAll("textures");
        gameProfile.getProperties().put("textures", new Property("textures", this.getValue(), this.getSignature()));
    }
}
