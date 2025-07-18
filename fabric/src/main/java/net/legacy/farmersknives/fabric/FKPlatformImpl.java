package net.legacy.farmersknives.fabric;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import vectorwing.farmersdelight.common.registry.ModCreativeTabs;

public class FKPlatformImpl {
    public static Item createKnifeItem(Tier tier, Item.Properties properties) {
        return new net.legacy.farmersknives.fabric.item.KnifeItemFabric(tier, properties);
    }
}
