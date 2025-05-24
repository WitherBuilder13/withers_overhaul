package me.withers_overhaul.block.fruit.tree;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import me.withers_overhaul.world.feature.configured.OverhaulTreeConfiguredFeatures;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class FruitSaplingGenerator {
    private static final Map<String, FruitSaplingGenerator> GENERATORS = new Object2ObjectArrayMap<>();
    public static final Codec<FruitSaplingGenerator> CODEC = Codec.stringResolver(generator -> generator.id, GENERATORS::get);

    // ` ---------------------------------------------------------------------------------------------------------------

    public static FruitSaplingGenerator MAPLE = new FruitSaplingGenerator(
            "maple",
            0.2F,
            TreeFruit.Temperate.class,
            OverhaulTreeConfiguredFeatures.MAPLE,
            Optional.of(OverhaulTreeConfiguredFeatures.FANCY_MAPLE),
            Optional.empty(),
            List.of(
                    OverhaulTreeConfiguredFeatures.MAPLE_APPLE,
                    OverhaulTreeConfiguredFeatures.MAPLE_APRICOT,
                    OverhaulTreeConfiguredFeatures.MAPLE_KIWI,
                    OverhaulTreeConfiguredFeatures.MAPLE_NECTARINE,
                    OverhaulTreeConfiguredFeatures.MAPLE_PEACH,
                    OverhaulTreeConfiguredFeatures.MAPLE_PEAR,
                    OverhaulTreeConfiguredFeatures.MAPLE_PLUM
            ),
            Optional.of(List.of(
                    OverhaulTreeConfiguredFeatures.FANCY_MAPLE_APPLE,
                    OverhaulTreeConfiguredFeatures.FANCY_MAPLE_APRICOT,
                    OverhaulTreeConfiguredFeatures.FANCY_MAPLE_KIWI,
                    OverhaulTreeConfiguredFeatures.FANCY_MAPLE_NECTARINE,
                    OverhaulTreeConfiguredFeatures.FANCY_MAPLE_PEACH,
                    OverhaulTreeConfiguredFeatures.FANCY_MAPLE_PEAR,
                    OverhaulTreeConfiguredFeatures.FANCY_MAPLE_PLUM
            )),
            Optional.empty()
    );

    public static FruitSaplingGenerator POPLAR = new FruitSaplingGenerator(
            "poplar",
            TreeFruit.Temperate.class,
            OverhaulTreeConfiguredFeatures.POPLAR,
            Optional.empty(),
            List.of(
                    OverhaulTreeConfiguredFeatures.POPLAR_APPLE,
                    OverhaulTreeConfiguredFeatures.POPLAR_APRICOT,
                    OverhaulTreeConfiguredFeatures.POPLAR_KIWI,
                    OverhaulTreeConfiguredFeatures.POPLAR_NECTARINE,
                    OverhaulTreeConfiguredFeatures.POPLAR_PEACH,
                    OverhaulTreeConfiguredFeatures.POPLAR_PEAR,
                    OverhaulTreeConfiguredFeatures.POPLAR_PLUM
            ),
            Optional.empty()
    );

    public static FruitSaplingGenerator BEECH = new FruitSaplingGenerator(
            "beech",
            TreeFruit.Temperate.class,
            OverhaulTreeConfiguredFeatures.BEECH,
            Optional.empty(),
            List.of(
                    OverhaulTreeConfiguredFeatures.BEECH_APPLE,
                    OverhaulTreeConfiguredFeatures.BEECH_APRICOT,
                    OverhaulTreeConfiguredFeatures.BEECH_KIWI,
                    OverhaulTreeConfiguredFeatures.BEECH_NECTARINE,
                    OverhaulTreeConfiguredFeatures.BEECH_PEACH,
                    OverhaulTreeConfiguredFeatures.BEECH_PEAR,
                    OverhaulTreeConfiguredFeatures.BEECH_PLUM
            ),
            Optional.empty()
    );

    public static FruitSaplingGenerator HICKORY = new FruitSaplingGenerator(
            "hickory",
            TreeFruit.Subtropical.class,
            OverhaulTreeConfiguredFeatures.HICKORY,
            Optional.empty(),
            List.of(
                    OverhaulTreeConfiguredFeatures.HICKORY_CHERRY,
                    OverhaulTreeConfiguredFeatures.HICKORY_FIG,
                    OverhaulTreeConfiguredFeatures.HICKORY_GRAPEFRUIT,
                    OverhaulTreeConfiguredFeatures.HICKORY_GUAVA,
                    OverhaulTreeConfiguredFeatures.HICKORY_TANGERINE
            ),
            Optional.empty()
    );

    public static FruitSaplingGenerator PALO_VERDE = new FruitSaplingGenerator(
            "palo_verde",
            TreeFruit.Mediterranean.class,
            OverhaulTreeConfiguredFeatures.PALO_VERDE,
            Optional.empty(),
            List.of(
                    OverhaulTreeConfiguredFeatures.PALO_VERDE_KUMQUAT,
                    OverhaulTreeConfiguredFeatures.PALO_VERDE_OLIVE,
                    OverhaulTreeConfiguredFeatures.PALO_VERDE_PERSIMMON,
                    OverhaulTreeConfiguredFeatures.PALO_VERDE_POMEGRANATE
            ),
            Optional.empty()
    );

    public static FruitSaplingGenerator EBONY = new FruitSaplingGenerator(
            "ebony",
            TreeFruit.Temperate.class,
            OverhaulTreeConfiguredFeatures.EBONY,
            Optional.of(OverhaulTreeConfiguredFeatures.MEGA_EBONY),
            List.of(
                    OverhaulTreeConfiguredFeatures.EBONY_APPLE,
                    OverhaulTreeConfiguredFeatures.EBONY_APRICOT,
                    OverhaulTreeConfiguredFeatures.EBONY_KIWI,
                    OverhaulTreeConfiguredFeatures.EBONY_NECTARINE,
                    OverhaulTreeConfiguredFeatures.EBONY_PEACH,
                    OverhaulTreeConfiguredFeatures.EBONY_PEAR,
                    OverhaulTreeConfiguredFeatures.EBONY_PLUM
            ),
            Optional.of(List.of(
                    OverhaulTreeConfiguredFeatures.MEGA_EBONY_APPLE,
                    OverhaulTreeConfiguredFeatures.MEGA_EBONY_APRICOT,
                    OverhaulTreeConfiguredFeatures.MEGA_EBONY_KIWI,
                    OverhaulTreeConfiguredFeatures.MEGA_EBONY_NECTARINE,
                    OverhaulTreeConfiguredFeatures.MEGA_EBONY_PEACH,
                    OverhaulTreeConfiguredFeatures.MEGA_EBONY_PEAR,
                    OverhaulTreeConfiguredFeatures.MEGA_EBONY_PLUM
            ))
    );

    public static FruitSaplingGenerator TEAK = new FruitSaplingGenerator(
            "teak",
            TreeFruit.Temperate.class,
            OverhaulTreeConfiguredFeatures.TEAK,
            Optional.empty(),
            List.of(
                    OverhaulTreeConfiguredFeatures.TEAK_APPLE,
                    OverhaulTreeConfiguredFeatures.TEAK_APRICOT,
                    OverhaulTreeConfiguredFeatures.TEAK_KIWI,
                    OverhaulTreeConfiguredFeatures.TEAK_NECTARINE,
                    OverhaulTreeConfiguredFeatures.TEAK_PEACH,
                    OverhaulTreeConfiguredFeatures.TEAK_PEAR,
                    OverhaulTreeConfiguredFeatures.TEAK_PLUM
            ),
            Optional.empty()
    );

    public static FruitSaplingGenerator ELM = new FruitSaplingGenerator(
            "elm",
            TreeFruit.Temperate.class,
            OverhaulTreeConfiguredFeatures.ELM,
            Optional.empty(),
            List.of(
                    OverhaulTreeConfiguredFeatures.ELM_APPLE,
                    OverhaulTreeConfiguredFeatures.ELM_APRICOT,
                    OverhaulTreeConfiguredFeatures.ELM_KIWI,
                    OverhaulTreeConfiguredFeatures.ELM_NECTARINE,
                    OverhaulTreeConfiguredFeatures.ELM_PEAR,
                    OverhaulTreeConfiguredFeatures.ELM_PEACH,
                    OverhaulTreeConfiguredFeatures.ELM_PLUM
            ),
            Optional.empty()
    );

    // ` ---------------------------------------------------------------------------------------------------------------

    private final String id;
    private final float rareChance;
    private final Class<? extends TreeFruit.FruitEnum> fruitEnum;
    private final RegistryKey<ConfiguredFeature<?, ?>> defaultTreeConfiguredFeature;
    private final Optional<RegistryKey<ConfiguredFeature<?, ?>>> rareDefaultTreeConfiguredFeature;
    private final Optional<RegistryKey<ConfiguredFeature<?, ?>>> megaDefaultTreeConfiguredFeature;
    private final List<RegistryKey<ConfiguredFeature<?, ?>>> fruitTreeConfiguredFeatures;
    private final Optional<List<RegistryKey<ConfiguredFeature<?, ?>>>> rareFruitTreeConfiguredFeatures;
    private final Optional<List<RegistryKey<ConfiguredFeature<?, ?>>>> megaFruitTreeConfiguredFeatures;

    // ` ---------------------------------------------------------------------------------------------------------------

    public FruitSaplingGenerator(
            String id,
            Class<? extends  TreeFruit.FruitEnum> fruitEnum,
            RegistryKey<ConfiguredFeature<?, ?>> defaultTreeConfiguredFeature,
            Optional<RegistryKey<ConfiguredFeature<?, ?>>> megaDefaultTreeConfiguredFeature,
            List<RegistryKey<ConfiguredFeature<?, ?>>> fruitTreeConfiguredFeatures,
            Optional<List<RegistryKey<ConfiguredFeature<?, ?>>>> megaFruitTreeConfiguredFeatures
    ) {
        this.id = id;
        this.rareChance = 0.0F;
        this.fruitEnum = fruitEnum;
        this.defaultTreeConfiguredFeature = defaultTreeConfiguredFeature;
        this.rareDefaultTreeConfiguredFeature = Optional.empty();
        this.megaDefaultTreeConfiguredFeature = megaDefaultTreeConfiguredFeature;
        this.fruitTreeConfiguredFeatures = fruitTreeConfiguredFeatures;
        this.rareFruitTreeConfiguredFeatures = Optional.empty();
        this.megaFruitTreeConfiguredFeatures = megaFruitTreeConfiguredFeatures;
    }

    public FruitSaplingGenerator(
            String id,
            float rareChance,
            Class<? extends TreeFruit.FruitEnum> fruitEnum,
            RegistryKey<ConfiguredFeature<?, ?>> defaultTreeConfiguredFeature,
            Optional<RegistryKey<ConfiguredFeature<?, ?>>> rareDefaultTreeConfiguredFeature,
            Optional<RegistryKey<ConfiguredFeature<?, ?>>> megaDefaultTreeConfiguredFeature,
            List<RegistryKey<ConfiguredFeature<?, ?>>> fruitTreeConfiguredFeatures,
            Optional<List<RegistryKey<ConfiguredFeature<?, ?>>>> rareFruitTreeConfiguredFeatures,
            Optional<List<RegistryKey<ConfiguredFeature<?, ?>>>> megaFruitTreeConfiguredFeatures
    ) {
        this.id = id;
        this.rareChance = rareChance;
        this.fruitEnum = fruitEnum;
        this.defaultTreeConfiguredFeature = defaultTreeConfiguredFeature;
        this.rareDefaultTreeConfiguredFeature = rareDefaultTreeConfiguredFeature;
        this.megaDefaultTreeConfiguredFeature = megaDefaultTreeConfiguredFeature;
        this.fruitTreeConfiguredFeatures = fruitTreeConfiguredFeatures;
        this.rareFruitTreeConfiguredFeatures = rareFruitTreeConfiguredFeatures;
        this.megaFruitTreeConfiguredFeatures = megaFruitTreeConfiguredFeatures;
    }

    // ` ---------------------------------------------------------------------------------------------------------------

    private RegistryKey<ConfiguredFeature<?, ?>> getDefaultTreeConfiguredFeature(Random random) {
        if (this.rareDefaultTreeConfiguredFeature.isPresent() && random.nextFloat() < this.rareChance) {
            return this.rareDefaultTreeConfiguredFeature.get();
        }
        return this.defaultTreeConfiguredFeature;
    }

    private RegistryKey<ConfiguredFeature<?, ?>> getFruitTreeConfiguredFeature(int index, Random random) {
        if (this.rareFruitTreeConfiguredFeatures.isPresent() && random.nextFloat() < this.rareChance) {
            return this.rareFruitTreeConfiguredFeatures.get().get(index);
        }
        return this.fruitTreeConfiguredFeatures.get(index);
    }

    @Nullable
    private RegistryKey<ConfiguredFeature<?, ?>> getMegaDefaultTreeConfiguredFeature() {
        return this.megaDefaultTreeConfiguredFeature.orElse(null);
    }

    @Nullable
    private RegistryKey<ConfiguredFeature<?, ?>> getMegaFruitTreeConfiguredFeature(int index) {
        return this.megaFruitTreeConfiguredFeatures.orElse(List.of()).get(index);
    }

    public boolean generate(ServerWorld world, ChunkGenerator chunkGenerator, BlockPos pos, BlockState state, Random random) {

        RegistryKey<ConfiguredFeature<?, ?>> defaultTreeKey = this.getDefaultTreeConfiguredFeature(random);
        RegistryEntry<ConfiguredFeature<?, ?>> defaultTreeEntry = world.getRegistryManager()
                .getOrThrow(RegistryKeys.CONFIGURED_FEATURE)
                .getOptional(defaultTreeKey)
                .orElse(null);

        assert defaultTreeEntry != null;
        ConfiguredFeature<?, ?> defaultTreeConfiguredFeature = defaultTreeEntry.value();

        BlockState blockState = Blocks.AIR.getDefaultState();
        world.setBlockState(pos, blockState, Block.SKIP_REDRAW_AND_BLOCK_ENTITY_REPLACED_CALLBACK);

        if (fruitEnum.equals(TreeFruit.Temperate.class)) {
            RegistryKey<ConfiguredFeature<?, ?>> appleTreeKey = this.getFruitTreeConfiguredFeature(0, random);
            RegistryKey<ConfiguredFeature<?, ?>> apricotTreeKey = this.getFruitTreeConfiguredFeature(1, random);
            RegistryKey<ConfiguredFeature<?, ?>> kiwiTreeKey = this.getFruitTreeConfiguredFeature(2, random);
            RegistryKey<ConfiguredFeature<?, ?>> nectarineTreeKey = this.getFruitTreeConfiguredFeature(3, random);
            RegistryKey<ConfiguredFeature<?, ?>> peachTreeKey = this.getFruitTreeConfiguredFeature(4, random);
            RegistryKey<ConfiguredFeature<?, ?>> pearTreeKey = this.getFruitTreeConfiguredFeature(5, random);
            RegistryKey<ConfiguredFeature<?, ?>> plumTreeKey = this.getFruitTreeConfiguredFeature(6, random);

            RegistryEntry<ConfiguredFeature<?, ?>> appleTreeEntry = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.CONFIGURED_FEATURE)
                    .getOptional(appleTreeKey)
                    .orElse(null);
            RegistryEntry<ConfiguredFeature<?, ?>> apricotTreeEntry = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.CONFIGURED_FEATURE)
                    .getOptional(apricotTreeKey)
                    .orElse(null);
            RegistryEntry<ConfiguredFeature<?, ?>> kiwiTreeEntry = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.CONFIGURED_FEATURE)
                    .getOptional(kiwiTreeKey)
                    .orElse(null);
            RegistryEntry<ConfiguredFeature<?, ?>> nectarineTreeEntry = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.CONFIGURED_FEATURE)
                    .getOptional(nectarineTreeKey)
                    .orElse(null);
            RegistryEntry<ConfiguredFeature<?, ?>> peachTreeEntry = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.CONFIGURED_FEATURE)
                    .getOptional(peachTreeKey)
                    .orElse(null);
            RegistryEntry<ConfiguredFeature<?, ?>> pearTreeEntry = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.CONFIGURED_FEATURE)
                    .getOptional(pearTreeKey)
                    .orElse(null);
            RegistryEntry<ConfiguredFeature<?, ?>> plumTreeEntry = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.CONFIGURED_FEATURE)
                    .getOptional(plumTreeKey)
                    .orElse(null);

            assert appleTreeEntry != null;
            assert apricotTreeEntry != null;
            assert kiwiTreeEntry != null;
            assert nectarineTreeEntry != null;
            assert peachTreeEntry != null;
            assert pearTreeEntry != null;
            assert plumTreeEntry != null;

            ConfiguredFeature<?, ?> appleTreeConfiguredFeature = appleTreeEntry.value();
            ConfiguredFeature<?, ?> apricotTreeConfiguredFeature = apricotTreeEntry.value();
            ConfiguredFeature<?, ?> kiwiTreeConfiguredFeature = kiwiTreeEntry.value();
            ConfiguredFeature<?, ?> nectarineTreeConfiguredFeature = nectarineTreeEntry.value();
            ConfiguredFeature<?, ?> peachTreeConfiguredFeature = peachTreeEntry.value();
            ConfiguredFeature<?, ?> pearTreeConfiguredFeature = pearTreeEntry.value();
            ConfiguredFeature<?, ?> plumTreeConfiguredFeature = plumTreeEntry.value();

            if (state == state.with(TemperateFruitSaplingBlock.FRUIT, TreeFruit.Temperate.APPLE)) {
                if (appleTreeConfiguredFeature.generate(world, chunkGenerator, random, pos)) {
                    return true;
                }
            } else if (state == state.with(TemperateFruitSaplingBlock.FRUIT, TreeFruit.Temperate.APRICOT)) {
                if (apricotTreeConfiguredFeature.generate(world, chunkGenerator, random, pos)) {
                    return true;
                }
            } else if (state == state.with(TemperateFruitSaplingBlock.FRUIT, TreeFruit.Temperate.KIWI)) {
                if (kiwiTreeConfiguredFeature.generate(world, chunkGenerator, random, pos)) {
                    return true;
                }
            } else if (state == state.with(TemperateFruitSaplingBlock.FRUIT, TreeFruit.Temperate.NECTARINE)) {
                if (nectarineTreeConfiguredFeature.generate(world, chunkGenerator, random, pos)) {
                    return true;
                }
            } else if (state == state.with(TemperateFruitSaplingBlock.FRUIT, TreeFruit.Temperate.PEACH)) {
                if (peachTreeConfiguredFeature.generate(world, chunkGenerator, random, pos)) {
                    return true;
                }
            } else if (state == state.with(TemperateFruitSaplingBlock.FRUIT, TreeFruit.Temperate.PEAR)) {
                if (pearTreeConfiguredFeature.generate(world, chunkGenerator, random, pos)) {
                    return true;
                }
            } else if (state == state.with(TemperateFruitSaplingBlock.FRUIT, TreeFruit.Temperate.PLUM)) {
                if (plumTreeConfiguredFeature.generate(world, chunkGenerator, random, pos)) {
                    return true;
                }
            }

        } else if (fruitEnum.equals(TreeFruit.Mediterranean.class)) {
            RegistryKey<ConfiguredFeature<?, ?>> kumquatTreeKey = this.getFruitTreeConfiguredFeature(0, random);
            RegistryKey<ConfiguredFeature<?, ?>> oliveTreeKey = this.getFruitTreeConfiguredFeature(1, random);
            RegistryKey<ConfiguredFeature<?, ?>> persimmonTreeKey = this.getFruitTreeConfiguredFeature(2, random);
            RegistryKey<ConfiguredFeature<?, ?>> pomegranateTreeKey = this.getFruitTreeConfiguredFeature(3, random);

            RegistryEntry<ConfiguredFeature<?, ?>> kumquatTreeEntry = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.CONFIGURED_FEATURE)
                    .getOptional(kumquatTreeKey)
                    .orElse(null);
            RegistryEntry<ConfiguredFeature<?, ?>> oliveTreeEntry = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.CONFIGURED_FEATURE)
                    .getOptional(oliveTreeKey)
                    .orElse(null);
            RegistryEntry<ConfiguredFeature<?, ?>> persimmonTreeEntry = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.CONFIGURED_FEATURE)
                    .getOptional(persimmonTreeKey)
                    .orElse(null);
            RegistryEntry<ConfiguredFeature<?, ?>> pomegranateTreeEntry = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.CONFIGURED_FEATURE)
                    .getOptional(pomegranateTreeKey)
                    .orElse(null);

            assert kumquatTreeEntry != null;
            assert oliveTreeEntry != null;
            assert persimmonTreeEntry != null;
            assert pomegranateTreeEntry != null;

            ConfiguredFeature<?, ?> kumquatTreeConfiguredFeature = kumquatTreeEntry.value();
            ConfiguredFeature<?, ?> oliveTreeConfiguredFeature = oliveTreeEntry.value();
            ConfiguredFeature<?, ?> persimmonTreeConfiguredFeature = persimmonTreeEntry.value();
            ConfiguredFeature<?, ?> pomegranateTreeConfiguredFeature = pomegranateTreeEntry.value();

            if (state == state.with(MediterraneanFruitSaplingBlock.FRUIT, TreeFruit.Mediterranean.KUMQUAT)) {
                if (kumquatTreeConfiguredFeature.generate(world, chunkGenerator, random, pos)) {
                    return true;
                }
            } else if (state == state.with(MediterraneanFruitSaplingBlock.FRUIT, TreeFruit.Mediterranean.OLIVE)) {
                if (oliveTreeConfiguredFeature.generate(world, chunkGenerator, random, pos)) {
                    return true;
                }
            } else if (state == state.with(MediterraneanFruitSaplingBlock.FRUIT, TreeFruit.Mediterranean.PERSIMMON)) {
                if (persimmonTreeConfiguredFeature.generate(world, chunkGenerator, random, pos)) {
                    return true;
                }
            } else if (state == state.with(MediterraneanFruitSaplingBlock.FRUIT, TreeFruit.Mediterranean.POMEGRANATE)) {
                if (pomegranateTreeConfiguredFeature.generate(world, chunkGenerator, random, pos)) {
                    return true;
                }
            }

        } else if (fruitEnum.equals(TreeFruit.Subtropical.class)) {
            RegistryKey<ConfiguredFeature<?, ?>> cherryTreeKey = this.getFruitTreeConfiguredFeature(0, random);
            RegistryKey<ConfiguredFeature<?, ?>> figTreeKey = this.getFruitTreeConfiguredFeature(1, random);
            RegistryKey<ConfiguredFeature<?, ?>> grapefruitTreeKey = this.getFruitTreeConfiguredFeature(2, random);
            RegistryKey<ConfiguredFeature<?, ?>> guavaTreeKey = this.getFruitTreeConfiguredFeature(3, random);
            RegistryKey<ConfiguredFeature<?, ?>> tangerineTreeKey = this.getFruitTreeConfiguredFeature(4, random);

            RegistryEntry<ConfiguredFeature<?, ?>> cherryTreeEntry = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.CONFIGURED_FEATURE)
                    .getOptional(cherryTreeKey)
                    .orElse(null);
            RegistryEntry<ConfiguredFeature<?, ?>> figTreeEntry = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.CONFIGURED_FEATURE)
                    .getOptional(figTreeKey)
                    .orElse(null);
            RegistryEntry<ConfiguredFeature<?, ?>> grapefruitTreeEntry = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.CONFIGURED_FEATURE)
                    .getOptional(grapefruitTreeKey)
                    .orElse(null);
            RegistryEntry<ConfiguredFeature<?, ?>> guavaTreeEntry = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.CONFIGURED_FEATURE)
                    .getOptional(guavaTreeKey)
                    .orElse(null);
            RegistryEntry<ConfiguredFeature<?, ?>> tangerineTreeEntry = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.CONFIGURED_FEATURE)
                    .getOptional(tangerineTreeKey)
                    .orElse(null);

            assert cherryTreeEntry != null;
            assert figTreeEntry != null;
            assert grapefruitTreeEntry != null;
            assert guavaTreeEntry != null;
            assert tangerineTreeEntry != null;

            ConfiguredFeature<?, ?> cherryTreeConfiguredFeature = cherryTreeEntry.value();
            ConfiguredFeature<?, ?> figTreeConfiguredFeature = figTreeEntry.value();
            ConfiguredFeature<?, ?> grapefruitTreeConfiguredFeature = grapefruitTreeEntry.value();
            ConfiguredFeature<?, ?> guavaTreeConfiguredFeature = guavaTreeEntry.value();
            ConfiguredFeature<?, ?> tangerineTreeConfiguredFeature = tangerineTreeEntry.value();

            if (state == state.with(SubtropicalFruitSaplingBlock.FRUIT, TreeFruit.Subtropical.CHERRY)) {
                if (cherryTreeConfiguredFeature.generate(world, chunkGenerator, random, pos)) {
                    return true;
                }
            } else if (state == state.with(SubtropicalFruitSaplingBlock.FRUIT, TreeFruit.Subtropical.FIG)) {
                if (figTreeConfiguredFeature.generate(world, chunkGenerator, random, pos)) {
                    return true;
                }
            } else if (state == state.with(SubtropicalFruitSaplingBlock.FRUIT, TreeFruit.Subtropical.GRAPEFRUIT)) {
                if (grapefruitTreeConfiguredFeature.generate(world, chunkGenerator, random, pos)) {
                    return true;
                }
            } else if (state == state.with(SubtropicalFruitSaplingBlock.FRUIT, TreeFruit.Subtropical.GUAVA)) {
                if (guavaTreeConfiguredFeature.generate(world, chunkGenerator, random, pos)) {
                    return true;
                }
            } else if (state == state.with(SubtropicalFruitSaplingBlock.FRUIT, TreeFruit.Subtropical.TANGERINE)) {
                if (tangerineTreeConfiguredFeature.generate(world, chunkGenerator, random, pos)) {
                    return true;
                }
            }

        } else if (fruitEnum.equals(TreeFruit.Tropical.class)) {
            RegistryKey<ConfiguredFeature<?, ?>> avocadoTreeKey = this.getFruitTreeConfiguredFeature(0, random);
            RegistryKey<ConfiguredFeature<?, ?>> bananaTreeKey = this.getFruitTreeConfiguredFeature(1, random);
            RegistryKey<ConfiguredFeature<?, ?>> lemonTreeKey = this.getFruitTreeConfiguredFeature(2, random);
            RegistryKey<ConfiguredFeature<?, ?>> limeTreeKey = this.getFruitTreeConfiguredFeature(3, random);
            RegistryKey<ConfiguredFeature<?, ?>> mangoTreeKey = this.getFruitTreeConfiguredFeature(4, random);
            RegistryKey<ConfiguredFeature<?, ?>> orangeTreeKey = this.getFruitTreeConfiguredFeature(5, random);
            RegistryKey<ConfiguredFeature<?, ?>> starfruitTreeKey = this.getFruitTreeConfiguredFeature(6, random);

            RegistryEntry<ConfiguredFeature<?, ?>> avocadoTreeEntry = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.CONFIGURED_FEATURE)
                    .getOptional(avocadoTreeKey)
                    .orElse(null);
            RegistryEntry<ConfiguredFeature<?, ?>> bananaTreeEntry = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.CONFIGURED_FEATURE)
                    .getOptional(bananaTreeKey)
                    .orElse(null);
            RegistryEntry<ConfiguredFeature<?, ?>> lemonTreeEntry = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.CONFIGURED_FEATURE)
                    .getOptional(lemonTreeKey)
                    .orElse(null);
            RegistryEntry<ConfiguredFeature<?, ?>> limeTreeEntry = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.CONFIGURED_FEATURE)
                    .getOptional(limeTreeKey)
                    .orElse(null);
            RegistryEntry<ConfiguredFeature<?, ?>> mangoTreeEntry = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.CONFIGURED_FEATURE)
                    .getOptional(mangoTreeKey)
                    .orElse(null);
            RegistryEntry<ConfiguredFeature<?, ?>> orangeTreeEntry = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.CONFIGURED_FEATURE)
                    .getOptional(orangeTreeKey)
                    .orElse(null);
            RegistryEntry<ConfiguredFeature<?, ?>> starfruitTreeEntry = world.getRegistryManager()
                    .getOrThrow(RegistryKeys.CONFIGURED_FEATURE)
                    .getOptional(starfruitTreeKey)
                    .orElse(null);

            assert avocadoTreeEntry != null;
            assert bananaTreeEntry != null;
            assert lemonTreeEntry != null;
            assert limeTreeEntry != null;
            assert mangoTreeEntry != null;
            assert orangeTreeEntry != null;
            assert starfruitTreeEntry != null;

            ConfiguredFeature<?, ?> avocadoTreeConfiguredFeature = avocadoTreeEntry.value();
            ConfiguredFeature<?, ?> bananaTreeConfiguredFeature = bananaTreeEntry.value();
            ConfiguredFeature<?, ?> lemonTreeConfiguredFeature = lemonTreeEntry.value();
            ConfiguredFeature<?, ?> limeTreeConfiguredFeature = limeTreeEntry.value();
            ConfiguredFeature<?, ?> mangoTreeConfiguredFeature = mangoTreeEntry.value();
            ConfiguredFeature<?, ?> orangeTreeConfiguredFeature = orangeTreeEntry.value();
            ConfiguredFeature<?, ?> starfruitTreeConfiguredFeature = starfruitTreeEntry.value();

            if (state == state.with(TropicalFruitSaplingBlock.FRUIT, TreeFruit.Tropical.AVOCADO)) {
                if (avocadoTreeConfiguredFeature.generate(world, chunkGenerator, random, pos)) {
                    return true;
                }
            } else if (state == state.with(TropicalFruitSaplingBlock.FRUIT, TreeFruit.Tropical.BANANA)) {
                if (bananaTreeConfiguredFeature.generate(world, chunkGenerator, random, pos)) {
                    return true;
                }
            } else if (state == state.with(TropicalFruitSaplingBlock.FRUIT, TreeFruit.Tropical.LEMON)) {
                if (lemonTreeConfiguredFeature.generate(world, chunkGenerator, random, pos)) {
                    return true;
                }
            } else if (state == state.with(TropicalFruitSaplingBlock.FRUIT, TreeFruit.Tropical.LIME)) {
                if (limeTreeConfiguredFeature.generate(world, chunkGenerator, random, pos)) {
                    return true;
                }
            } else if (state == state.with(TropicalFruitSaplingBlock.FRUIT, TreeFruit.Tropical.MANGO)) {
                if (mangoTreeConfiguredFeature.generate(world, chunkGenerator, random, pos)) {
                    return true;
                }
            } else if (state == state.with(TropicalFruitSaplingBlock.FRUIT, TreeFruit.Tropical.ORANGE)) {
                if (orangeTreeConfiguredFeature.generate(world, chunkGenerator, random, pos)) {
                    return true;
                }
            } else if (state == state.with(TropicalFruitSaplingBlock.FRUIT, TreeFruit.Tropical.STARFRUIT)) {
                if (starfruitTreeConfiguredFeature.generate(world, chunkGenerator, random, pos)) {
                    return true;
                }
            }
        }

        if (defaultTreeConfiguredFeature.generate(world, chunkGenerator, random, pos)) {
            return true;
        }

        world.setBlockState(pos, state, Block.SKIP_REDRAW_AND_BLOCK_ENTITY_REPLACED_CALLBACK);
        return false;
    }
}
