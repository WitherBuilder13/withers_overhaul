package me.withers_overhaul.item;

import me.withers_overhaul.registry.item.OverhaulItems;
import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.function.Consumer;

public class ToolTipItem extends Item {

    Tooltips tooltip;

    public ToolTipItem(Settings settings, Tooltips tooltip) {
        super(settings);
        this.tooltip = tooltip;
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
        textConsumer.accept(Text.translatable(OverhaulItems.TOOLTIP_PATH + this.tooltip.getTooltip()).formatted(Formatting.GRAY));
    }

    public enum Tooltips{
        ORE_GRANITE("ore_granite");

        public final String tooltip;

        Tooltips(String tooltip) {
            this.tooltip = tooltip;
        }

        public String getTooltip() {
            return tooltip;
        }

    }
}