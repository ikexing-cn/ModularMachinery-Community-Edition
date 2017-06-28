/*******************************************************************************
 * HellFirePvP / Modular Machinery 2017
 *
 * This project is licensed under GNU GENERAL PUBLIC LICENSE Version 3.
 * The source code is available on github: https://github.com/HellFirePvP/ModularMachinery
 * For further details, see the License file there.
 ******************************************************************************/

package hellfirepvp.modularmachinery.common.util.handlers;

/**
 * This class is part of the Modular Machinery Mod
 * The complete source code for this mod can be found on github.
 * Class: IEnergyHandler
 * Created by HellFirePvP
 * Date: 28.06.2017 / 12:26
 */
public interface IEnergyHandler {

    public IEnergyHandler copy();

    public int getCurrentEnergy();

    public void setCurrentEnergy(int energy);

    public int getMaxEnergy();

    default public int getRemainingCapacity() {
        return getMaxEnergy() - getCurrentEnergy();
    }

}
