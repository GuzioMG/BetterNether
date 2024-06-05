package org.betterx.betternether.items;

import org.betterx.bclib.items.tool.BaseSwordItem;
import org.betterx.betternether.interfaces.InitialStackStateProvider;
import org.betterx.betternether.items.materials.BNToolMaterial;
import org.betterx.betternether.registry.NetherEnchantments;
import org.betterx.betternether.registry.NetherItems;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.ItemEnchantments;

public class NetherSword extends BaseSwordItem implements InitialStackStateProvider {
    public NetherSword(Tier material, float attackDamage, float attackSpeed) {
        super(material, (int) attackDamage, attackSpeed, NetherItems.defaultSettings().fireResistant());
    }

    @Override
    public void putEnchantments(ItemStack stack, ItemEnchantments.Mutable defaultEnchants) {
        if (getTier() == BNToolMaterial.FLAMING_RUBY) {
            defaultEnchants.set(NetherEnchantments.RUBY_FIRE, 1);
            EnchantmentHelper.setEnchantments(stack, defaultEnchants);
        }
    }
}
