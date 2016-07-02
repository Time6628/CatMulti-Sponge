package me.time6628.cmulti.sponge;

import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.EntityType;
import org.spongepowered.api.entity.EntityTypes;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.cause.Cause;
import org.spongepowered.api.event.cause.entity.spawn.EntitySpawnCause;
import org.spongepowered.api.event.cause.entity.spawn.SpawnTypes;
import org.spongepowered.api.event.entity.ConstructEntityEvent;
import org.spongepowered.api.event.entity.SpawnEntityEvent;
import org.spongepowered.api.text.selector.ArgumentHolder;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;
import org.spongepowered.api.world.extent.Extent;

import java.util.Optional;

/**
 * Created by TimeTheCat on 7/2/2016.
 */
public class EventListener {
    @Listener
    public void onCatSpawn(ConstructEntityEvent.Post e) {
        if (e.getTargetType() == EntityTypes.OCELOT) {
            Location l = e.getTargetEntity().getLocation();
            World world = e.getTargetEntity().getWorld();
            Extent ex = l.getExtent();
            Optional<Entity> entityOptimal = ex.createEntity(EntityTypes.OCELOT, l.getPosition());
            if (entityOptimal.isPresent()) {
                Entity meow = entityOptimal.get();
                ex.spawnEntity(meow, Cause.source(EntitySpawnCause.builder().entity(meow).type(SpawnTypes.PLUGIN).build()).build());
            }
        }
    }
}
