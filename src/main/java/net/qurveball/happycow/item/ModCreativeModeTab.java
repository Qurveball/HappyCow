package net.qurveball.happycow.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab HAPPYCOW_TAB = new CreativeModeTab("happycowtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.KNIFE.get());
        }
    };
}
