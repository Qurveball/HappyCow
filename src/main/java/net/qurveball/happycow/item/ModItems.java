package net.qurveball.happycow.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.qurveball.happycow.HappyCow;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HappyCow.MOD_ID);
    public static final RegistryObject<Item> KNIFE = ITEMS.register("knife",
            () -> new SwordItem(Tiers.WOOD, 3, -1.5f,
                    new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.HAPPYCOW_TAB)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
