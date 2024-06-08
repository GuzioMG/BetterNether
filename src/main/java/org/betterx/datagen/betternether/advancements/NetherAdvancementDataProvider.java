package org.betterx.datagen.betternether.advancements;

import org.betterx.bclib.api.v2.advancement.AdvancementManager;
import org.betterx.bclib.api.v3.datagen.AdvancementDataProvider;
import org.betterx.betternether.BetterNether;
import org.betterx.betternether.advancements.BNCriterion;
import org.betterx.betternether.registry.NetherBlocks;
import org.betterx.betternether.registry.NetherItems;
import org.betterx.betternether.registry.NetherStructures;
import org.betterx.betternether.registry.NetherTemplates;
import org.betterx.wover.complex.api.tool.ArmorSlot;
import org.betterx.wover.complex.api.tool.ToolSlot;

import net.minecraft.advancements.critereon.ChangeDimensionTrigger;
import net.minecraft.advancements.critereon.LocationPredicate;
import net.minecraft.advancements.critereon.PlayerTrigger;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.structure.Structure;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class NetherAdvancementDataProvider extends AdvancementDataProvider {
    public NetherAdvancementDataProvider(
            FabricDataOutput output,
            CompletableFuture<HolderLookup.Provider> registryLookup
    ) {
        super(List.of(BetterNether.C.modId), output, registryLookup);
    }

    @Override
    @SuppressWarnings("removal")
    protected void bootstrap(HolderLookup.Provider registryLookup) {
        final HolderLookup.RegistryLookup<Biome> biomeLookup = registryLookup.lookupOrThrow(Registries.BIOME);
        final HolderLookup.RegistryLookup<Structure> structureLookup = registryLookup.lookupOrThrow(Registries.STRUCTURE);
        ResourceLocation root = AdvancementManager.Builder
                .create(BetterNether.C.id("root"))
                .startDisplay(NetherBlocks.CINCINNASITE_LANTERN)
                .task()
                .hideFromChat()
                .background(ResourceLocation.withDefaultNamespace("textures/gui/advancements/backgrounds/nether.png"))
                .endDisplay()
                .addCriterion(
                        "welcome",
                        PlayerTrigger.TriggerInstance.located(LocationPredicate.Builder.location())
                )
                .requireOne()
                .build();


        ResourceLocation enterNether = AdvancementManager.Builder
                .create(BetterNether.C.id("enter_nether"))
                .parent(root)
                .startDisplay(NetherBlocks.JUNGLE_MOSS)
                .endDisplay()
                .addCriterion(
                        "entered_nether",
                        ChangeDimensionTrigger
                                .TriggerInstance
                                .changedDimensionTo(Level.NETHER)
                )
                .requireOne()
                .build();

        ResourceLocation blueObsidian = AdvancementManager.Builder
                .create(BetterNether.C.id("blue_obsidian"))
                .parent(root)
                .startDisplay(NetherBlocks.BLUE_OBSIDIAN)
                .endDisplay()
                .addCriterion("brew_blue", BNCriterion.BREW_BLUE_CRITERION)
                .requireOne()
                .build();

        ResourceLocation obsidianBlocks = AdvancementManager.Builder
                .create(BetterNether.C.id("obsidian_blocks"))
                .parent(blueObsidian)
                .startDisplay(NetherBlocks.BLUE_OBSIDIAN_BRICKS)
                .endDisplay()
                .addInventoryChangedCriterion("made_brick", NetherBlocks.OBSIDIAN_BRICKS)
                .addInventoryChangedCriterion("made_tile", NetherBlocks.OBSIDIAN_TILE)
                .addInventoryChangedCriterion("made_small_tile", NetherBlocks.OBSIDIAN_TILE_SMALL)
                .addInventoryChangedCriterion("made_rods", NetherBlocks.OBSIDIAN_ROD_TILES)
                .addInventoryChangedCriterion("made_blue_brick", NetherBlocks.BLUE_OBSIDIAN_BRICKS)
                .addInventoryChangedCriterion("made_blue_tile", NetherBlocks.BLUE_OBSIDIAN_TILE)
                .addInventoryChangedCriterion("made_small_blue_tile", NetherBlocks.BLUE_OBSIDIAN_TILE_SMALL)
                .addInventoryChangedCriterion("made_blue_rods", NetherBlocks.BLUE_OBSIDIAN_ROD_TILES)
                .requireAll()
                .build();

        ResourceLocation makeCrying = AdvancementManager.Builder
                .create(BetterNether.C.id("make_crying"))
                .parent(blueObsidian)
                .startDisplay(NetherBlocks.BLUE_WEEPING_OBSIDIAN)
                .challenge()
                .endDisplay()
                .addCriterion(
                        "made_blue_crying",
                        BNCriterion.CONVERT_BY_LIGHTNING.match(NetherBlocks.BLUE_CRYING_OBSIDIAN)
                )
                .addCriterion(
                        "made_crying",
                        BNCriterion.CONVERT_BY_LIGHTNING.match(NetherBlocks.BLUE_WEEPING_OBSIDIAN)
                )
                .addCriterion(
                        "made_blue_weeping",
                        BNCriterion.CONVERT_BY_LIGHTNING.match(Blocks.CRYING_OBSIDIAN)
                )
                .addCriterion(
                        "made_weeping",
                        BNCriterion.CONVERT_BY_LIGHTNING.match(NetherBlocks.WEEPING_OBSIDIAN)
                )
                .requireAll()
                .rewardXP(500)
                .build();

        ResourceLocation city = AdvancementManager.Builder
                .create(BetterNether.C.id("city"))
                .parent(enterNether)
                .startDisplay(NetherBlocks.CINCINNASITE_CARVED)
                .endDisplay()
                .addAtStructureCriterion("ncity", NetherStructures.CITY_STRUCTURE.getHolder(structureLookup))
                .requireOne()
                .build();


        ResourceLocation rubyOre = AdvancementManager.Builder
                .create(BetterNether.C.id("ruby_ore"))
                .parent(enterNether)
                .startDisplay(NetherItems.NETHER_RUBY)
                .endDisplay()
                .addInventoryChangedCriterion("ruby_ore", NetherItems.NETHER_RUBY)
                .requireOne()
                .build();


        ResourceLocation flames = AdvancementManager.Builder
                .create(BetterNether.C.id("flaming_ruby"))
                .parent(rubyOre)
                .startDisplay(NetherTemplates.FLAMING_RUBY_TEMPLATE)
                .goal()
                .endDisplay()
                .addInventoryChangedCriterion("flaming_ruby", NetherTemplates.FLAMING_RUBY_TEMPLATE)
                .requireAll()
                .build();

        ResourceLocation flamingTools = NetherItems.FLAMING_RUBY_SET
                .addToolSetCriterion(AdvancementManager.Builder
                        .create(BetterNether.C.id("flaming_tools"))
                        .parent(flames)
                        .startDisplay(NetherItems.FLAMING_RUBY_SET.get(ToolSlot.PICKAXE_SLOT))
                        .goal()
                        .endDisplay()
                ).requireAll()
                .build();

        ResourceLocation flamingArmor = NetherItems.FLAMING_RUBY_SET
                .addArmorSetCriterion(AdvancementManager.Builder
                        .create(BetterNether.C.id("flaming_armor"))
                        .parent(flames)
                        .startDisplay(NetherItems.FLAMING_RUBY_SET.get(ArmorSlot.CHESTPLATE_SLOT))
                        .goal()
                        .endDisplay()
                ).requireAll()
                .build();

        ResourceLocation rubyTools = NetherItems.NETHER_RUBY_SET
                .addToolSetCriterion(AdvancementManager.Builder
                        .create(BetterNether.C.id("ruby_tools"))
                        .parent(rubyOre)
                        .startDisplay(NetherItems.NETHER_RUBY_SET.get(ToolSlot.PICKAXE_SLOT))
                        .endDisplay()
                ).requireOne()
                .build();

        ResourceLocation rubyGear = NetherItems.NETHER_RUBY_SET
                .addArmorSetCriterion(AdvancementManager.Builder
                        .create(BetterNether.C.id("ruby_gear"))
                        .parent(rubyTools)
                        .startDisplay(NetherItems.NETHER_RUBY_SET.get(ArmorSlot.CHESTPLATE_SLOT))
                        .endDisplay()
                ).requireAll()
                .build();

        ResourceLocation cincinnasiteOre = AdvancementManager.Builder
                .create(BetterNether.C.id("cincinnasite_ore"))
                .parent(enterNether)
                .startDisplay(NetherItems.CINCINNASITE_INGOT)
                .endDisplay()
                .addInventoryChangedCriterion("cincinnasite_ore", NetherItems.CINCINNASITE_INGOT)
                .requireOne()
                .build();

        ResourceLocation cincinnasiteTools = NetherItems.CINCINNASITE_SET
                .addToolSetCriterion(AdvancementManager.Builder
                        .create(BetterNether.C.id("cincinnasite_tools"))
                        .parent(cincinnasiteOre)
                        .startDisplay(NetherItems.CINCINNASITE_SET.get(ToolSlot.PICKAXE_SLOT))
                        .endDisplay()
                ).requireOne()
                .build();

        ResourceLocation cincinnasiteGear = NetherItems.CINCINNASITE_SET
                .addArmorSetCriterion(AdvancementManager.Builder
                        .create(BetterNether.C.id("cincinnasite_gear"))
                        .parent(cincinnasiteTools)
                        .startDisplay(NetherItems.CINCINNASITE_SET.get(ArmorSlot.CHESTPLATE_SLOT))
                        .endDisplay()
                ).requireAll()
                .build();

        ResourceLocation cincinnasiteDiamond = AdvancementManager.Builder
                .create(BetterNether.C.id("cincinnasite_diamond"))
                .parent(cincinnasiteTools)
                .startDisplay(NetherTemplates.CINCINNASITE_DIAMOND_TEMPLATE)
                .goal()
                .endDisplay()
                .addInventoryChangedCriterion("cincinnasite_diamond", NetherTemplates.CINCINNASITE_DIAMOND_TEMPLATE)
                .requireAll()
                .build();

        ResourceLocation cincinnasiteDiamondTools = NetherItems.CINCINNASITE_DIAMOND_SET
                .addToolSetCriterion(AdvancementManager.Builder
                        .create(BetterNether.C.id("cincinnasite_diamond_tools"))
                        .parent(cincinnasiteDiamond)
                        .startDisplay(NetherItems.CINCINNASITE_DIAMOND_SET.get(ToolSlot.PICKAXE_SLOT))
                        .goal()
                        .endDisplay()
                ).requireAll()
                .build();

        ResourceLocation forge = AdvancementManager.Builder
                .create(BetterNether.C.id("cincinnasite_forge"))
                .parent(cincinnasiteOre)
                .startDisplay(NetherBlocks.CINCINNASITE_FORGE)
                .goal()
                .endDisplay()
                .addCriterion("use_forge", BNCriterion.USED_FORGE_ANY_CRITERION)
                .requireOne()
                .build();

        ResourceLocation netherWood = AdvancementManager.Builder
                .create(BetterNether.C.id("nether_wood"))
                .parent(enterNether)
                .startDisplay(NetherBlocks.MAT_WILLOW.getLog())
                .endDisplay()
                .addWoodCriterion(NetherBlocks.MAT_WILLOW)
                .addWoodCriterion(NetherBlocks.MAT_STALAGNATE)
                .addWoodCriterion(NetherBlocks.MAT_RUBEUS)
                .addWoodCriterion(NetherBlocks.MAT_WART)
                .addWoodCriterion(NetherBlocks.MAT_MUSHROOM_FIR)
                .addWoodCriterion(NetherBlocks.MAT_ANCHOR_TREE)
                .addWoodCriterion(NetherBlocks.MAT_NETHER_SAKURA)
                .addInventoryChangedAnyCriterion(
                        "got_nether_reed",
                        NetherBlocks.MAT_REED.getStem(),
                        NetherBlocks.MAT_REED.getPlanks()
                )
                .addInventoryChangedAnyCriterion(
                        "got_nether_mushroom",
                        NetherBlocks.MAT_NETHER_MUSHROOM.getStem(),
                        NetherBlocks.MAT_NETHER_MUSHROOM.getPlanks()
                )
                .addInventoryChangedAnyCriterion(
                        "got_crimson",
                        Blocks.CRIMSON_STEM,
                        Blocks.CRIMSON_HYPHAE,
                        Blocks.CRIMSON_PLANKS
                )
                .addInventoryChangedAnyCriterion(
                        "got_warped",
                        Blocks.WARPED_STEM,
                        Blocks.WARPED_HYPHAE,
                        Blocks.WARPED_PLANKS
                )
                .requireAll()
                .build();


        final var biomes = biomeLookup
                .listElementIds()
                .filter(id -> id.location().getNamespace().equals(BetterNether.C.modId))
                .toList();

        if (!biomes.isEmpty()) {
            ResourceLocation allTheBiomes = AdvancementManager.Builder
                    .create(BetterNether.C.id("all_the_biomes"))
                    .parent(city)
                    .startDisplay(NetherItems.NETHER_RUBY_SET.get(ArmorSlot.BOOTS_SLOT))
                    .challenge()
                    .endDisplay()
                    .addVisitBiomesCriterion(biomes
                            .stream()
                            .map(key -> (Holder<Biome>) biomeLookup.get(key).orElseThrow())
                            .toList()
                    )
                    .requireAll()
                    .rewardXP(1500)
                    .build();
        }
    }
}
