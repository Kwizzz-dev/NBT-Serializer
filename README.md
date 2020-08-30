## Named Binary Tag (NBT) Serializer
##### This is a utility tool for serializing and deserializing ItemStack NBTs. <br>Feel free to contribute to this project through open issues and pull requests :)
***
#### How to use:
NBT-Serializer is simple to use, initialize the class, by passing an ItemStack,<br>to get access to the provided methods.
This can be used to keep information, potentially stored by other plugins in the NBTs of the ItemStack, even after storing an ItemStack which may have been serialized or not.
More methods such as being able to apply the `NBTTagCompound` back onto the ItemStack or another ItemStack may be added in the future.
<br>
<br>
***
### Initialization:
`NBTSerializer serializer = new NBTSerializer(ItemStack stack);`

Arguments:<br>
ItemStack stack - The ItemStack of which you'd like to serialize the NBT tags of.
<br>
<br>

***
### Serialization:
Now that you've initialized your NBTSerializer object, you have access to the `serialize();` and the `deserialize(byte[] serializedNBT);` methods. This section looks at the usage of the `serialize();` method.<br>

`byte[] serializedNBT = serializer.serialize();`<br>
Using this code, the utility will serialize the NBT tags stored on the passed ItemStack into a byte array so you're able to store the information.
<br>
<br>

***
### Deserialization:
The final method which is provided with NBT-Serializer is the `deserialize(byte[] serializedNBT);` method.

`NBTTagCompound compound = serializer.deserialize(serializedNBT);`<br>
With this data, you can then re-apply the NBT tags onto the ItemStack (may be added to the utility in the future).
<br>
<br>

***
### Contact
NBT-Serializer is developed by straggly. Noticed an issue with the utility you'd like to contact me directly about? <br>
Feel free to contact me through:
- Discord: straggly#2073
- By opening an issue.
- By contributing pull requests.
