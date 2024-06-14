package net.crioch.fluid_sieve.block;

import net.crioch.fluid_sieve.FluidSieveMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class FluidSieveBlocks {
    public static final Block STRING_SIEVE = register("string_sieve", new BaseSieve(FabricBlockSettings.copy(Blocks.OAK_PLANKS).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block DENSE_SIEVE = register("dense_sieve", new BaseSieve(FabricBlockSettings.copy(Blocks.OAK_PLANKS).pistonBehavior(PistonBehavior.DESTROY)));

    public static void register() {
    }

    private static Block register(String path, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(FluidSieveMod.MOD_ID, path), block);
    }
}
