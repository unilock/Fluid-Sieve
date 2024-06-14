package net.crioch.fluid_sieve.mixin.accessor;

import net.minecraft.loot.context.LootContextType;
import net.minecraft.loot.context.LootContextTypes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.function.Consumer;

@Mixin(LootContextTypes.class)
public interface LootContextTypesAccessor {
    @Invoker
    LootContextType callRegister(String name, Consumer<LootContextType.Builder> type);
}
