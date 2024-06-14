package net.crioch.fluid_sieve.loot.context;

import net.crioch.fluid_sieve.mixin.accessor.LootContextTypesAccessor;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.loot.context.LootContextType;
import net.minecraft.loot.context.LootContextTypes;

public class FluidSieveLootContextTypes {
    private static final LootContextTypesAccessor ACCESSOR = ((LootContextTypesAccessor) new LootContextTypes());

    public static final LootContextType FLUID_SIEVE = ACCESSOR.callRegister("sieve", builder -> builder.require(LootContextParameters.BLOCK_STATE).require(LootContextParameters.ORIGIN).allow(LootContextParameters.THIS_ENTITY));
}
