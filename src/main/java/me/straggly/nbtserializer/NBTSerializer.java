package me.straggly.nbtserializer;

import net.minecraft.server.v1_8_R3.NBTCompressedStreamTools;
import net.minecraft.server.v1_8_R3.NBTTagCompound;
import org.bukkit.craftbukkit.v1_8_R3.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;

public final class NBTSerializer
{
    private ItemStack stack;
    private NBTTagCompound compound;

    /**
     * A serializable implementation of the NMS NBT class.
     *
     * @param stack
     */
    public NBTSerializer(ItemStack stack){
        this.stack = stack;

        try{
            compound = (CraftItemStack.asNMSCopy(this.stack).hasTag()
                    ? CraftItemStack.asNMSCopy(this.stack).getTag()
                    : new NBTTagCompound());
        } catch (Exception e){
            compound = new NBTTagCompound();
        }
    }

    /**
     * Serializes the tag byte array for storage.
     *
     * @return - Serialized NBT Tags
     * @throws IOException - Error serializing NBT tags.
     */
    public byte[] serialize() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        NBTCompressedStreamTools.a(compound, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /**
     * Deserializes the byte array for the NBT tag compound.
     *
     * @return NBT Tag Compound
     * @throws IOException Error reading the byte array.
     */
    public NBTTagCompound deserialize(byte[] serializedNBT) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(serializedNBT);
        return NBTCompressedStreamTools.a(byteArrayInputStream);
    }
}
