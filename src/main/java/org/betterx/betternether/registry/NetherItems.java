package org.betterx.betternether.registry;

import org.betterx.bclib.BCLib;
import org.betterx.bclib.items.DebugDataItem;
import org.betterx.bclib.items.complex.EquipmentSet;
import org.betterx.bclib.registry.ItemRegistry;
import org.betterx.betternether.BetterNether;
import org.betterx.betternether.blocks.BNBlockProperties.FoodShape;
import org.betterx.betternether.config.Configs;
import org.betterx.betternether.integrations.VanillaExcavatorsIntegration;
import org.betterx.betternether.integrations.VanillaHammersIntegration;
import org.betterx.betternether.items.ItemBlackApple;
import org.betterx.betternether.items.ItemBowlFood;
import org.betterx.betternether.items.complex.DiamondSet;
import org.betterx.betternether.items.complex.NetherSet;
import org.betterx.betternether.items.materials.BNArmorMaterial;
import org.betterx.betternether.items.materials.BNToolMaterial;
import org.betterx.betternether.loot.BNLoot;
import org.betterx.worlds.together.tag.v3.TagManager;

import net.minecraft.core.Direction;
import net.minecraft.core.dispenser.BlockSource;
import net.minecraft.core.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.FloatTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DispenserBlock;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class NetherItems extends ItemRegistry {
    private static final List<String> ITEMS = new ArrayList<String>();
    private static final ArrayList<Item> MOD_BLOCKS = new ArrayList<Item>();
    private static final ArrayList<Item> MOD_ITEMS = new ArrayList<Item>();

    public static final Item BLACK_APPLE = registerItem("black_apple", new ItemBlackApple());

    public static final Item STALAGNATE_BOWL = registerItem("stalagnate_bowl", new ItemBowlFood(null, FoodShape.NONE));
    public static final Item STALAGNATE_BOWL_WART = registerItem(
            "stalagnate_bowl_wart",
            new ItemBowlFood(
                    Foods.COOKED_CHICKEN,
                    FoodShape.WART
            )
    );
    public static final Item STALAGNATE_BOWL_MUSHROOM = registerItem(
            "stalagnate_bowl_mushroom",
            new ItemBowlFood(
                    Foods.MUSHROOM_STEW,
                    FoodShape.MUSHROOM
            )
    );
    public static final Item STALAGNATE_BOWL_APPLE = registerItem(
            "stalagnate_bowl_apple",
            new ItemBowlFood(Foods.APPLE, FoodShape.APPLE)
    );
    public static final Item HOOK_MUSHROOM_COOKED = registerFood("hook_mushroom_cooked", 4, 0.4F);

    public static final Item CINCINNASITE = registerItem("cincinnasite", new Item(defaultSettings()));
    public static final Item CINCINNASITE_INGOT = registerItem("cincinnasite_ingot", new Item(defaultSettings()),
            org.betterx.worlds.together.tag.v3.CommonItemTags.IRON_INGOTS
    );
    public static final Item NETHER_RUBY = registerItem("nether_ruby", new Item(defaultSettings()));

    public static final NetherSet CINCINNASITE_SET = new NetherSet(
            "cincinnasite",
            BNToolMaterial.CINCINNASITE,
            BNArmorMaterial.CINCINNASITE,
            true
    ).init();


    public static final NetherSet NETHER_RUBY_SET = new NetherSet(
            "nether_ruby",
            BNToolMaterial.NETHER_RUBY,
            BNArmorMaterial.NETHER_RUBY,
            false
    ).init();

    public static final DiamondSet CINCINNASITE_DIAMOND_SET = new DiamondSet(CINCINNASITE_SET).init();

    public static final NetherSet FLAMING_RUBY_SET = new NetherSet(
            "flaming_ruby",
            NETHER_RUBY_SET,
            BNToolMaterial.FLAMING_RUBY,
            BNArmorMaterial.FLAMING_RUBY,
            false
    ).init();
    public static final Item CINCINNASITE_HAMMER = registerItem(
            "cincinnasite_hammer",
            VanillaHammersIntegration.makeHammer(
                    BNToolMaterial.CINCINNASITE,
                    4,
                    -2.0F
            )
    );
    public static final Item CINCINNASITE_HAMMER_DIAMOND = registerItem(
            "cincinnasite_hammer_diamond",
            VanillaHammersIntegration.makeHammer(
                    BNToolMaterial.CINCINNASITE_DIAMOND,
                    5,
                    -2.0F
            )
    );
    public static final Item NETHER_RUBY_HAMMER = registerItem(
            "nether_ruby_hammer",
            VanillaHammersIntegration.makeHammer(
                    BNToolMaterial.NETHER_RUBY,
                    5,
                    -2.0F
            )
    );

    public static final Item CINCINNASITE_EXCAVATOR = registerItem(
            "cincinnasite_excavator",
            VanillaExcavatorsIntegration.makeExcavator(
                    BNToolMaterial.CINCINNASITE,
                    4,
                    -1.6F
            )
    );
    public static final Item CINCINNASITE_EXCAVATOR_DIAMOND = registerItem(
            "cincinnasite_excavator_diamond",
            VanillaExcavatorsIntegration.makeExcavator(
                    BNToolMaterial.CINCINNASITE_DIAMOND,
                    5,
                    -2.0F
            )
    );
    public static final Item NETHER_RUBY_EXCAVATOR = registerItem(
            "nether_ruby_excavator",
            VanillaExcavatorsIntegration.makeExcavator(
                    BNToolMaterial.NETHER_RUBY,
                    5,
                    -2.0F
            )
    );

    public static final Item GLOWSTONE_PILE = registerItem("glowstone_pile", new Item(defaultSettings()));
    public static final Item LAPIS_PILE = registerItem("lapis_pile", new Item(defaultSettings()));

    public static final Item AGAVE_LEAF = registerItem("agave_leaf", new Item(defaultSettings()));
    public static final Item AGAVE_MEDICINE = registerMedicine("agave_medicine", 40, 2, true);
    public static final Item HERBAL_MEDICINE = registerMedicine("herbal_medicine", 10, 5, true);

    protected NetherItems() {
        super(Configs.ITEMS);
    }

    private static ItemRegistry ITEMS_REGISTRY;

    @NotNull
    public static ItemRegistry getItemRegistry() {
        if (ITEMS_REGISTRY == null) {
            ITEMS_REGISTRY = new NetherItems();
        }
        return ITEMS_REGISTRY;
    }

    public static List<Item> getModItems() {
        return getModItems(BetterNether.MOD_ID);
    }


    public static Item registerShears(String name, Item item) {
        if (item != Items.AIR) {
            return getItemRegistry().registerTool(BetterNether.makeID(name), item);
        }

        return item;
    }

    public static Item registerTool(String name, Item item, TagKey<Item>... tags) {
        if (item != Items.AIR) {
            getItemRegistry().registerTool(BetterNether.makeID(name), item);
            if (tags.length > 0)
                TagManager.ITEMS.add(item, tags);

            MOD_ITEMS.add(item);
        }

        ITEMS.add(name);
        return item;
    }

    public static Item registerItem(String name, Item item, TagKey<Item>... tags) {
        if ((item instanceof BlockItem || Configs.ITEMS.getBoolean("items", name, true)) && item != Items.AIR) {
            getItemRegistry().register(BetterNether.makeID(name), item);
            //item = Registry.register(Registry.ITEM, new ResourceLocation(BetterNether.MOD_ID, name), item);
            if (tags.length > 0)
                TagManager.ITEMS.add(item, tags);

            if (item instanceof BlockItem)
                MOD_BLOCKS.add(item);
            else
                MOD_ITEMS.add(item);
        }
        if (!(item instanceof BlockItem))
            ITEMS.add(name);
        return item;
    }

    public static Item registerFood(String name, int hunger, float saturationMultiplier) {
        return registerItem(
                name,
                new Item(defaultSettings().food(new FoodProperties.Builder().nutrition(hunger)
                                                                            .saturationMod(
                                                                                    saturationMultiplier)
                                                                            .build()))
        );
    }

    public static Item registerMedicine(String name, int ticks, int power, boolean bowl) {
        if (bowl) {
            Item item = new Item(defaultSettings().stacksTo(16)
                                                  .food(new FoodProperties.Builder().effect(new MobEffectInstance(
                                                          MobEffects.REGENERATION,
                                                          ticks,
                                                          power
                                                  ), 1).build())) {
                @Override
                public ItemStack finishUsingItem(ItemStack stack, Level world, LivingEntity user) {
                    if (stack.getCount() == 1) {
                        super.finishUsingItem(stack, world, user);
                        return new ItemStack(NetherItems.STALAGNATE_BOWL, stack.getCount());
                    } else {
                        if (user instanceof Player player) {
                            if (!player.isCreative())
                                player.addItem(new ItemStack(NetherItems.STALAGNATE_BOWL));
                        }
                        return super.finishUsingItem(stack, world, user);
                    }
                }
            };
            return registerItem(name, item);
        }
        return registerItem(
                name,
                new Item(defaultSettings().food(new FoodProperties.Builder().effect(new MobEffectInstance(
                        MobEffects.REGENERATION,
                        ticks,
                        power
                ), 1).build()))
        );
    }

    public static Properties defaultSettings() {
        return new Item.Properties();
    }

    public static Item makeEgg(String name, EntityType<? extends Mob> type, int background, int dots) {
        if (Configs.MOBS.getBoolean("mobs", name, true)) {
            SpawnEggItem egg = new SpawnEggItem(type, background, dots, defaultSettings());
            DefaultDispenseItemBehavior behavior = new DefaultDispenseItemBehavior() {
                public ItemStack execute(BlockSource pointer, ItemStack stack) {
                    Direction direction = pointer.state().getValue(DispenserBlock.FACING);
                    EntityType<?> entityType = ((SpawnEggItem) stack.getItem()).getType(stack.getTag());
                    entityType.spawn(
                            pointer.level(),
                            stack,
                            null,
                            pointer.pos().relative(direction),
                            MobSpawnType.DISPENSER,
                            direction != Direction.UP,
                            false
                    );
                    stack.shrink(1);
                    return stack;
                }
            };
            DispenserBlock.registerBehavior(egg, behavior);
            NetherItems.registerItem(name, egg);
            return egg;
        } else {
            return Items.AIR;
        }
    }

    public static Item registerNetherItem(String name, Item item) {
        return getItemRegistry().register(BetterNether.makeID(name), item);
    }

    static {
        if (BCLib.isDevEnvironment()) {
            BetterNether.LOGGER.warning("Generating Debug Helpers");

            registerNetherItem(
                    "debug/city_loot",
                    DebugDataItem.forLootTable(BNLoot.CITY_LOOT, Items.IRON_INGOT)
            );
            registerNetherItem(
                    "debug/city_loot_common",
                    DebugDataItem.forLootTable(BNLoot.CITY_LOOT_COMMON, Items.GOLD_INGOT)
            );
            registerNetherItem(
                    "debug/city_loot_surprise",
                    DebugDataItem.forLootTable(BNLoot.CITY_LOOT_SURPRISE, Items.DIAMOND)
            );

            CompoundTag root = buildCitySpawnerData();


            registerNetherItem(
                    "debug/city_spawner",
                    DebugDataItem.forSpawner(root, Items.SPECTRAL_ARROW)
            );
        }
    }

    private static CompoundTag buildItem(int count, Item item, Enchantment... enchantments) {
        ResourceLocation id = BuiltInRegistries.ITEM.getKey(item);
        CompoundTag tag = new CompoundTag();
        tag.putString("id", id.toString());
        tag.putByte("Count", (byte) count);

        if (enchantments.length > 0) {
            ListTag chants = new ListTag();
            tag.put("Enchantments", chants);
            for (Enchantment e : enchantments) {
                ResourceLocation eID = BuiltInRegistries.ENCHANTMENT.getKey(e);
                chants.add(EnchantmentHelper.storeEnchantment(eID, e.getMaxLevel()));
            }
        }
        return tag;
    }

    @NotNull
    private static CompoundTag buildCitySpawnerData() {
        ListTag handItems = new ListTag();
        handItems.add(buildItem(1, CINCINNASITE_DIAMOND_SET.getSlot(EquipmentSet.SWORD_SLOT)));
        handItems.add(buildItem(1, Items.SHIELD));

        ListTag armorItems = new ListTag();
        armorItems.add(buildItem(
                1,
                CINCINNASITE_SET.getSlot(EquipmentSet.BOOTS_SLOT),
                Enchantments.ALL_DAMAGE_PROTECTION
        ));
        armorItems.add(buildItem(
                1,
                CINCINNASITE_SET.getSlot(EquipmentSet.LEGGINGS_SLOT),
                Enchantments.ALL_DAMAGE_PROTECTION
        ));
        armorItems.add(buildItem(
                1,
                CINCINNASITE_SET.getSlot(EquipmentSet.CHESTPLATE_SLOT),
                Enchantments.ALL_DAMAGE_PROTECTION,
                Enchantments.THORNS
        ));
        armorItems.add(buildItem(
                1,
                CINCINNASITE_SET.getSlot(EquipmentSet.HELMET_SLOT),
                Enchantments.ALL_DAMAGE_PROTECTION
        ));

        ListTag handDropChance = new ListTag();
        handDropChance.add(FloatTag.valueOf(0));
        handDropChance.add(FloatTag.valueOf(0));

        ListTag armorDropChance = new ListTag();
        armorDropChance.add(FloatTag.valueOf(0));
        armorDropChance.add(FloatTag.valueOf(0));
        armorDropChance.add(FloatTag.valueOf(0));
        armorDropChance.add(FloatTag.valueOf(0));


        CompoundTag entity = new CompoundTag();
        entity.putString("id", BuiltInRegistries.ENTITY_TYPE.getKey(EntityType.WITHER_SKELETON).toString());
        entity.putBoolean("PersistenceRequired", true);
        entity.put("HandItems", handItems);
        entity.put("ArmorItems", armorItems);
        entity.put("HandDropChances", handDropChance);
        entity.put("ArmorDropChances", armorDropChance);

        CompoundTag skyLightLimit = new CompoundTag();
        skyLightLimit.putByte("max_inclusive", (byte) 13);

        CompoundTag blockLightLimit = new CompoundTag();
        skyLightLimit.putByte("max_inclusive", (byte) 13);

        CompoundTag customSpawnRules = new CompoundTag();
        customSpawnRules.put("sky_light_limit", skyLightLimit);
        customSpawnRules.put("block_light_limit", blockLightLimit);

        CompoundTag spawnData = new CompoundTag();
        spawnData.put("entity", entity);
        spawnData.put("custom_spawn_rules", customSpawnRules);

        CompoundTag root = new CompoundTag();
        root.putShort("SpawnRange", (short) 4);
        root.putShort("SpawnCount", (short) 8);
        root.putShort("MaxNearbyEntities", (short) 18);
        root.putShort("Delay", (short) 499);
        root.putShort("MinSpawnDelay", (short) 300);
        root.putShort("MaxSpawnDelay", (short) 1600);
        root.putShort("RequiredPlayerRange", (short) 20);
        root.put("SpawnData", spawnData);


        return root;
    }
}
