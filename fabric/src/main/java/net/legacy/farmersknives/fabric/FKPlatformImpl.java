package net.legacy.farmersknives.fabric;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import vectorwing.farmersdelight.common.item.KnifeItem;

public class FKPlatformImpl {
    public static Item createKnifeItem(Item.Properties properties) {
        return new net.legacy.farmersknives.fabric.item.KnifeItemFabric(properties);
    }

    public static ItemAttributeModifiers getKnifeItem(ToolMaterial toolMaterial, float attackDamage, float attackSpeed) {
        return KnifeItem.createAttributes(toolMaterial, attackDamage, attackSpeed);
    }
}
