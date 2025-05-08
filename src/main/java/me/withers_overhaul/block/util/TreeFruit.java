package me.withers_overhaul.block.util;

import me.withers_overhaul.registry.item.BasicItems;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.StringIdentifiable;

public class TreeFruit {

    public enum Temperate implements FruitEnum {
        APPLE("apple", Items.APPLE),
        APRICOT("apricot", BasicItems.APRICOT),
        KIWI("kiwi", BasicItems.KIWI),
        PEACH("peach", BasicItems.PEACH),
        PEAR("pear", BasicItems.PEAR),
        PLUM("plum", BasicItems.PLUM),
        NONE("none", null);

        private final String name;
        private final Item item;

        Temperate(final String name, Item item) {
            this.name = name;
            this.item = item;
        }

        @Override
        public String asString() {
            return name;
        }

        @Override
        public Item getItem() {
            return item;
        }
    }

    public enum Mediterranean implements FruitEnum {
        KUMQUAT("kumquat", BasicItems.KUMQUAT),
        OLIVE("olive", BasicItems.OLIVE),
        PERSIMMON("persimmon", BasicItems.PERSIMMON),
        POMEGRANATE("pomegranate", BasicItems.POMEGRANATE),
        NONE("none", null);

        private final String name;
        private final Item item;

        Mediterranean(final String name, Item item) {
            this.name = name;
            this.item = item;
        }

        @Override
        public String asString() {
            return name;
        }

        @Override
        public Item getItem() {
            return item;
        }
    }

    public enum Subtropical implements FruitEnum {
        CHERRY("cherry", BasicItems.CHERRY),
        FIG("fig", BasicItems.FIG),
        GRAPEFRUIT("grapefruit", BasicItems.GRAPEFRUIT),
        GUAVA("guava", BasicItems.GUAVA),
        TANGERINE("tangerine", BasicItems.TANGERINE),
        NONE("none", null);

        private final String name;
        private final Item item;

        Subtropical(final String name, Item item) {
            this.name = name;
            this.item = item;
        }

        @Override
        public String asString() {
            return name;
        }

        @Override
        public Item getItem() {
            return item;
        }
    }

    public enum Tropical implements FruitEnum {
        AVOCADO("avocado", BasicItems.AVOCADO),
        BANANA("banana", BasicItems.BANANA),
        LEMON("lemon", BasicItems.LEMON),
        LIME("lime", BasicItems.LIME),
        MANGO("mango", BasicItems.MANGO),
        ORANGE("orange", BasicItems.ORANGE),
        STARFRUIT("starfruit", BasicItems.STARFRUIT),
        NONE("none", null);

        private final String name;
        private final Item item;

        Tropical(final String name, Item item) {
            this.name = name;
            this.item = item;
        }

        @Override
        public String asString() {
            return name;
        }

        @Override
        public Item getItem() {
            return item;
        }
    }

    public interface FruitEnum extends StringIdentifiable {
        @Override
        String asString();
        Item getItem();
    }
}
