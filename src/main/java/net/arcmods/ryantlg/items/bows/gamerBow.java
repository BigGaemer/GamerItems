package net.arcmods.ryantlg.items.bows;

import net.arcmods.ryantlg.gamermod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class gamerBow {
    
    public static final Item GAMER_BOW = new BowItem(new FabricItemSettings().group(gamermod.CHING).maxCount(1).fireproof().maxDamage(458));

    public static void register(){
        Registry.register(Registry.ITEM, new Identifier("gamermod", "gamer_bow"), GAMER_BOW);
    }


}