package com.example;

import com.example.block.ModBlocks;
import com.example.item.ModItemGroups;
import com.example.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {

    public static final String MOD_ID = "test_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();

        ModBlocks.registerModBlocks();
    }
}