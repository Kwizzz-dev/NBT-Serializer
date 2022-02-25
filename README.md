# Named Binary Tag (NBT) Serializer
This is an API class for serializing and deserializing ItemStack NBTs. <br>Feel free to contribute to this project through open issues and pull requests :)
***
## How to use
NBT-Serializer is simple to use. Initialize the `NBTSerializer` object by passing an ItemStack to get access to the provided methods.
<br>
This can be used to keep information, potentially stored by other plugins in the NBT data of the ItemStack, even after storing an ItemStack which may have been serialized or not.
<br>
<br>
***
## Initialization
`NBTSerializer serializer = new NBTSerializer(ItemStack stack);`

Arguments:<br>
ItemStack stack - The ItemStack of which you'd like to serialize the NBT tags of.
<br>
<br>

***
## Serialization:
Now that you've initialized your `NBTSerializer` object, you have access to the `serialize();` and the `deserialize(byte[] serializedNBT);` methods. This section looks at the usage of the `serialize();` method.<br>

`byte[] serializedNBT = serializer.serialize();`<br>
This function returns a primitive byte array representing the serialized data found in the NBT of the ItemStack passed in the `NBTSerializer`. Use this array to store data about the ItemStack for easy retrieval.
<br>
<br>
***
## Deserialization
Additionally, the `NBTSerializer` objects holds the `deserialize(byte[] serializedNBT);` method used to deserialize a primitive byte array into a NBTTagCompound object.

`NBTTagCompound compound = serializer.deserialize(serializedNBT);`<br>
This will create a copy of the previous NBT data stored on the ItemStack, you can apply this tag back onto the item or manipulate the data found in the NBT.
<br>
<br>

***
## Contact
Noticed an issue with the utility you'd like to contact me directly about? <br>
Feel free to contact me through:
- By opening an issue.
- By contributing pull requests.
