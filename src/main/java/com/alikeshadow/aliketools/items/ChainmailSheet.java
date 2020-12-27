package com.alikeshadow.aliketools.items;

import com.alikeshadow.aliketools.AlikeTools;
import net.minecraft.item.Item;

public class ChainmailSheet extends Item {
    public ChainmailSheet() {
        super(
                new Properties()
                        .group(AlikeTools.setup.itemGroup)
                        .maxStackSize(16)
        );
        setRegistryName("chainmailsheet");
    }
}
