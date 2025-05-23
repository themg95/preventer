# Preventer
Preventer is a collection of **over fifty** modules who prevent you from doing certain actions (e.g. accidentally breaking budding amethyst or stripping logs).
Each module can be enabled or disabled individually in game via a config screen (press `I`) or all modules can be temporarily disabled with the _Override Key_ (hold `R`) .

## Modules (Preventer 1.2.2)
<details open>
<summary><b> Interactions </b></summary>

- Prevent log stripping
  - _Prevents you from stripping logs_
- Prevent path creation
  - _Prevents you from creating path blocks_
- Prevent farmland creation
  - _Prevents you from creating farmland_
- Prevent cake eating
  - _Prevents you from eating cakes_
- Prevent copper scraping
  - _Prevents scraping oxidation from copper_
- Prevent copper de-waxing
  - _Prevents de-waxing copper_
- Prevent trapped chest opening
  - _Prevents you from opening trapped chests_
- Prevent firework rocket use
  - _Prevents you from using firework rockets while not flying_
- Prevent bed use
  - _Prevents you using beds in the End or Nether dimension_
- Prevent renamed item using
  - _Prevents you from placing, eating, using, ... items with a custom name (except tools, weapons, and armor)_
- Prevent note block editing
  - _Prevents you from changing the pitch of note blocks_
- Prevent respawn anchor use
  - _Prevents you from using respawn anchors in the overworld and the end_
- Prevent dragon egg teleporting
  - _Prevents you from teleporting the dragon egg by using it_
- Prevent grass block bone mealing
  - _Prevents you from using bone meal on grass blocks (including (warped)nylium)_
- Prevent sign editing
  - _Prevents you from editing signs_
- Prevent chiseled bookshelf interacting
  - _Prevents you from accidentally placing books in chiseled bookshelves or removing them_
</details>

<details>
<summary><b> Plants </b></summary>

- Prevent glow berry harvesting
  - _Prevents you from harvesting Glow Berries_
- Prevent sweet berry harvesting
  - _Prevents you from harvesting Sweet Berries_
- Prevent non-mature crop harvesting
  - _Prevents you from harvesting (breaking) non-mature crops_
- Prevent stem breaking
  - _Prevents you from breaking pumpkin/melon stems_
- Prevent sugar cane breaking
  - _Prevents you from breaking the lowest block of sugar cane/bamboo/cactus_
- Prevent farmland jumping
  - _Prevents you from jumping when on farmland. Note: Due to limitations this does not work when jumping from a non-farmland block to a farmland block_
</details>
 
<details>
<summary><b> Breaking </b></summary>

- Prevent budding amethyst block breaking
  - _Prevents you from breaking budding amethyst blocks_
- Prevent item frame breaking
  - _Prevents you from breaking item frames (and glowing item frames)_
- Prevent painting breaking
  - _Prevents you from breaking paintings_
- Prevent glass breaking
  - _Prevents you from breaking glass and glass panes_
- Prevent suspicious block breaking
  - _Prevents you from breaking suspicious sand and gravel_
- Prevent ender chest destruction
  - _Prevents you from breaking ender chests without a silk touch pickaxe_
- Prevent spawner breaking
  - _Prevents you from breaking monster spawners_
- Prevent chest breaking
  - _Prevents you from breaking chests with an axe_
- Prevent carpet breaking
  - _Prevents you from breaking carpets, including moss carpets_
- Prevent sapling breaking
  - _Prevents you from breaking saplings_
- Prevent immature amethyst breaking
  - _Prevents you from breaking immature amethyst crystals_
- Prevent breaking with weapons
  - _Prevents you from breaking blocks with a sword, trident or mace_
</details>

<details>
<summary><b> Placing </b></summary>

- Prevent coral placing
  - _Prevents you from placing corals out of water_
- Prevent water placing
  - _Prevents you from placing water in the nether_
- Prevent lava placing
  - _Prevents you from placing lava_
- Prevent off-hand placing
  - _Prevents you from placing blocks in your off-hand_
- Prevent berrie planting
  - _Prevents you from planting berries while trying to eat them (Sweet Berries & Glow Berries)_
- Prevent block placing temporary after eating
  - _Temporary prevents you from accidentally placing blocks after eating food_

</details>

<details>
<summary><b> Attacking </b></summary>

- Prevent villager punching
  - _Prevents you from attacking villagers_
- Prevent zombified piglin punching
  - _Prevents you from attacking Zombified Piglins_
- Prevent end crystal hitting
  - _Prevents you from hitting end crystals_
- Prevent golem hitting
  - _Prevents you from attacking iron & snow golems_
- Prevent named mob hitting
  - _Prevents you from attacking mobs with a custom name_
- Prevent tamed animal hitting
  - _Prevents you from attacking animals that have been tamed by a player (e.g. dogs, cats, ...)_
- Prevent rare mob hitting
  - _Prevents you from attacking rare mobs (parrots, axolotls, allays)_
- Prevent horse hitting
  - _Prevents you from attacking horses and similar creatures (Horses (including Skeleton & Zombie Horses), Donkeys, Mules, Llamas, Camels)_
- Prevent neutral mob hitting
  - _Prevents you from hitting neutral mobs (as defined in the minecraft wiki, except Spiders and Endermen)_
- Prevent dolphin attacking
  - _Prevents you from attacking dolphins_
</details>

<details>
<summary><b> Other </b></summary>

- Low durability protection
  - _Prevent tools & weapons from breaking due to low durability_
- Prevent tool dropping
  - _Prevents you from dropping tools out of your hotbar_
- Prevent renamed item dropping
  - _Prevents you from dropping items with a custom name_
- Prevent swimming
  - _Prevents you from sprinting while underwater_
</details>

**_Missing any features? Open an [issue](https://github.com/DasHomi/preventer/issues)!_**

## Compatibility
- Compatible with most other client-side mods
- Compatible with most servers
- Forge support is planned

| Minecraft version   | Latest preventer version |
|---------------------|--------------------------|
| Fabric 1.21.x       | 1.2                      |
| Fabric 1.20.[5-6]   | 1.1                      |
| Fabric 1.20.[3-4]🚩 | 1.1                      |
| Fabric 1.20.[0-2]🚩 | 1.1                      |
| Fabric 1.19.4🚩     | 1.0                      |
| Fabric 1.19.x🚩     | 1.0                      |
| Fabric 1.18.x🚩     | 0.9                      |
🚩= Won't receive updates to newer Preventer versions

## Dependencies
**Required:**
- [Cloth Config](https://github.com/shedaniel/cloth-config)
- [Fabric API](https://github.com/FabricMC/fabric)
