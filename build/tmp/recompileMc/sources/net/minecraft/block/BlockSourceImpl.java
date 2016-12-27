package net.minecraft.block;

import net.minecraft.block.state.IBlockState;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockSourceImpl implements IBlockSource
{
    private final World worldObj;
    private final BlockPos pos;

    public BlockSourceImpl(World worldIn, BlockPos posIn)
    {
        this.worldObj = worldIn;
        this.pos = posIn;
    }

    public World getWorld()
    {
        return this.worldObj;
    }

    public double getX()
    {
        return (double)this.pos.getX() + 0.5D;
    }

    public double getY()
    {
        return (double)this.pos.getY() + 0.5D;
    }

    public double getZ()
    {
        return (double)this.pos.getZ() + 0.5D;
    }

    public BlockPos getBlockPos()
    {
        return this.pos;
    }

    /**
     * Gets the block state of this position and returns it. 
     *  @return Block state in this position
     */
    public IBlockState getBlockState()
    {
        return this.worldObj.getBlockState(this.pos);
    }

    public <T extends TileEntity> T getBlockTileEntity()
    {
        return (T)this.worldObj.getTileEntity(this.pos);
    }
}