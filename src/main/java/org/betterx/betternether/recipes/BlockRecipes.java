package org.betterx.betternether.recipes;

import org.betterx.bclib.complexmaterials.set.wood.WoodSlots;
import org.betterx.bclib.recipes.BCLRecipeBuilder;
import org.betterx.betternether.BetterNether;
import org.betterx.betternether.registry.NetherBlocks;
import org.betterx.betternether.registry.NetherItems;
import org.betterx.betternether.registry.NetherTemplates;

import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

public class BlockRecipes {
    public static void register() {
        BCLRecipeBuilder.crafting(
                                BetterNether.C.id("mushroom_fir_trimmed_chest"),
                                NetherBlocks.TRIMMED_MUSHROOM_FIR_CHEST
                        )
                        .shapeless()
                        .addMaterial('#', NetherBlocks.MAT_MUSHROOM_FIR.getBlock(WoodSlots.CHEST))
                        .addMaterial('S', NetherBlocks.MAT_MUSHROOM_FIR.getBlock(WoodSlots.STRIPPED_LOG))
                        .setGroup("chest")
                        .setOutputCount(1)
                        .setCategory(RecipeCategory.DECORATIONS)
                        .build();

        BCLRecipeBuilder.crafting(BetterNether.C.id("activator_rail"), Items.ACTIVATOR_RAIL)
                        .setShape("XSX", "X#X", "XSX")
                        .addMaterial('#', Items.REDSTONE_TORCH)
                        .addMaterial('S', Items.STICK)
                        .addMaterial('X', NetherItems.CINCINNASITE_INGOT)
                        .setGroup("activator_rail")
                        .setOutputCount(6)
                        .setCategory(RecipeCategory.TRANSPORTATION)
                        .build();

        BCLRecipeBuilder.crafting(BetterNether.C.id("black_apple_seed"), NetherBlocks.BLACK_APPLE_SEED)
                        .shapeless()
                        .addMaterial('#', NetherItems.BLACK_APPLE)
                        .setGroup("nether_black_apple_seed")
                        .setCategory(RecipeCategory.DECORATIONS)
                        .setOutputCount(4)
                        .build();

        BCLRecipeBuilder.crafting(BetterNether.C.id("bn_bone_block"), NetherBlocks.BONE_BLOCK)
                        .setShape("##", "##")
                        .addMaterial('#', Items.BONE_BLOCK)
                        .setGroup("nether_bn_bone_block")
                        .setOutputCount(4)
                        .setCategory(RecipeCategory.BUILDING_BLOCKS)
                        .build();
        BCLRecipeBuilder.crafting(BetterNether.C.id("bone_cin_door"), NetherBlocks.BONE_CINCINNASITE_DOOR)
                        .setShape("AB", "BB", "BA")
                        .addMaterial('A', NetherBlocks.CINCINNASITE_FORGED)
                        .addMaterial('B', NetherBlocks.BONE_BLOCK)
                        .setGroup("nether_bone_cin_door")
                        .setOutputCount(3)
                        .setCategory(RecipeCategory.REDSTONE)
                        .build();

        BCLRecipeBuilder.crafting(BetterNether.C.id("bone_tile"), NetherBlocks.BONE_TILE)
                        .setShape("#", "#")
                        .addMaterial('#', NetherBlocks.BONE_SLAB)
                        .setGroup("nether_bone_tile")
                        .setCategory(RecipeCategory.BUILDING_BLOCKS)
                        .build();
        BCLRecipeBuilder.crafting(BetterNether.C.id("brick_pot"), NetherBlocks.BRICK_POT)
                        .setShape("#N#", " # ")
                        .addMaterial('#', Items.NETHER_BRICK)
                        .addMaterial('N', Items.SOUL_SAND)
                        .setGroup("nether_brick_pot")
                        .setCategory(RecipeCategory.DECORATIONS)
                        .build();


        BCLRecipeBuilder.crafting(BetterNether.C.id("cincinnasite_bars"), NetherBlocks.CINCINNASITE_BARS)
                        .setShape("###", "###")
                        .addMaterial('#', NetherItems.CINCINNASITE_INGOT)
                        .setGroup("nether_cincinnasite_bars")
                        .setOutputCount(16)
                        .setCategory(RecipeCategory.DECORATIONS)
                        .build();
        BCLRecipeBuilder.crafting(BetterNether.C.id("cincinnasite_block"), NetherBlocks.CINCINNASITE_BLOCK)
                        .setShape("##", "##")
                        .addMaterial('#', NetherItems.CINCINNASITE)
                        .setGroup("nether_cincinnasite_block")
                        .setCategory(RecipeCategory.BUILDING_BLOCKS)
                        .build();
        BCLRecipeBuilder.crafting(
                                BetterNether.C.id("cincinnasite_brick_plate"),
                                NetherBlocks.CINCINNASITE_BRICK_PLATE
                        )
                        .setShape(" # ", "BBB", " # ")
                        .addMaterial('#', NetherBlocks.CINCINNASITE_FORGED)
                        .addMaterial('B', Items.NETHER_BRICK)
                        .setGroup("nether_cincinnasite_brick_plate")
                        .setOutputCount(5)
                        .setCategory(RecipeCategory.REDSTONE)
                        .build();
        BCLRecipeBuilder.crafting(BetterNether.C.id("cincinnasite_bricks"), NetherBlocks.CINCINNASITE_BRICKS)
                        .setShape("#B", "B#")
                        .addMaterial('#', NetherBlocks.CINCINNASITE_FORGED)
                        .addMaterial('B', Items.NETHER_BRICK)
                        .setGroup("nether_cincinnasite_bricks")
                        .setOutputCount(4)
                        .setCategory(RecipeCategory.BUILDING_BLOCKS)
                        .build();
        BCLRecipeBuilder.crafting(
                                BetterNether.C.id("cincinnasite_bricks_pillar"),
                                NetherBlocks.CINCINNASITE_BRICKS_PILLAR
                        )
                        .setShape("#", "#")
                        .addMaterial('#', NetherBlocks.CINCINNASITE_BRICKS)
                        .setGroup("nether_cincinnasite_bricks_pillar")
                        .setOutputCount(2)
                        .setCategory(RecipeCategory.DECORATIONS)
                        .build();
        BCLRecipeBuilder.crafting(BetterNether.C.id("cincinnasite_button"), NetherBlocks.CINCINNASITE_BUTTON)
                        .shapeless()
                        .addMaterial('#', NetherItems.CINCINNASITE_INGOT)
                        .setGroup("nether_cincinnasite_button")
                        .setCategory(RecipeCategory.REDSTONE)
                        .build();
        BCLRecipeBuilder.crafting(BetterNether.C.id("cincinnasite_carved"), NetherBlocks.CINCINNASITE_CARVED)
                        .setShape("##", "##")
                        .addMaterial('#', NetherBlocks.CINCINNASITE_FORGED)
                        .setGroup("nether_cincinnasite_carved")
                        .setCategory(RecipeCategory.BUILDING_BLOCKS)
                        .setOutputCount(4)
                        .build();
        BCLRecipeBuilder.crafting(BetterNether.C.id("cincinnasite_forge"), NetherBlocks.CINCINNASITE_FORGE)
                        .setShape("B#B", "# #", "B#B")
                        .addMaterial('#', NetherBlocks.CINCINNASITE_FORGED)
                        .addMaterial('B', Items.NETHER_BRICKS)
                        .setGroup("nether_cincinnasite_forge")
                        .setCategory(RecipeCategory.DECORATIONS)
                        .build();
        BCLRecipeBuilder.crafting(
                                BetterNether.C.id("cincinnasite_forged_from_ingot"),
                                NetherBlocks.CINCINNASITE_FORGED
                        )
                        .setShape("##", "##")
                        .addMaterial('#', NetherItems.CINCINNASITE_INGOT)
                        .setGroup("nether_cincinnasite_forged_from_ingot")
                        .setCategory(RecipeCategory.BUILDING_BLOCKS)
                        .build();
        BCLRecipeBuilder.crafting(BetterNether.C.id("cincinnasite_frame"), NetherBlocks.CINCINNASITE_FRAME)
                        .setShape("# #", "   ", "# #")
                        .addMaterial('#', NetherItems.CINCINNASITE_INGOT)
                        .setGroup("nether_cincinnasite_frame")
                        .setCategory(RecipeCategory.BUILDING_BLOCKS)
                        .setOutputCount(16)
                        .build();

        BCLRecipeBuilder.crafting(BetterNether.C.id("cincinnasite_lantern"), NetherBlocks.CINCINNASITE_LANTERN)
                        .setShape(" # ", "#G#", " # ")
                        .addMaterial('#', NetherItems.CINCINNASITE_INGOT)
                        .addMaterial('G', Items.GLOWSTONE)
                        .setGroup("nether_cincinnasite_lantern")
                        .setCategory(RecipeCategory.DECORATIONS)
                        .build();
        BCLRecipeBuilder.crafting(
                                BetterNether.C.id("cincinnasite_lantern_small"),
                                NetherBlocks.CINCINNASITE_LANTERN_SMALL
                        )
                        .setShape("I", "L")
                        .addMaterial('I', NetherItems.CINCINNASITE_INGOT)
                        .addMaterial('L', NetherBlocks.CINCINNASITE_LANTERN)
                        .setGroup("nether_cincinnasite_lantern_small")
                        .setOutputCount(4)
                        .setCategory(RecipeCategory.DECORATIONS)
                        .build();
        BCLRecipeBuilder.crafting(BetterNether.C.id("cincinnasite_pedestal"), NetherBlocks.CINCINNASITE_PEDESTAL)
                        .setShape("##", "##", "##")
                        .addMaterial('#', NetherBlocks.CINCINNASITE_FORGED)
                        .setGroup("nether_cincinnasite_pedestal")
                        .setCategory(RecipeCategory.DECORATIONS)
                        .setOutputCount(2)
                        .build();
        BCLRecipeBuilder.crafting(BetterNether.C.id("cincinnasite_pillar"), NetherBlocks.CINCINNASITE_PILLAR)
                        .setShape("#", "#")
                        .addMaterial('#', NetherBlocks.CINCINNASITE_FORGED)
                        .setGroup("nether_cincinnasite_pillar")
                        .setCategory(RecipeCategory.DECORATIONS)
                        .setOutputCount(2)
                        .build();
        BCLRecipeBuilder.crafting(BetterNether.C.id("cincinnasite_pot"), NetherBlocks.CINCINNASITE_POT)
                        .setShape("#N#", " # ")
                        .addMaterial('#', NetherItems.CINCINNASITE_INGOT)
                        .addMaterial('N', Items.SOUL_SAND)
                        .setGroup("nether_cincinnasite_pot")
                        .setCategory(RecipeCategory.DECORATIONS)
                        .build();
        BCLRecipeBuilder.crafting(BetterNether.C.id("cincinnasite_tile_large"), NetherBlocks.CINCINNASITE_TILE_LARGE)
                        .setShape("#", "#")
                        .addMaterial('#', NetherBlocks.CINCINNASITE_SLAB)
                        .setGroup("nether_cincinnasite_tile_large")
                        .setCategory(RecipeCategory.BUILDING_BLOCKS)
                        .build();
        BCLRecipeBuilder.crafting(BetterNether.C.id("cincinnasite_tile_small"), NetherBlocks.CINCINNASITE_TILE_SMALL)
                        .setShape("##", "##")
                        .addMaterial('#', NetherBlocks.CINCINNASITE_TILE_LARGE)
                        .setGroup("nether_cincinnasite_tile_small")
                        .setCategory(RecipeCategory.BUILDING_BLOCKS)
                        .setOutputCount(4)
                        .build();


        BCLRecipeBuilder.crafting(BetterNether.C.id("nether_brewing_stand"), NetherBlocks.NETHER_BREWING_STAND)
                        .setShape(" I ", " S ", "###")
                        .addMaterial('I', NetherItems.CINCINNASITE_INGOT)
                        .addMaterial('S', Items.BLAZE_ROD)
                        .addMaterial('#', Items.NETHER_BRICKS)
                        .setGroup("nether_nether_brewing_stand")
                        .setCategory(RecipeCategory.BREWING)
                        .build();
        BCLRecipeBuilder.crafting(BetterNether.C.id("nether_ruby_block"), NetherBlocks.NETHER_RUBY_BLOCK)
                        .setShape("###", "###", "###")
                        .addMaterial('#', NetherItems.NETHER_RUBY)
                        .setGroup("nether_nether_ruby_block")
                        .setCategory(RecipeCategory.BUILDING_BLOCKS)
                        .build();

        BCLRecipeBuilder.crafting(BetterNether.C.id("nether_tile_large"), NetherBlocks.NETHER_BRICK_TILE_LARGE)
                        .setShape("##", "##")
                        .addMaterial('#', Items.NETHER_BRICK_SLAB)
                        .setGroup("nether_nether_tile_large")
                        .setCategory(RecipeCategory.BUILDING_BLOCKS)
                        .setOutputCount(2)
                        .build();
        BCLRecipeBuilder.crafting(BetterNether.C.id("nether_tile_small"), NetherBlocks.NETHER_BRICK_TILE_SMALL)
                        .setShape("##", "##")
                        .addMaterial('#', NetherBlocks.NETHER_BRICK_TILE_LARGE)
                        .setGroup("nether_nether_tile_small")
                        .setCategory(RecipeCategory.BUILDING_BLOCKS)
                        .setOutputCount(4)
                        .build();

        BCLRecipeBuilder.crafting(BetterNether.C.id("quartz_glass_framed"), NetherBlocks.QUARTZ_GLASS_FRAMED)
                        .setShape("G#G", "# #", "G#G")
                        .addMaterial('#', NetherItems.CINCINNASITE_INGOT)
                        .addMaterial('G', NetherBlocks.QUARTZ_GLASS)
                        .setGroup("nether_quartz_glass_framed")
                        .setCategory(RecipeCategory.BUILDING_BLOCKS)
                        .setOutputCount(8)
                        .build();
        BCLRecipeBuilder.crafting(
                                BetterNether.C.id("quartz_glass_framed_pane"),
                                NetherBlocks.QUARTZ_GLASS_FRAMED_PANE
                        )
                        .setShape("###", "###")
                        .addMaterial('#', NetherBlocks.QUARTZ_GLASS_FRAMED)
                        .setGroup("nether_quartz_glass_framed_pane")
                        .setCategory(RecipeCategory.BUILDING_BLOCKS)
                        .setOutputCount(16)
                        .build();
        BCLRecipeBuilder.crafting(BetterNether.C.id("quartz_glass_pane"), NetherBlocks.QUARTZ_GLASS_PANE)
                        .setShape("###", "###")
                        .addMaterial('#', NetherBlocks.QUARTZ_GLASS)
                        .setGroup("nether_quartz_glass_pane")
                        .setCategory(RecipeCategory.DECORATIONS)
                        .setOutputCount(16)
                        .build();


        BCLRecipeBuilder.crafting(BetterNether.C.id("wall_moss"), NetherBlocks.WALL_MOSS)
                        .shapeless()
                        .addMaterial('#', NetherBlocks.NETHER_GRASS)
                        .setGroup("nether_wall_moss")
                        .setCategory(RecipeCategory.DECORATIONS)
                        .build();

        BCLRecipeBuilder.crafting(
                                BetterNether.C.id("whispering_gourd_lantern"),
                                NetherBlocks.WHISPERING_GOURD_LANTERN
                        )
                        .setShape("#", "T")
                        .addMaterial('#', NetherBlocks.WHISPERING_GOURD)
                        .addMaterial('T', Items.TORCH)
                        .setGroup("nether_whispering_gourd_lantern")
                        .setCategory(RecipeCategory.BUILDING_BLOCKS)
                        .build();


        BCLRecipeBuilder.crafting(BetterNether.C.id("blue_obsidian_bricks"), NetherBlocks.BLUE_OBSIDIAN_BRICKS)
                        .setShape("##", "##")
                        .addMaterial('#', NetherBlocks.BLUE_OBSIDIAN_TILE)
                        .setGroup("nether_blue_obsidian_bricks")
                        .setOutputCount(4)
                        .setCategory(RecipeCategory.BUILDING_BLOCKS)
                        .build();
        BCLRecipeBuilder.crafting(
                                BetterNether.C.id("blue_obsidian_glass_pane"),
                                NetherBlocks.BLUE_OBSIDIAN_GLASS_PANE
                        )
                        .setShape("###", "###")
                        .addMaterial('#', NetherBlocks.BLUE_OBSIDIAN_GLASS)
                        .setGroup("nether_blue_obsidian_glass_pane")
                        .setCategory(RecipeCategory.DECORATIONS)
                        .setOutputCount(16)
                        .build();
        BCLRecipeBuilder.crafting(BetterNether.C.id("blue_obsidian_rod_tiles"), NetherBlocks.BLUE_OBSIDIAN_ROD_TILES)
                        .setShape(" ##", "## ")
                        .addMaterial('#', NetherBlocks.BLUE_OBSIDIAN_TILE)
                        .setGroup("nether_blue_obsidian_rod_tiles")
                        .setCategory(RecipeCategory.BUILDING_BLOCKS)
                        .setOutputCount(4)
                        .build();
        BCLRecipeBuilder.crafting(BetterNether.C.id("blue_obsidian_tile"), NetherBlocks.BLUE_OBSIDIAN_TILE)
                        .setShape("##", "##")
                        .addMaterial('#', NetherBlocks.BLUE_OBSIDIAN)
                        .setGroup("nether_blue_obsidian_tile")
                        .setCategory(RecipeCategory.BUILDING_BLOCKS)
                        .setOutputCount(4)
                        .build();
        BCLRecipeBuilder.crafting(
                                BetterNether.C.id("blue_obsidian_tile_small"),
                                NetherBlocks.BLUE_OBSIDIAN_TILE_SMALL
                        )
                        .setShape("##", "##")
                        .addMaterial('#', NetherBlocks.BLUE_OBSIDIAN_BRICKS)
                        .setGroup("nether_blue_obsidian_tile_small")
                        .setCategory(RecipeCategory.BUILDING_BLOCKS)
                        .setOutputCount(4)
                        .build();
        BCLRecipeBuilder.crafting(BetterNether.C.id("cincinnasite_anvil"), NetherBlocks.CINCINNASITE_ANVIL)
                        .setShape("###", " # ", "BBB")
                        .addMaterial('#', NetherBlocks.CINCINNASITE_FORGED)
                        .addMaterial('B', Items.NETHER_BRICKS)
                        .setGroup("nether_cincinnasite_anvil")
                        .setCategory(RecipeCategory.DECORATIONS)
                        .build();
        BCLRecipeBuilder.crafting(BetterNether.C.id("obsidian_bricks"), NetherBlocks.OBSIDIAN_BRICKS)
                        .setShape("##", "##")
                        .addMaterial('#', NetherBlocks.OBSIDIAN_TILE)
                        .setGroup("nether_obsidian_bricks")
                        .setCategory(RecipeCategory.BUILDING_BLOCKS)
                        .setOutputCount(4)
                        .build();
        BCLRecipeBuilder.crafting(BetterNether.C.id("obsidian_glass_pane"), NetherBlocks.OBSIDIAN_GLASS_PANE)
                        .setShape("###", "###")
                        .addMaterial('#', NetherBlocks.OBSIDIAN_GLASS)
                        .setGroup("nether_obsidian_glass_pane")
                        .setCategory(RecipeCategory.DECORATIONS)
                        .setOutputCount(16)
                        .build();
        BCLRecipeBuilder.crafting(BetterNether.C.id("obsidian_rod_tiles"), NetherBlocks.OBSIDIAN_ROD_TILES)
                        .setShape(" ##", "## ")
                        .addMaterial('#', NetherBlocks.OBSIDIAN_TILE)
                        .setGroup("nether_obsidian_rod_tiles")
                        .setCategory(RecipeCategory.BUILDING_BLOCKS)
                        .setOutputCount(4)
                        .build();
        BCLRecipeBuilder.crafting(BetterNether.C.id("obsidian_tile"), NetherBlocks.OBSIDIAN_TILE)
                        .setShape("##", "##")
                        .addMaterial('#', Items.OBSIDIAN)
                        .setGroup("nether_obsidian_tile")
                        .setCategory(RecipeCategory.BUILDING_BLOCKS)
                        .setOutputCount(4)
                        .build();
        BCLRecipeBuilder.crafting(BetterNether.C.id("obsidian_tile_small"), NetherBlocks.OBSIDIAN_TILE_SMALL)
                        .setShape("##", "##")
                        .addMaterial('#', NetherBlocks.OBSIDIAN_BRICKS)
                        .setGroup("nether_obsidian_tile_small")
                        .setCategory(RecipeCategory.BUILDING_BLOCKS)
                        .setOutputCount(4)
                        .build();

        BCLRecipeBuilder.crafting(BetterNether.C.id("farmland"), NetherBlocks.FARMLAND)
                        .setShape("#S#", "#N#", "#H#")
                        .addMaterial('#', NetherBlocks.MAT_STALAGNATE.getPlanks())
                        .addMaterial('H', NetherBlocks.MAT_STALAGNATE.getSlab())
                        .addMaterial('N', Items.NETHERRACK)
                        .addMaterial('S', Items.SOUL_SAND)
                        .setGroup("nether_farmland")
                        .setCategory(RecipeCategory.MISC)
                        .setOutputCount(4)
                        .build();

        BCLRecipeBuilder.crafting(BetterNether.C.id("bone_reed_door"), NetherBlocks.BONE_REED_DOOR)
                        .setShape("AB", "BB", "BA")
                        .addMaterial('A', NetherBlocks.MAT_REED.getPlanks())
                        .addMaterial('B', NetherBlocks.BONE_BLOCK)
                        .setGroup("nether_bone_reed_door")
                        .setCategory(RecipeCategory.REDSTONE)
                        .setOutputCount(3)
                        .build();

        BCLRecipeBuilder.crafting(BetterNether.C.id("chest_of_drawers"), NetherBlocks.CHEST_OF_DRAWERS)
                        .setShape("C#C", "# #", "C#C")
                        .addMaterial('C', NetherBlocks.CINCINNASITE_FORGED)
                        .addMaterial('#', NetherBlocks.MAT_REED.getPlanks())
                        .setGroup("nether_chest_of_drawers")
                        .setCategory(RecipeCategory.DECORATIONS)
                        .build();

        registerStoneCutting();
        registerBlasting();
        registerSmelting();
        registerSmithing();
    }

    private static void registerSmithing() {
        BCLRecipeBuilder
                .smithing(BetterNether.C.id("netherite_fire_bowl"), NetherBlocks.NETHERITE_FIRE_BOWL)
                .setPrimaryInputAndUnlock(NetherBlocks.CINCINNASITE_FIRE_BOWL)
                .setAddition(Items.NETHERITE_INGOT)
                .setCategory(RecipeCategory.DECORATIONS)
                .setTemplate(NetherTemplates.NETHER_BOWL_SMITHING_TEMPLATE)
                .build();

        BCLRecipeBuilder
                .smithing(BetterNether.C.id("netherite_fire_bowl_soul"), NetherBlocks.NETHERITE_FIRE_BOWL_SOUL)
                .setPrimaryInputAndUnlock(NetherBlocks.CINCINNASITE_FIRE_BOWL_SOUL)
                .setAddition(Items.NETHERITE_INGOT)
                .setCategory(RecipeCategory.DECORATIONS)
                .setTemplate(NetherTemplates.NETHER_BOWL_SMITHING_TEMPLATE)
                .build();
    }

    private static void registerSmelting() {
        BCLRecipeBuilder.smelting(BetterNether.C.id("blue_obsidian_glass"), NetherBlocks.BLUE_OBSIDIAN_GLASS)
                        .setPrimaryInputAndUnlock(NetherBlocks.BLUE_OBSIDIAN)
                        .setCookingTime(200)
                        .setCategory(RecipeCategory.BUILDING_BLOCKS)
                        .build();
        BCLRecipeBuilder.smelting(BetterNether.C.id("cincinnasite_forged"), NetherBlocks.CINCINNASITE_FORGED)
                        .setPrimaryInputAndUnlock(NetherBlocks.CINCINNASITE_BLOCK)
                        .setCookingTime(200)
                        .setCategory(RecipeCategory.BUILDING_BLOCKS)
                        .build();
        BCLRecipeBuilder.smelting(BetterNether.C.id("obsidian_glass"), NetherBlocks.OBSIDIAN_GLASS)
                        .setPrimaryInputAndUnlock(Blocks.OBSIDIAN)
                        .setCookingTime(200)
                        .setCategory(RecipeCategory.BUILDING_BLOCKS)
                        .build();
        BCLRecipeBuilder.smelting(BetterNether.C.id("quartz_glass"), NetherBlocks.QUARTZ_GLASS)
                        .setPrimaryInputAndUnlock(Items.QUARTZ)
                        .setCookingTime(200)
                        .setCategory(RecipeCategory.BUILDING_BLOCKS)
                        .build();
        BCLRecipeBuilder.smelting(BetterNether.C.id("soul_sandstone"), NetherBlocks.SOUL_SANDSTONE_SMOOTH)
                        .setPrimaryInputAndUnlock(NetherBlocks.SOUL_SANDSTONE)
                        .setCookingTime(200)
                        .setExperience(0.1f)
                        .setCategory(RecipeCategory.BUILDING_BLOCKS)
                        .build();
    }

    private static void registerBlasting() {
        BCLRecipeBuilder
                .blasting(BetterNether.C.id("cincinnasite_forged_blasting"), NetherBlocks.CINCINNASITE_FORGED)
                .setPrimaryInputAndUnlock(NetherBlocks.CINCINNASITE_BLOCK)
                .setCookingTime(100)
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();
    }

    private static void registerStoneCutting() {
        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("blue_obsidian_bricks_from_tile_stonecutter"),
                        NetherBlocks.BLUE_OBSIDIAN_BRICKS
                )
                .setPrimaryInputAndUnlock(NetherBlocks.BLUE_OBSIDIAN_TILE)
                .setGroup("nether_blue_obsidian_bricks")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("blue_obsidian_bricks_slab_from_bricks_stonecutter"),
                        NetherBlocks.BLUE_OBSIDIAN_BRICKS_SLAB
                )
                .setPrimaryInputAndUnlock(NetherBlocks.BLUE_OBSIDIAN_BRICKS)
                .setGroup("nether_blue_obsidian_slab")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .setOutputCount(2)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("blue_obsidian_bricks_slab_stonecutter"),
                        NetherBlocks.BLUE_OBSIDIAN_BRICKS_SLAB
                )
                .setPrimaryInputAndUnlock(NetherBlocks.BLUE_OBSIDIAN)
                .setGroup("nether_blue_obsidian_bricks_slab")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .setOutputCount(2)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("blue_obsidian_bricks_stairs_from_bricks_stonecutter"),
                        NetherBlocks.BLUE_OBSIDIAN_BRICKS_STAIRS
                )
                .setPrimaryInputAndUnlock(NetherBlocks.BLUE_OBSIDIAN_BRICKS)
                .setGroup("nether_blue_obsidian_bricks_stairs")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("blue_obsidian_bricks_stairs_stonecutter"),
                        NetherBlocks.BLUE_OBSIDIAN_BRICKS_STAIRS
                )
                .setPrimaryInputAndUnlock(NetherBlocks.BLUE_OBSIDIAN)
                .setGroup("nether_blue_obsidian_bricks_stairs")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("blue_obsidian_bricks_stonecutter"),
                        NetherBlocks.BLUE_OBSIDIAN_BRICKS
                )
                .setPrimaryInputAndUnlock(NetherBlocks.BLUE_OBSIDIAN)
                .setGroup("nether_blue_obsidian")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("blue_obsidian_rod_tiles_stonecutter"),
                        NetherBlocks.BLUE_OBSIDIAN_ROD_TILES
                )
                .setPrimaryInputAndUnlock(NetherBlocks.BLUE_OBSIDIAN)
                .setGroup("nether_blue_obsidian_rod_tiles")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("blue_obsidian_tile_slab_from_tile_stonecutter"),
                        NetherBlocks.BLUE_OBSIDIAN_TILE_SLAB
                )
                .setPrimaryInputAndUnlock(NetherBlocks.BLUE_OBSIDIAN_TILE)
                .setGroup("nether_blue_obsidian_tile_slab")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .setOutputCount(2)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("blue_obsidian_tile_slab_stonecutter"),
                        NetherBlocks.BLUE_OBSIDIAN_TILE_SLAB
                )
                .setPrimaryInputAndUnlock(NetherBlocks.BLUE_OBSIDIAN)
                .setGroup("nether_blue_obsidian_tile_slab")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .setOutputCount(2)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("blue_obsidian_tile_small_from_bricks_stonecutter"),
                        NetherBlocks.BLUE_OBSIDIAN_TILE_SMALL
                )
                .setPrimaryInputAndUnlock(NetherBlocks.BLUE_OBSIDIAN_BRICKS)
                .setGroup("nether_blue_obsidian_tile_small")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("blue_obsidian_tile_small_stonecutter"),
                        NetherBlocks.BLUE_OBSIDIAN_TILE_SMALL
                )
                .setPrimaryInputAndUnlock(NetherBlocks.BLUE_OBSIDIAN)
                .setGroup("nether_blue_obsidian_tile_small")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("blue_obsidian_tile_stairs_from_tile_stonecutter"),
                        NetherBlocks.BLUE_OBSIDIAN_TILE_STAIRS
                )
                .setPrimaryInputAndUnlock(NetherBlocks.BLUE_OBSIDIAN_TILE)
                .setGroup("nether_blue_obsidian_tile_stairs")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("blue_obsidian_tile_stairs_stonecutter"),
                        NetherBlocks.BLUE_OBSIDIAN_TILE_STAIRS
                )
                .setPrimaryInputAndUnlock(NetherBlocks.BLUE_OBSIDIAN)
                .setGroup("nether_blue_obsidian_tile_stairs")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(BetterNether.C.id("blue_obsidian_tile_stonecutter"), NetherBlocks.BLUE_OBSIDIAN_TILE)
                .setPrimaryInputAndUnlock(NetherBlocks.BLUE_OBSIDIAN)
                .setGroup("nether_blue_obsidian_tile")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("obsidian_bricks_from_tile_stonecutter"),
                        NetherBlocks.OBSIDIAN_BRICKS
                )
                .setPrimaryInputAndUnlock(NetherBlocks.OBSIDIAN_TILE)
                .setGroup("nether_obsidian_bricks")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("obsidian_bricks_slab_from_bricks_stonecutter"),
                        NetherBlocks.OBSIDIAN_BRICKS_SLAB
                )
                .setPrimaryInputAndUnlock(NetherBlocks.OBSIDIAN_BRICKS)
                .setGroup("nether_obsidian_bricks_slab")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .setOutputCount(2)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("obsidian_bricks_slab_stonecutter"),
                        NetherBlocks.OBSIDIAN_BRICKS_SLAB
                )
                .setPrimaryInputAndUnlock(Blocks.OBSIDIAN)
                .setGroup("nether_obsidian_bricks_slab")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .setOutputCount(2)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("obsidian_bricks_stairs_from_bricks_stonecutter"),
                        NetherBlocks.OBSIDIAN_BRICKS_STAIRS
                )
                .setPrimaryInputAndUnlock(NetherBlocks.OBSIDIAN_BRICKS)
                .setGroup("nether_obsidian_bricks_stairs")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("obsidian_bricks_stairs_stonecutter"),
                        NetherBlocks.OBSIDIAN_BRICKS_STAIRS
                )
                .setPrimaryInputAndUnlock(Blocks.OBSIDIAN)
                .setGroup("nether_obsidian_bricks_stairs")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(BetterNether.C.id("obsidian_bricks_stonecutter"), NetherBlocks.OBSIDIAN_BRICKS)
                .setPrimaryInputAndUnlock(Blocks.OBSIDIAN)
                .setGroup("nether_obsidian_bricks")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(BetterNether.C.id("obsidian_rod_tiles_stonecutting"), NetherBlocks.OBSIDIAN_ROD_TILES)
                .setPrimaryInputAndUnlock(Blocks.OBSIDIAN)
                .setGroup("nether_obsidian_rod_tiles")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("obsidian_tile_slab_from_tile_stonecutter"),
                        NetherBlocks.OBSIDIAN_TILE_SLAB
                )
                .setPrimaryInputAndUnlock(NetherBlocks.OBSIDIAN_TILE)
                .setGroup("nether_obsidian_tile_slab")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .setOutputCount(2)
                .build();

        BCLRecipeBuilder
                .stonecutting(BetterNether.C.id("obsidian_tile_slab_stonecutter"), NetherBlocks.OBSIDIAN_TILE_SLAB)
                .setPrimaryInputAndUnlock(Blocks.OBSIDIAN)
                .setGroup("nether_obsidian_tile_slab")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .setOutputCount(2)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("obsidian_tile_small_from_bricks_stonecutter"),
                        NetherBlocks.OBSIDIAN_TILE_SMALL
                )
                .setPrimaryInputAndUnlock(NetherBlocks.OBSIDIAN_BRICKS)
                .setGroup("nether_obsidian_tile_small")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(BetterNether.C.id("obsidian_tile_small_stonecutter"), NetherBlocks.OBSIDIAN_TILE_SMALL)
                .setPrimaryInputAndUnlock(Blocks.OBSIDIAN)
                .setGroup("nether_obsidian_tile_small")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("obsidian_tile_stairs_from_tile_stonecutter"),
                        NetherBlocks.OBSIDIAN_TILE_STAIRS
                )
                .setPrimaryInputAndUnlock(NetherBlocks.OBSIDIAN_TILE)
                .setGroup("nether_obsidian_tile_stairs")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("obsidian_tile_stairs_stonecutter"),
                        NetherBlocks.OBSIDIAN_TILE_STAIRS
                )
                .setPrimaryInputAndUnlock(Blocks.OBSIDIAN)
                .setGroup("nether_obsidian_tile_stairs")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(BetterNether.C.id("obsidian_tile_stonecutter"), NetherBlocks.OBSIDIAN_TILE)
                .setPrimaryInputAndUnlock(Blocks.OBSIDIAN)
                .setGroup("nether_obsidian_tile")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(BetterNether.C.id("cincinnasite_pillar_stonecutting"), NetherBlocks.CINCINNASITE_PILLAR)
                .setPrimaryInputAndUnlock(NetherBlocks.CINCINNASITE_FORGED)
                .setOutputCount(1)
                .setGroup("cincinnasite")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("cincinnasite_tile_large_stonecutting"),
                        NetherBlocks.CINCINNASITE_TILE_LARGE
                )
                .setPrimaryInputAndUnlock(NetherBlocks.CINCINNASITE_FORGED)
                .setOutputCount(1)
                .setGroup("cincinnasite")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(BetterNether.C.id("cincinnasite_carved_stonecutting"), NetherBlocks.CINCINNASITE_CARVED)
                .setPrimaryInputAndUnlock(NetherBlocks.CINCINNASITE_FORGED)
                .setOutputCount(1)
                .setGroup("cincinnasite")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("cincinnasite_tile_small_stonecutting"),
                        NetherBlocks.CINCINNASITE_TILE_SMALL
                )
                .setPrimaryInputAndUnlock(NetherBlocks.CINCINNASITE_FORGED)
                .setOutputCount(1)
                .setGroup("cincinnasite")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("cincinnasite_tile_small_from_large_stonecutting"),
                        NetherBlocks.CINCINNASITE_TILE_SMALL
                )
                .setPrimaryInputAndUnlock(NetherBlocks.CINCINNASITE_TILE_LARGE)
                .setOutputCount(1)
                .setGroup("cincinnasite")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("cincinnasite_roof_tile_stonecutting"),
                        NetherBlocks.ROOF_TILE_CINCINNASITE
                )
                .setPrimaryInputAndUnlock(NetherBlocks.CINCINNASITE_FORGED)
                .setOutputCount(1)
                .setGroup("cincinnasite")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();


        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("basalt_brick_from_smooth_stonecutting"),
                        NetherBlocks.BASALT_BRICKS
                )
                .setPrimaryInputAndUnlock(Blocks.SMOOTH_BASALT)
                .setOutputCount(1)
                .setGroup("basalt")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("basalt_brick_stonecutting"),
                        NetherBlocks.BASALT_BRICKS
                )
                .setPrimaryInputAndUnlock(Blocks.BASALT)
                .setOutputCount(1)
                .setGroup("basalt")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("basalt_brick_stairs_from_smooth_stonecutting"),
                        NetherBlocks.BASALT_BRICKS_STAIRS
                )
                .setPrimaryInputAndUnlock(Blocks.SMOOTH_BASALT)
                .setOutputCount(1)
                .setGroup("basalt")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("basalt_brick_stairs_stonecutting"),
                        NetherBlocks.BASALT_BRICKS_STAIRS
                )
                .setPrimaryInputAndUnlock(Blocks.BASALT)
                .setOutputCount(1)
                .setGroup("basalt")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();


        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("basalt_brick_slabs_from_smooth_stonecutting"),
                        NetherBlocks.BASALT_BRICKS_SLAB
                )
                .setPrimaryInputAndUnlock(Blocks.SMOOTH_BASALT)
                .setOutputCount(2)
                .setGroup("basalt")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("basalt_brick_slabs_stonecutting"),
                        NetherBlocks.BASALT_BRICKS_SLAB
                )
                .setPrimaryInputAndUnlock(Blocks.BASALT)
                .setOutputCount(2)
                .setGroup("basalt")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("basalt_brick_wall_from_smooth_stonecutting"),
                        NetherBlocks.BASALT_BRICKS_WALL
                )
                .setPrimaryInputAndUnlock(Blocks.SMOOTH_BASALT)
                .setOutputCount(1)
                .setGroup("basalt")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("basalt_brick_wall_stonecutting"),
                        NetherBlocks.BASALT_BRICKS_WALL
                )
                .setPrimaryInputAndUnlock(Blocks.BASALT)
                .setOutputCount(1)
                .setGroup("basalt")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();


        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("soul_sandstone_cut_stonecutting"),
                        NetherBlocks.SOUL_SANDSTONE_CUT
                )
                .setPrimaryInputAndUnlock(NetherBlocks.SOUL_SANDSTONE)
                .setOutputCount(1)
                .setGroup("soul_sandstone")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("soul_sandstone_chiseled_stonecutting"),
                        NetherBlocks.SOUL_SANDSTONE_CHISELED
                )
                .setPrimaryInputAndUnlock(NetherBlocks.SOUL_SANDSTONE_SMOOTH)
                .setOutputCount(1)
                .setGroup("soul_sandstone")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("roof_tile_nether_brick_stonecutting"),
                        NetherBlocks.ROOF_TILE_NETHER_BRICKS
                )
                .setPrimaryInputAndUnlock(Blocks.NETHER_BRICKS)
                .setOutputCount(1)
                .setGroup("nether_brick")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("nether_brick_tile_large_stonecutting"),
                        NetherBlocks.NETHER_BRICK_TILE_LARGE
                )
                .setPrimaryInputAndUnlock(Blocks.NETHER_BRICKS)
                .setOutputCount(1)
                .setGroup("nether_brick")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("nether_brick_tile_small_stonecutting"),
                        NetherBlocks.NETHER_BRICK_TILE_SMALL
                )
                .setPrimaryInputAndUnlock(Blocks.NETHER_BRICKS)
                .setOutputCount(1)
                .setGroup("nether_brick")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("nether_brick_tile_small_from_large_stonecutting"),
                        NetherBlocks.NETHER_BRICK_TILE_SMALL
                )
                .setPrimaryInputAndUnlock(NetherBlocks.NETHER_BRICK_TILE_LARGE)
                .setOutputCount(1)
                .setGroup("nether_brick")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("nether_brick_wall_from_brick_stonecutting"),
                        NetherBlocks.NETHER_BRICK_WALL
                )
                .setPrimaryInputAndUnlock(Blocks.NETHER_BRICKS)
                .setOutputCount(1)
                .setGroup("nether_brick")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("nether_brick_wall_from_large_stonecutting"),
                        NetherBlocks.NETHER_BRICK_WALL
                )
                .setPrimaryInputAndUnlock(NetherBlocks.NETHER_BRICK_TILE_LARGE)
                .setOutputCount(1)
                .setGroup("nether_brick")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("nether_brick_tile_slab_from_brick_stonecutting"),
                        NetherBlocks.NETHER_BRICK_TILE_SLAB
                )
                .setPrimaryInputAndUnlock(Blocks.NETHER_BRICKS)
                .setOutputCount(2)
                .setGroup("nether_brick")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("nether_brick_tile_slab_from_large_stonecutting"),
                        NetherBlocks.NETHER_BRICK_TILE_SLAB
                )
                .setPrimaryInputAndUnlock(NetherBlocks.NETHER_BRICK_TILE_LARGE)
                .setOutputCount(2)
                .setGroup("nether_brick")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("nether_brick_tile_stairs_from_brick_stonecutting"),
                        NetherBlocks.NETHER_BRICK_TILE_STAIRS
                )
                .setPrimaryInputAndUnlock(Blocks.NETHER_BRICKS)
                .setOutputCount(1)
                .setGroup("nether_brick")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();

        BCLRecipeBuilder
                .stonecutting(
                        BetterNether.C.id("nether_brick_tile_stairs_from_large_stonecutting"),
                        NetherBlocks.NETHER_BRICK_TILE_STAIRS
                )
                .setPrimaryInputAndUnlock(NetherBlocks.NETHER_BRICK_TILE_LARGE)
                .setOutputCount(1)
                .setGroup("nether_brick")
                .setCategory(RecipeCategory.BUILDING_BLOCKS)
                .build();
    }
}
