/*
 * LibraryEx
 * Copyright (c) 2017-2019 by LogicTechCorp
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package logictechcorp.libraryex.world.biome;

import logictechcorp.libraryex.IModData;
import logictechcorp.libraryex.world.biome.data.BiomeData;
import net.minecraft.world.biome.Biome;

public abstract class BiomeMod<T extends BiomeData> extends Biome
{
    public BiomeMod(IModData data, BiomeProperties properties, String name)
    {
        super(properties);
        this.setRegistryName(data.getModId() + ":" + name);
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
    }

    public abstract T getBiomeData();
}
