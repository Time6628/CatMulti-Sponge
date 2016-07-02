package me.time6628.cmulti.sponge;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.event.game.state.GamePreInitializationEvent;
import org.spongepowered.api.plugin.Plugin;

/**
 * Created by TimeTheCat on 7/2/2016.
 */
@Plugin(name = "CatMultiplier", id = "catmultiplier", version = "0.1", description = "meow")
public class CatMultiplier {
    @Subscribe
    public void onPreInit(GamePreInitializationEvent event) {
        Sponge.getEventManager().registerListeners(this, new EventListener());
    }
}
