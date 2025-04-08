package me.withers_overhaul.item.ore;

import me.withers_overhaul.registry.item.OverhaulItems;
import net.minecraft.block.Block;
import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.function.Consumer;

public class GabbroOreItem extends BlockItem {
    public GabbroOreItem(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
        textConsumer.accept(Text.translatable(OverhaulItems.TOOLTIP_PATH + "ore_gabbro").formatted(Formatting.GRAY));
    }
}
