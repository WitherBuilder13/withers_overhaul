package me.withers_overhaul.item;

import me.withers_overhaul.registry.item.OverhaulItems;
import net.minecraft.component.ComponentsAccess;
import net.minecraft.item.Item;
import net.minecraft.item.tooltip.TooltipAppender;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.function.Consumer;

public abstract class ToolTipItem extends Item implements TooltipAppender {

    Tooltips tooltip;

    public ToolTipItem(Settings settings, Tooltips tooltip) {
        super(settings);
        this.tooltip = tooltip;
    }

    @Override
    public void appendTooltip(Item.TooltipContext context, Consumer<Text> textConsumer, TooltipType type, ComponentsAccess components) {
        textConsumer.accept(Text.translatable(OverhaulItems.TOOLTIP_PATH + this.tooltip.getTooltip()).formatted(Formatting.GRAY));
    }

    public enum Tooltips{
        ORE_GRANITE("ore_granite"),
        ORE_DIORITE("ore_diorite"),
        ORE_ANDESITE("ore_andesite"),
        ORE_TUFF("ore_tuff"),
        ORE_GNEISS("ore_gneiss"),
        ORE_SHALE("ore_shale"),
        ORE_LIMESTONE("ore_limestone"),
        ORE_MARBLE("ore_marble"),
        ORE_GABBRO("ore_gabbro"),
        ORE_PHYLLITE("ore_phyllite"),
        RUNE("rune");

        public final String tooltip;

        Tooltips(String tooltip) {
            this.tooltip = tooltip;
        }

        public String getTooltip() {
            return tooltip;
        }

    }
}